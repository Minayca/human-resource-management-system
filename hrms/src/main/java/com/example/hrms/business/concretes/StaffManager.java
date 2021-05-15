package com.example.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.StaffService;
import com.example.hrms.dataAccess.abstracts.StaffDao;

@Service
public class StaffManager implements StaffService {

	StaffDao staffDao;

	@Autowired
	public StaffManager(StaffDao staffDao) {
		super();
		this.staffDao = staffDao;
	}
}
