package com.lti.bean;

import java.time.LocalDate;

public class Enroll {
	private Student student;
	private Course course;
	private LocalDate enrollmentDate;
	public Enroll() {
		
	}
	public Enroll(Student student, Course course, LocalDate enrollmentDate) {
		super();
		this.student = student;
		this.course = course;
		this.enrollmentDate = enrollmentDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	
	
}
