package com.bugpigg.game.auth.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class UserProfile {

    private final String accountId;
    private final String email;
    private final String imageUri;

}
