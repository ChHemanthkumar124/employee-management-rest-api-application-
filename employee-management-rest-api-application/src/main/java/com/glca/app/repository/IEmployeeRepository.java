package com.glca.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glca.app.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();

	List<Employee> findAllByOrderByFirstNameDesc();

}