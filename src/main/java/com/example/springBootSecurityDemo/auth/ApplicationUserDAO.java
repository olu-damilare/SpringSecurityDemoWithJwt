package com.example.springBootSecurityDemo.auth;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface ApplicationUserDAO {

    Optional<ApplicationUser> selectApplicationUserByUserName(String username);

}
