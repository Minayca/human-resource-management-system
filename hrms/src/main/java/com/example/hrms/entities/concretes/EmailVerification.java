package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="email_verifications")
public class EmailVerification {
	
	@Id
	@GeneratedValue
	@Column(name="email_verification_id")
	private int emailVerificationId;
	
	@Column(name="user_id")
	private int userId;
}
