package com.sweg6409.Midterm.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sweg6409.Midterm.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
