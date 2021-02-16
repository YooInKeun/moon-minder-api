package com.moonminder.api.member.web;

import com.moonminder.api.member.service.MemberService;
import com.moonminder.api.member.web.dto.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public String signup(SignupRequest signupRequest) {
        memberService.save(signupRequest.toMember());
        return "redirect:/login";
    }
}
