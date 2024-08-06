package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.utils.AppSecurity;

@Configuration
public class AppConfig {
	
	
	public AppConfig() {
		System.out.println("AppConfig :: constructor...");
	}
	
	@Bean   //to create obj manually and call by IOC, use this annotation 
	AppSecurity security() {
		AppSecurity as = new AppSecurity();
				
				// logic comes here
		
				return as;
	}

}
