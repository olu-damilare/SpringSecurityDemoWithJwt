package com.example.springBootSecurityDemo.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface ApplicationUserDAO {

    Optional<ApplicationUser> selectApplicationUserByUserName(String username);

}
