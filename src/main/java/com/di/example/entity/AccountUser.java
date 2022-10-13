package com.di.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Table(name = "account_user")
@Data
@Component
public class AccountUser extends User {

	@Column(name = "first_name", length = 64)
	private String firstname;

	@Column(name = "last_name", length = 64)
	private String lastname;

	@Column(name = "birth_date")
	private LocalDate birthdate;

	@Override
	public void authenticate() {
		System.out.println("Hi "+email+" you are authenticated.");
	}
}