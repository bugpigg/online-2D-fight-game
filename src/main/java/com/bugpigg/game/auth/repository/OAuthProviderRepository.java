package com.bugpigg.game.auth.repository;

import com.bugpigg.game.auth.domain.OAuthProvider;
import java.util.Map;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OAuthProviderRepository {

    private final Map<String, OAuthProvider> providers;

    public OAuthProvider findByProviderName(String name) {
        return providers.get(name);
    }
}
