package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService { 
	@Autowired
	private EmployeeRepository repo;
	
    public Employee saveEmployee(Employee employee) throws EmployeeAlreadyExistsException   {
	        if (repo.existsById(employee.getId())) {
	            throw new EmployeeAlreadyExistsException("Employee already exists in the database  id:" + employee.getId());
	        }
	        return repo.save(employee);
	 }
	 public List<Employee> getEmployee(){
		 return repo.findAll();
	 }
	 public List<Employee> findByOrderBySalaryDesc() {
		return repo.findAll(Sort.by("salary").descending().and(Sort.by("name")));
	 }
	 public Employee UpdateEmployee(Employee employee,int salary) {
		 Employee ExistingEmployee=repo.findBySalary(salary);
		 ExistingEmployee.setSalary(employee.getSalary());
   		return repo.save(ExistingEmployee);
		 
	 }
	
}
