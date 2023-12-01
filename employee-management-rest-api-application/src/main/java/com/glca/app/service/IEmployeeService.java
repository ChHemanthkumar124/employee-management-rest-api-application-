package com.glca.app.service;

import java.util.List;

import com.glca.app.entity.Employee;

public interface IEmployeeService {

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	Employee getEmployeeById(long employeeId);

	List<Employee> getAllEmployees();

	boolean deleteEmployee(long employeeId);

	List<Employee> searchByFirstName(String firstName);

	List<Employee> sortByFirstNameAsc();

	List<Employee> sortByFirstNameDesc();

}
