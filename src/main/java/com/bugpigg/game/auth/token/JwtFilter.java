package com.bugpigg.game.auth.token;

import com.bugpigg.game.auth.repository.RefreshTokenRepository;
import com.bugpigg.game.auth.util.HeaderParser;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

    private final TokenProvider tokenProvider;
    private final RefreshTokenRepository refreshTokenRepository;

    @Override
    protected void doFilterInternal(
        HttpServletRequest request, HttpServletResponse response, FilterChain filterChain
    ) throws ServletException, IOException {

        String accessTokenToValidate = HeaderParser.getAccessRequestToken(request);

        if (StringUtils.hasText(accessTokenToValidate) &&
            tokenProvider.validateToken(accessTokenToValidate)) {
            Authentication authentication = tokenProvider.getAuthentication(accessTokenToValidate);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        filterChain.doFilter(request, response);
    }
}
