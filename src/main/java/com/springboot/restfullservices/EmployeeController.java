package com.springboot.restfullservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@GetMapping(path="/employee/{id}")
	public Employee getById(@PathVariable int id)
	{
		return service.getById(id);
	}
	@PostMapping(path="/insert")
	public void insert(@RequestBody Employee e)
	{
		service.insert(e);
	}
	@DeleteMapping(path="/deletee/{id}")
	public void delete(@PathVariable int id)
	{
		service.delete(id);
		System.out.println("Successfully deleted");
	}
}
