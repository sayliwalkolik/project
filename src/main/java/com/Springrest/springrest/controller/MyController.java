package com.Springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springrest.springrest.entities.Course;
import com.Springrest.springrest.services.CourseService;


@RestController 
public class MyController {
	 @Autowired
	  private CourseService courseSeivice;
	
	 
    @GetMapping("/home")
	public String home()
	{
		return "welcome to home page";
	}
    
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
    	return this.courseSeivice.getCourses();
    }
    
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
    	return this.courseSeivice.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
    	return this.courseSeivice.addCourse(course);
    }
     
}





