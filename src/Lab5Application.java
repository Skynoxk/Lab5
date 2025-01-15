package com.lab5.lab5;
/**
 * Lab5Application.java
 * 
 * This is the main application class for Lab 5.
 * It creates a Subject object, sets its name and number of credits,
 * and prints the subject name to the console.
 * 
 * Author: Meas Ratanakviphou
 * Date:  2025/01/10
 * Reviewed by Ordom
  */
public class Lab5Application {
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.setSubjectname("Math");
		subject.setNumberOfCredit(3);
		System.out.println(subject.getSubjectname());

	}

}
