package com.project.studententity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.studententity.dto.UserRegistrationDto;
import com.project.studententity.entity.Login;

public interface UserService extends UserDetailsService{
	Login save(UserRegistrationDto registrationDto);
}
