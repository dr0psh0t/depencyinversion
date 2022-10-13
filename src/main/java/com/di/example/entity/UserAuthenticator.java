package com.di.example.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class UserAuthenticator {

	private final VerifiableUser theUser;

	@Autowired
	public UserAuthenticator(VerifiableUser theUser) {
		this.theUser = theUser;
	}

	public void authenticateUser() {
		theUser.authenticate();
	}
}