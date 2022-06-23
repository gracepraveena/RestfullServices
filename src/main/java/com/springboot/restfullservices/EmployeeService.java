package com.springboot.restfullservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	MyRepository repo;

	public Employee getById(int id) {
		return repo.findById(id).get();
	}

	public void insert(Employee e) {
		repo.save(e);
	}

	public void delete(int id) {
		repo.deleteById(id);
	}
	
	
}
