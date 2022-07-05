package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int stdId;
	private String stdName;
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Student() {

		System.out.println("Student Object Created...");
	}
	
	public Student(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + "]";
	}

}
