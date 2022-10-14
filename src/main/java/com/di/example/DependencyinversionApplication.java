package com.di.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.di.example.entity.AccountUser;
import com.di.example.entity.AdminUser;
import com.di.example.entity.NotAccountUserException;
import com.di.example.entity.NotAdminUserException;
import com.di.example.entity.UserAuthenticator;

@SpringBootApplication
public class DependencyinversionApplication {

	public static void main(String[] args) throws NotAdminUserException, NotAccountUserException {
		SpringApplication.run(DependencyinversionApplication.class, args);

		AccountUser accountUser = new AccountUser();
		accountUser.setEmail("user@gmail.com");
		accountUser.setPasssword("userpassword");

		AdminUser adminUser = new AdminUser();
		adminUser.setEmail("admin@gmail.com");
		adminUser.setPasssword("adminpassword");

		//accountUser.setLastname("Dagondon");
		//adminUser.setDepartment("Dev");

		try {
			UserAuthenticator userAuthenticator = new UserAuthenticator(accountUser);
			userAuthenticator.authenticateUser();

		} catch (NotAccountUserException e1) {

			try {
				UserAuthenticator adminAuthenticator = new UserAuthenticator(adminUser);
				adminAuthenticator.authenticateUser();

			} catch (NotAdminUserException e2) {
				System.err.println(e2);
			}
		}
	}
}