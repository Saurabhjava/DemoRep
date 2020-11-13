package com.lti.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Course;
import com.lti.bean.Enroll;
import com.lti.bean.Student;

public class AppEngine {
	private static List<Student> students;
	private static List<Course> courses;
	private static List<Enroll> enroll;
	static {
		students=new ArrayList<Student>();
		courses=new ArrayList<Course>();
		enroll=new ArrayList<Enroll>();
		students.add(new Student("S101", "A", "a@gmail.com"));
		students.add(new Student("S102", "B", "b@gmail.com"));
		students.add(new Student("S103", "C", "C@gmail.com"));
		
		courses.add(new Course("Core Java", "05-Nov-2020","13-Nov-2020"));
		courses.add(new Course("Adv Java", "14-Nov-2020","20-Nov-2020"));
		courses.add(new Course("Angular", "21-Nov-2020","25-Nov-2020"));
	}
	public List<Student> listOfStudents(){
		return students;
	}
	public void register(Student student) {
		students.add(student);
		System.out.println("Student Created!!!!!!");
    }
	public Student getStudentByID(String sid) {
		for(Student s:students) {
			if(sid.equals(s.getSid())) 
				return s;
		}
		return null;
	}
	public void introduce(Course course) {
		courses.add(course);
    }
	public List<Course> listOfCourses() {
		return courses;
    }
	public void enroll(Student student, Course course) {
		enroll.add(new Enroll(student, course, LocalDate.now()));
    }
	public List<Enroll> listOfEnrollments() {
		return enroll;
    }

}
