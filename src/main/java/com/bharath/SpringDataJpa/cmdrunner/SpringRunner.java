package com.bharath.SpringDataJpa.cmdrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bharath.SpringDataJpa.Course;
import com.bharath.SpringDataJpa.CourseDAO;

@Component
public class SpringRunner  implements CommandLineRunner{

	
	@Autowired
	private CourseDAO course;
	
		@Override
	public void run(String... args) throws Exception {
		
		course.save(new Course(1, "springboot","udemy"));
	}

}
