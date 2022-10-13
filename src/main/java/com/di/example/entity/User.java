package com.di.example.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Component;

import lombok.Data;

@MappedSuperclass
@Data
@Component
public abstract class User implements VerifiableUser {

	@Id
	@Column(name = "userId", columnDefinition = "BINARY(16)")
	@GeneratedValue
	private UUID userId;

	@Column(name = "email", length = 128)
	public String email;

	@Column(name = "password", length = 128)
	public String passsword;

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt;

	@Column(name = "created_at", updatable = false)
	@CreatedDate
	private LocalDateTime createdAt;

	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;

	@Column(name = "is_deleted")
	private Boolean isDeleted;
}