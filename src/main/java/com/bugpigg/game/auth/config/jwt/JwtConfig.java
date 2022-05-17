package com.bugpigg.game.auth.config.jwt;

import com.bugpigg.game.auth.token.TokenProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Value("${jwt.secret}")
    private String jwtSecret;
    @Value("${app.auth.accessTokenExpireTime}")
    private String accessTokenExpireTime;
    @Value("${app.auth.refreshTokenExpireTime}")
    private String refreshTokenExpireTime;

    @Bean
    public TokenProvider jwtProvider() {
        return new TokenProvider(
            jwtSecret,
            Long.parseLong(accessTokenExpireTime),
            Long.parseLong(refreshTokenExpireTime)
        );
    }
}
