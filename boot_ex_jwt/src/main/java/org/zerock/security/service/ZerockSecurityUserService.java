package org.zerock.security.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.zerock.admin.domain.Member;
import org.zerock.admin.domain.MemberRole;
import org.zerock.security.domain.ZerockSecurityUser;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Service
public class ZerockSecurityUserService implements UserDetailsService {

 
    public UserDetails loadUserByUsername(String username) {
    	
    	System.out.println("loadUserByUsername: " + username);
    	
    	Member member = new Member();
    	member.setUid("user00");
    	member.setUpw("pw00");
    	member.setUname("사용자00");
    	member.setRoles(Arrays.asList(new MemberRole("ADMIN")));
    	
		return new ZerockSecurityUser(member);
        
    }
}