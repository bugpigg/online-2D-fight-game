package com.bugpigg.game.common.service;

import com.bugpigg.game.auth.token.TokenProvider;
import com.bugpigg.game.common.controller.dto.UserInfoResponseDto;
import io.jsonwebtoken.Claims;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommonService {

    private final TokenProvider tokenProvider;

    public UserInfoResponseDto getUserInfo(String accessToken) {
        if (tokenProvider.validateToken(accessToken)) {
            Claims tokenClaims = tokenProvider.parseClaims(accessToken);
            return new UserInfoResponseDto(tokenClaims.getSubject());
        } else {
            throw new RuntimeException("Token Validation Failed");
        }
    }
}
