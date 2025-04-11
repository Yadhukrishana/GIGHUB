package com.Yadhu.GIGHUB.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private final User user;  // your custom User entity (com.Yadhu.GIGHUB.model.User)

    public CustomUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // You can implement role-based authorities here later
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword(); // assuming your custom User has a getPassword()
    }

    @Override
    public String getUsername() {
        return user.getEmail(); // assuming your custom User has a getUsername()
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public User getUser() {
        return user;
    }
}
