package com.Yadhu.GIGHUB.services;

import com.Yadhu.GIGHUB.model.CustomUserDetails;
import com.Yadhu.GIGHUB.model.User;
import com.Yadhu.GIGHUB.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository repository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
      User user = repository.findByEmail(email);
        return new CustomUserDetails(user);
    }
}
