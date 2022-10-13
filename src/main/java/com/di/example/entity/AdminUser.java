package com.di.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Table(name = "admin_user")
@Data
@Component
public class AdminUser extends User {

	@Column(name = "department", length = 64)
	private String department;

	@Column(name = "employee_rank", length = 64)
	private String employeeRank;

	@Override
	public void authenticate() {
		System.out.println("Hi "+email+" you are authenticated.");
	}
}