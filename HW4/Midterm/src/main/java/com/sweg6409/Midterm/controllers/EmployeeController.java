package com.sweg6409.Midterm.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sweg6409.Midterm.models.Employee;
import com.sweg6409.Midterm.services.EmployeeService;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//read
	@GetMapping("/api/v1/employees")
	public ArrayList<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	//create
	@PostMapping("/api/v1/employees")
	public Employee createEmployee(@RequestBody Employee employee){
		return employeeService.createEmployee(employee);

	}
	
	//update
	@PutMapping("/api/v1/employees/{id}")
	public String updateEmployee(@PathVariable("id") Integer id,@RequestBody Employee employee) {
		employeeService.updateEmployee(id, employee);
		return "Updated";
		
	}
	
	//delete
	@DeleteMapping("/api/v1/employees/{id}")
	public String deleteEmployee(@PathVariable("id") Integer id) {
		employeeService.deletePatient(id);
		return "Deleted";
		
	}
}
