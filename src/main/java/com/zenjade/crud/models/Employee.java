package com.zenjade.crud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String role;
private Long salary;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Long getSalary() {
	return salary;
}
public void setSalary(Long salary) {
	this.salary = salary;
}

}
