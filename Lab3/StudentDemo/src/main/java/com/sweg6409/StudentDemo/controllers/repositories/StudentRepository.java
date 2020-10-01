package com.sweg6409.StudentDemo.controllers.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sweg6409.StudentDemo.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
