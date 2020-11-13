package com.lti.main;

import com.lti.service.UserInterface;
import com.lti.service.UserInterfaceImpl;

public class StudentMain {

	public static void main(String[] args) {
		UserInterface obj=new UserInterfaceImpl();
		obj.showFirstScreen();
	}

}
