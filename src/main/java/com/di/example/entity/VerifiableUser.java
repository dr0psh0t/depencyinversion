package com.di.example.entity;

import org.springframework.stereotype.Component;

@Component
public interface VerifiableUser {
	void authenticate() throws NotAccountUserException, NotAdminUserException;
}
