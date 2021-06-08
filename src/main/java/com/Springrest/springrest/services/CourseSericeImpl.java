package com.Springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Springrest.springrest.entities.Course;

@Service
public class CourseSericeImpl implements CourseService {
	
	List<Course> list;
	  public CourseSericeImpl() 
	  {
		  list=new ArrayList<>();
		  list.add(new Course(101,"java","basic"));
		  list.add(new Course(102,"boot string","basic"));
	  }
		 

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		 Course c = null;
		 for(Course course:list)
		 {
			 if(course.getId()==courseId)
			 {
				 c=course;
				 break;
			 }
		 }
		 
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
