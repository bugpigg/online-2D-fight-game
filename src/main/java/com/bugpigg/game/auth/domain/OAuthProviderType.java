package com.bugpigg.game.auth.domain;

import java.util.Arrays;
import java.util.Map;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OAuthProviderType {
    GITHUB("github") {
        @Override
        public UserProfile of(Map<String, Object> attributes) {
            return UserProfile.builder()
                .accountId(String.valueOf(attributes.get("login")))
                .email((String) attributes.get("email"))
                .imageUri((String) attributes.get("avatar_url"))
                .build();
        }
    };

    private final String providerName;

    public static UserProfile extract(String providerName, Map<String, Object> attributes) {
        return Arrays.stream(values())
            .filter(provider -> providerName.equals(provider.providerName))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new)
            .of(attributes);
    }

    public abstract UserProfile of(Map<String, Object> attributes);
}
