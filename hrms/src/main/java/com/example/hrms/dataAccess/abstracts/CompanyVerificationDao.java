package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.CompanyVerification;

public interface CompanyVerificationDao extends JpaRepository<CompanyVerification, Integer> {

}
