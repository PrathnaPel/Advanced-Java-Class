package com.sweg6409.StudentDemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sweg6409.StudentDemo.models.Student;
import com.sweg6409.StudentDemo.services.StudentService;

@RestController
public class StudentController {
	
	StudentService studentService = new StudentService();
	
	//create
	@PostMapping("/api/v1/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
		
	}
	//read
	@GetMapping("/api/v1/students")
	public List<Student> findAllStudent(){
		return studentService.findAllStudents();
	}
	//update
	@PutMapping("/api/v1/students/{id}")
	public String updateStudent(@PathVariable("id") Integer id, @RequestBody Student student){
		studentService.updateStudent(id, student);
		return "Student with Id " + id + " has been updated!";
		
	}
	//delete
	@DeleteMapping("/api/v1/students/{id}")
	public String deleteStudent(@PathVariable("id") Integer id){
		studentService.deleteStudent(id);
		return "Student with Id "+id+ " has been deleted!";
	}

}
