package com.bugpigg.game.auth.controller.dto;

import com.bugpigg.game.auth.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberSignUpResponseDto {

    private String userName;

    public static MemberSignUpResponseDto of(Member member) {
        return new MemberSignUpResponseDto(member.getUserName());
    }
}
