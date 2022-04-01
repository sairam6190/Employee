package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/post")
	public Employee saveEmployee(@RequestBody Employee employee) throws EmployeeAlreadyExistsException {
	  return service.saveEmployee(employee);	
	}
//	nothing
	@GetMapping("/get")
	public List<Employee> getEmployee() {
		return service.getEmployee();
	}
	@GetMapping("/name")
	public List<Employee> getEmployeebyid() {
		return service.findByOrderBySalaryDesc();
	}
	@PutMapping("/update/{salary}")
	public Employee UpdateEmployee(@RequestBody Employee employee,@PathVariable int salary) {
		return service.UpdateEmployee(employee, salary);	
	}

}
