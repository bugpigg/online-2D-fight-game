package com.bugpigg.game.auth.config.property;

import com.bugpigg.game.auth.domain.OAuthProvider;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties(prefix = "oauth2")
public class OAuthProperties {

    private final Map<String, User> user = new HashMap<>();

    private final Map<String, Provider> provider = new HashMap<>();

    @Getter
    @Setter
    public static class User {

        private String clientId;
        private String clientSecret;
        private String redirectUri;
    }

    @Getter
    @Setter
    public static class Provider {

        private String tokenUri;
        private String userInfoUri;
    }

    public static Map<String, OAuthProvider> getOAuthProviders(OAuthProperties properties) {
        Map<String, OAuthProvider> oauthProviders = new HashMap<>();
        properties.getUser()
            .forEach((key, user) -> {
                Provider provider = properties.getProvider().get(key);
                OAuthProvider oAuthProvider = new OAuthProvider(user,provider);
                oauthProviders.put(key, oAuthProvider);
            });
        return oauthProviders;
    }
}
