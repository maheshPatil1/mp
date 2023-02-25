package com.pune.qspider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pune.qspider.entity.Student;
import com.pune.qspider.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	
	
	
	
	
     @DeleteMapping("/student/{id}")
     public long removeStudent(@PathVariable Long id)
     {
    	 studentService.removeStudent(id);
    	 return id;
     }
}
