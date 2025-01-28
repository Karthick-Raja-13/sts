package com.zenjade.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zenjade.crud.models.Employee;
import com.zenjade.crud.services.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
EmployeeService service;
@GetMapping("/")
public List<Employee> getAll(){
	return service.getEmployees();
}
@PostMapping("/")
public List<Employee> create(@RequestBody Employee emp){
	service.createEmployee(emp);
	return service.getEmployees();
} 
@PutMapping("/{id}")
public List<Employee> update(@PathVariable Long id,@RequestBody Employee emp){
	service.updateEmployee(id,emp);
	return service.getEmployees();
}@DeleteMapping("/{id}")
public List<Employee> delete(@PathVariable Long id){
	service.deleteEmployee(id);
	return service.getEmployees();
}
}
