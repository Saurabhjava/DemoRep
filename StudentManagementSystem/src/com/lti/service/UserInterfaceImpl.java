package com.lti.service;

import java.util.List;
import java.util.Scanner;

import com.lti.bean.Student;

public class UserInterfaceImpl implements UserInterface {
	AppEngine obj = new AppEngine();
	@Override
	public void showFirstScreen() {		
		
		Scanner s = new Scanner(System.in);
		String rep = "yes";
		while (rep.equalsIgnoreCase("yes")) {
			System.out.println("1: for Register new Student");
			System.out.println("2: for view All Student");
			System.out.println("3: for find Student By ID");
			System.out.println("Enter Choice");
			int ch = s.nextInt();
			switch (ch) {
			case 1:
				showStudentRegistrationScreen();
				break;
			case 2:
				showAllStudentsScreen();
				break;
			case 3: 
				getStudentById();
				break;
			default:
				System.out.println("Wrong Choice!");
			}
			System.out.println("Do you want to continue (yes or no)?");
			rep=s.next();
		}
		
	}

	@Override
	public void showStudentScreen() {
				
	}

	@Override
	public void showAdminScreen() {
			
	}

	@Override
	public void showAllStudentsScreen() {
		List<Student> li = obj.listOfStudents();
		for (Student st : li)
			System.out.println(st);			
	}

	@Override
	public void showStudentRegistrationScreen() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student id.");
		String sid = s.next();
		System.out.println("Enter Student Name.");
		String name = s.next();
		System.out.println("Enter Student Email.");
		String email = s.next();
		obj.register(new Student(sid, name, email));
		
	}

	@Override
	public void getStudentById() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter SID to Find Student");
		String id=s.next();
		Student stu=obj.getStudentByID(id);
		if(stu!=null)
			System.out.println(stu);
		else
			System.out.println("Student Not Found!!!");
		
	}
	

}
