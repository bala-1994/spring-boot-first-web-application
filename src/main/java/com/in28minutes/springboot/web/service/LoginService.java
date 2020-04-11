package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LoginService {
	
	public boolean validateUser(String userId,String password) {
		return userId.equalsIgnoreCase("bala") && password.equalsIgnoreCase("12345");
		
	}

}
