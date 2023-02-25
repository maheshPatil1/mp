package com.pune.qspider.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pune.qspider.entity.Course;
import com.pune.qspider.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course)
	{
		return courseService.addCourse(course) ;
	}
	
     @DeleteMapping("/course")
     public long removeCourse(@PathVariable Long id)
     {
    	 courseService.removeCourse(id);
    	 return id;
     }
      public long removeCourse(@PathVariable Long id)
     {
    	 courseService.removeCourse(id);
    	 return id;
     }

     
     @GetMapping("/course/{id}")
     public Optional<Course> getCourse(@PathVariable Long id)
     {
    	 return  courseService.getCourse(id);
     }
     
}
