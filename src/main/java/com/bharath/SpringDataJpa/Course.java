package com.bharath.SpringDataJpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	public Course() {
		
	}
	public Course(int id, String course, String platform) {
		super();
		this.id = id;
		this.course = course;
		this.platform = platform;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	@Id
	private int id;
	private String course;
	private String platform;

}
