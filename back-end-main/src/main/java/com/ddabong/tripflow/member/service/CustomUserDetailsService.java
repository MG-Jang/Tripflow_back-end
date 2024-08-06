package com.ddabong.tripflow.member.service;

import com.ddabong.tripflow.member.dao.IMemberRepository;
import com.ddabong.tripflow.member.dto.CustomUserDetails;
import com.ddabong.tripflow.member.model.Member;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final IMemberRepository iMemberRepository;

    public CustomUserDetailsService(IMemberRepository iMemberRepository){
        this.iMemberRepository = iMemberRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Member member = iMemberRepository.findByUserId(userId);

        if(member != null){
            return new CustomUserDetails(member);
        }
        return null;
    }
}
