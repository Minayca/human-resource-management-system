package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="company_verifications")
public class CompanyVerification {
	
	@Id
	@GeneratedValue
	@Column(name="company_verification_id")
	private int companyVerificationId;
	
	@Column(name="staff_id")
	private int staffId;
	
	@Column(name="employer_id")
	private int employerId;
}
