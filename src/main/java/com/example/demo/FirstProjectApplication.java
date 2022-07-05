package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Student;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac =	SpringApplication.run(FirstProjectApplication.class, args);
		
		System.out.println("Inside Application file");
		
		
		Student s1 = (Student)ac.getBean("student");
	   
	    s1.setStdId(10);
		s1.setStdName("Amit");
		
		System.out.println("Student is : "+s1);
		
		
		Employee e1 = (Employee) ac.getBean("emp");
		
		System.out.println("Employee is : "+e1);
		
	}

}
