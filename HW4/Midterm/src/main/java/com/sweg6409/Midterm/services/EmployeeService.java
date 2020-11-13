package com.sweg6409.Midterm.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sweg6409.Midterm.models.Employee;
import com.sweg6409.Midterm.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	//read
	public ArrayList<Employee> getAllEmployee(){
		return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
	//create
	public Employee createEmployee(Employee emp) {
		employeeRepository.save(emp);
		return emp;
		
	}
	
	//update
	public void updateEmployee(Integer id, Employee employee) {
		 Employee updateEmployee = employeeRepository.findById(id).get();
		 updateEmployee.setName(employee.getName());
		 updateEmployee.setTitle(employee.getTitle());
		 employeeRepository.save(updateEmployee);
	}
	//delete
	public void deletePatient(Integer id) {
		employeeRepository.deleteById(id);
	}
}
