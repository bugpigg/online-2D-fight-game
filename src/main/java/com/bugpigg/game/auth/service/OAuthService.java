package com.bugpigg.game.auth.service;

import com.bugpigg.game.auth.domain.OAuthProvider;
import com.bugpigg.game.auth.domain.OAuthProviderType;
import com.bugpigg.game.auth.domain.UserProfile;
import com.bugpigg.game.auth.dto.OAuthTokenResponse;
import com.bugpigg.game.auth.repository.OAuthProviderRepository;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Service
public class OAuthService {

    private final OAuthProviderRepository providerRepository;

    public void login(String providerName, String code) {
        OAuthProvider provider = providerRepository.findByProviderName(providerName);

        OAuthTokenResponse tokenResponse = getToken(code, provider);

        UserProfile userProfile = getUserProfile(providerName, tokenResponse, provider);

    }

    private OAuthTokenResponse getToken(String code, OAuthProvider provider) {
        return WebClient.create()
            .post()
            .uri(provider.getTokenUri())
            .headers(header -> {
                header.setBasicAuth(provider.getClientId(), provider.getClientSecret());
                header.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
                header.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
                header.setAcceptCharset(Collections.singletonList(StandardCharsets.UTF_8));
            })
            .bodyValue(tokenRequest(code, provider))
            .retrieve()
            .bodyToMono(OAuthTokenResponse.class)
            .block();
    }

    private MultiValueMap<String, String> tokenRequest(String code, OAuthProvider provider) {
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("code", code);
        formData.add("grant_type", "authorization_code");
        formData.add("redirect_uri", provider.getRedirectUri());
        return formData;
    }

    private UserProfile getUserProfile(String providerName, OAuthTokenResponse tokenResponse,
        OAuthProvider provider) {
        Map<String, Object> userAttributes = getUserAttribute(provider, tokenResponse);
        return OAuthProviderType.extract(providerName, userAttributes);
    }

    private Map<String, Object> getUserAttribute(OAuthProvider provider,
        OAuthTokenResponse tokenResponse) {
        return WebClient.create()
            .get()
            .uri(provider.getUserInfoUri())
            .headers(header -> header.setBearerAuth(tokenResponse.getAccessToken()))
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<Map<String, Object>>() {})
            .block();
    }
}
