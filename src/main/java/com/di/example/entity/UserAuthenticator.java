package com.di.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAuthenticator {

	private final VerifiableUser accountUser;
	private final VerifiableUser adminUser;

	@Autowired
	public UserAuthenticator(VerifiableUser accountUser, VerifiableUser adminUser) {
		this.accountUser = accountUser;
		this.adminUser = adminUser;
	}

	public boolean isAccountUserAuthenticated() {
		return true;
	}

	public boolean isAdminUserAuthenticated() {
		return true;
	}
}
