package com.Springrest.springrest.services;

import java.util.List;

import com.Springrest.springrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

}
