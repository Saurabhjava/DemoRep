package com.lti.bean;

public class Course {
	private String courseName;
	private String startDate;
	private String endDate;
	public Course() {
		
	}
	public Course(String courseName, String startDate, String endDate) {
		super();
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String toString() {
		return courseName+"\t"+startDate+"\t"+endDate;
	}
}
