package com.zenjade.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenjade.crud.models.Employee;
import com.zenjade.crud.models.EmployeeRepo;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepo emp;

public void createEmployee(Employee employee) {
	 emp.save(employee);
}
public String deleteEmployee(Long id) {
	try {
		emp.deleteById(id);
		return "Deleted Successfully";
	}
	catch(Exception e){
		return "An Error Occured";
	}
}
public List<Employee> getEmployees() {
	return emp.findAll();
}
public Employee updateEmployee(Long id,Employee employee) {
	Employee existingEmp = emp.findById(id).orElse(null);
	existingEmp.setName(employee.getName());
	existingEmp.setRole(employee.getRole());
	existingEmp.setSalary(employee.getSalary());
	return emp.save(existingEmp);
}
}
