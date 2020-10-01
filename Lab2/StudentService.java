package com.sweg6409.StudentDemo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sweg6409.StudentDemo.models.Student;

public class StudentService {
	
	List<Student> studentList = new ArrayList<>();
	
	//create
	public Student createStudent(Student stu){
		studentList.add(stu);
		return stu;
	}
	
	//read
	//Return list of students
	public List<Student> findAllStudents(){
		return studentList;
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
