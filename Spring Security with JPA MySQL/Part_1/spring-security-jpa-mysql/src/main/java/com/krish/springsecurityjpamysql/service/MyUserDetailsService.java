package com.krish.springsecurityjpamysql.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Qualifier("user_details_service")
public class MyUserDetailsService implements UserDetailsService {

    //If this method returns UserDetails anyway either through JPA or by files system
    // as long as it verifies the user credentials Spring security is happy
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new MyUserDetails(s);
    }
}
