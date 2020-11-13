package com.lti.bean;

public class Student {
	private String sid;
	private String name;
	private String email;
	
	public Student() {
		
	}
	public Student(String sid, String name, String email) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return sid+"\t"+name+"\t"+email;
	}
	

}
