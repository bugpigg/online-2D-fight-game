package com.bugpigg.game.auth.controller;

import com.bugpigg.game.auth.service.OAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OAuthController {

    private final OAuthService oAuthService;

    @GetMapping("/login/oauth/{provider}")
    public void login(@PathVariable String provider, @RequestParam String code){
        oAuthService.login(provider, code);
    }
}
