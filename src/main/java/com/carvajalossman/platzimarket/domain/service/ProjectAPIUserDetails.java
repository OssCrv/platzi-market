package com.carvajalossman.platzimarket.domain.service;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ProjectAPIUserDetails implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username)
    throws UsernameNotFoundException {
    return new User("Ossman", "{noop}%CkGkJK8WZz8&Ew", new ArrayList<>());
  }
}
