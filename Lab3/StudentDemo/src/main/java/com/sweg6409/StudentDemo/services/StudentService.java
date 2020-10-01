package com.sweg6409.StudentDemo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sweg6409.StudentDemo.controllers.repositories.StudentRepository;
import com.sweg6409.StudentDemo.models.Student;

@Service
public class StudentService {
	
	List<Student> studentList = new ArrayList<>();
	
	@Autowired
	StudentRepository studentRepository;
	//create
	public Student createStudent(Student stu){
		studentList.add(stu);
		return stu;
	}
	
	//read
	//Return list of students
	public List<Student> findAllStudents(){
		return (List<Student>) studentRepository.findAll();
	}
	//update
	public void updateStudent(Integer id, Student s) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(id)) {
				studentList.set(i, s);
			}
		}
	}
	//delete
	public void deleteStudent(Integer id) {
		studentList = studentList.stream().filter(s -> s.getId() != id).collect(Collectors.toList());
	}
}
