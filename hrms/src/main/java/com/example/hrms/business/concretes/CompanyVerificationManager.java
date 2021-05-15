package com.example.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.CompanyVerificationService;
import com.example.hrms.dataAccess.abstracts.CompanyVerificationDao;

@Service
public class CompanyVerificationManager implements CompanyVerificationService {

	CompanyVerificationDao companyVerificationDao;

	@Autowired
	public CompanyVerificationManager(CompanyVerificationDao companyVerificationDao) {
		super();
		this.companyVerificationDao = companyVerificationDao;
	}
}
