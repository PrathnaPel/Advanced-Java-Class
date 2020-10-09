package com.sweg6409.Course.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sweg6409.Course.models.Course;
import com.sweg6409.Course.services.CourseService;

@RestController
@CrossOrigin("*")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/api/v1/course")
	public ArrayList<Course> getAllCourses(){
		return courseService.getAllCourses();
	}

}
