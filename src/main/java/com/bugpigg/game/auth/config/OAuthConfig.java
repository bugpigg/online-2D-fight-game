package com.bugpigg.game.auth.config;

import com.bugpigg.game.auth.config.property.OAuthProperties;
import com.bugpigg.game.auth.repository.OAuthProviderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
@EnableConfigurationProperties(OAuthProperties.class)
public class OAuthConfig {

    private final OAuthProperties properties;

    @Bean
    public OAuthProviderRepository oAuthProviderRepository() {
        return new OAuthProviderRepository(OAuthProperties.getOAuthProviders(properties));
    }
}
