package com.moonminder.api.member.web.dto;

import com.moonminder.api.member.domain.Member;
import com.moonminder.api.member.domain.MemberType;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@NoArgsConstructor
public class SignupRequest {

    private String name;
    private String email;
    private String password;
    private MemberType type;

    public Member toMember() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        return Member.builder()
                .name(name)
                .email(email)
                .password(encoder.encode(password))
                .type(type)
                .build();
    }
}

