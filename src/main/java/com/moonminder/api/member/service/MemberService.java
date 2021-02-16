package com.moonminder.api.member.service;

import com.moonminder.api.member.domain.Member;
import com.moonminder.api.member.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public Member loadUserByUsername(String email) throws UsernameNotFoundException {
        return memberRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(email));
    }
}
