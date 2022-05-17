package com.bugpigg.game.auth.service;

import com.bugpigg.game.auth.controller.dto.MemberLoginRequestDto;
import com.bugpigg.game.auth.controller.dto.MemberSignUpRequestDto;
import com.bugpigg.game.auth.controller.dto.MemberSignUpResponseDto;
import com.bugpigg.game.auth.controller.dto.TokenReissueRequestDto;
import com.bugpigg.game.auth.controller.dto.TokenResponseDto;
import com.bugpigg.game.auth.domain.Member;
import com.bugpigg.game.auth.domain.RefreshToken;
import com.bugpigg.game.auth.repository.MemberRepository;
import com.bugpigg.game.auth.repository.RefreshTokenRepository;
import com.bugpigg.game.auth.token.TokenProvider;
import com.bugpigg.game.auth.token.TokenSet;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final MemberRepository memberRepository;
    private final RefreshTokenRepository refreshTokenRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final TokenProvider tokenProvider;

    @Transactional
    public MemberSignUpResponseDto signUp(MemberSignUpRequestDto requestDto) {
        Member member = requestDto.toMember(passwordEncoder);
        memberRepository.save(member);
        return MemberSignUpResponseDto.of(member);
    }

    @Transactional
    public TokenResponseDto login(MemberLoginRequestDto requestDto) {
        UsernamePasswordAuthenticationToken authenticationToken = requestDto.toAuthentication();

        Authentication authentication = authenticationManagerBuilder.getObject()
            .authenticate(authenticationToken);

        TokenSet tokenSet = tokenProvider.generateToken(authentication);

        RefreshToken refreshToken = RefreshToken.builder()
            .key(authentication.getName())
            .value(tokenSet.getRefreshToken())
            .build();

        refreshTokenRepository.save(refreshToken);

        return TokenResponseDto.of(tokenSet);
    }

    @Transactional
    public TokenResponseDto reissue(TokenReissueRequestDto tokenRequestDto) {
        if (!tokenProvider.validateToken(tokenRequestDto.getRefreshToken())) {
            throw new RuntimeException("Refresh Token is not valid");
        }

        Authentication authentication = tokenProvider.getAuthentication(
            tokenRequestDto.getAccessToken());

        RefreshToken refreshToken = refreshTokenRepository.findByKey(authentication.getName())
            .orElseThrow(() -> new RuntimeException("Current user not exist"));

        if (!refreshToken.getValue().equals(tokenRequestDto.getRefreshToken())) {
            throw new RuntimeException("token info not match");
        }

        TokenSet tokenSet = tokenProvider.generateToken(authentication);

        RefreshToken newRefreshToken = refreshToken.updateValue(tokenSet.getRefreshToken());
        refreshTokenRepository.save(newRefreshToken);

        return TokenResponseDto.of(tokenSet);
    }
}
