package com.glca.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glca.app.entity.Employee;
import com.glca.app.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee updatedEmployee = getEmployeeById(employee.getId());
		updatedEmployee.setFirstName(employee.getFirstName());
		updatedEmployee.setLastName(employee.getLastName());
		updatedEmployee.setEmailId(employee.getEmailId());
		employeeRepository.save(updatedEmployee);
		return updatedEmployee;
	}

	@Override
	public Employee getEmployeeById(long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public boolean deleteEmployee(long employeeId) {
		employeeRepository.deleteById(employeeId);
		return true;
	}

	@Override
	public List<Employee> searchByFirstName(String firstName) {
		return employeeRepository.findByFirstNameContainsAllIgnoreCase(firstName);
	}

	@Override
	public List<Employee> sortByFirstNameAsc() {
		return employeeRepository.findAllByOrderByFirstNameAsc();
	}

	@Override
	public List<Employee> sortByFirstNameDesc() {
		return employeeRepository.findAllByOrderByFirstNameDesc();
	}

}