package com.examples.empapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.empapp.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Integer> {

}
