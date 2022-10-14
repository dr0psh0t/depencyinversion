package com.di.example.entity;

public class NotAdminUserException extends Exception {
	public NotAdminUserException(String msg) {
		super(msg);
	}
}
