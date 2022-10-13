package com.di.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.di.example.entity.AccountUser;
import com.di.example.entity.AdminUser;
import com.di.example.entity.UserAuthenticator;

@SpringBootApplication
public class DependencyinversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyinversionApplication.class, args);

		AccountUser accountUser = new AccountUser();
		accountUser.setEmail("user@gmail.com");
		accountUser.setPasssword("userpassword");

		AdminUser adminUser = new AdminUser();
		adminUser.setEmail("admin@gmail.com");
		adminUser.setPasssword("adminpassword");

		UserAuthenticator userAuthenticator = new UserAuthenticator(accountUser);
		userAuthenticator.authenticateUser();

		UserAuthenticator adminAuthenticator = new UserAuthenticator(accountUser);
		adminAuthenticator.authenticateUser();
	}

}