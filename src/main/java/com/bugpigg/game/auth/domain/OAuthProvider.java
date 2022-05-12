package com.bugpigg.game.auth.domain;

import com.bugpigg.game.auth.config.property.OAuthProperties;
import lombok.Getter;

@Getter
public class OAuthProvider {
    private final String clientId;
    private final String clientSecret;
    private final String redirectUri;
    private final String tokenUri;
    private final String userInfoUri;

    public OAuthProvider(OAuthProperties.User user, OAuthProperties.Provider provider) {
        this.clientId = user.getClientId();
        this.clientSecret = user.getClientSecret();
        this.redirectUri = user.getRedirectUri();
        this.tokenUri = provider.getTokenUri();
        this.userInfoUri = provider.getUserInfoUri();
    }
}
