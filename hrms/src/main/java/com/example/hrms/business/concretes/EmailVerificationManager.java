package com.example.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmailVerificationService;
import com.example.hrms.dataAccess.abstracts.EmailVerificationDao;

@Service
public class EmailVerificationManager implements EmailVerificationService {

	EmailVerificationDao emailVerificationDao;

	@Autowired
	public EmailVerificationManager(EmailVerificationDao emailVerificationDao) {
		super();
		this.emailVerificationDao = emailVerificationDao;
	}
}
