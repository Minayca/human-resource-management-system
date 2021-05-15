package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Staff;

public interface StaffDao extends JpaRepository<Staff, Integer> {

}
