package com.bugpigg.game.common.controller;

import com.bugpigg.game.auth.util.HeaderParser;
import com.bugpigg.game.common.controller.dto.UserInfoResponseDto;
import com.bugpigg.game.common.service.CommonService;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class CommonController {

    private final CommonService commonService;

    @GetMapping("/user-info")
    public ResponseEntity<UserInfoResponseDto> userInfo(HttpServletRequest request) {
        return ResponseEntity.ok(commonService.getUserInfo(HeaderParser.getAccessRequestToken(request)));
    }
}
