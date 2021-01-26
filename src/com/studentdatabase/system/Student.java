package com.studentdatabase.system;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradYear;
	private String studentID;
	private String courses = "";
	private int tutionBalance = 0;
	private int courseCost = 600;
	private static int id = 1000;

	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student First Name : \n");
		this.firstName = input.nextLine();
		System.out.println("Enetr Student Last Name :\n");
		this.lastName = input.nextLine();

		System.out.println("Enter Student Garde Year: \n 1 Fresher \n 2 Sophmore \n 3Junior \n 4 Senior");
		this.gradYear = input.nextLine();
		setStudentID();

		System.out.println(firstName + " " + lastName + " " + gradYear + "  " + studentID);

	}

	private String setStudentID() {
		id++;
		return this.studentID = gradYear + "" + id;

	}

	public void enroll() {

		do {
			System.out.println("Enter Courses to Entroll (Q is quit) :");
			Scanner input = new Scanner(System.in);
			String course = input.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tutionBalance = tutionBalance + courseCost;
			} else {
				System.out.println("Break");
				break;
			}
		} while (1 != 0);

		System.out.println("Enrolled In: " + courses);
		System.out.println("Tution Fee : " + tutionBalance);
	}

	public void viewBalance() {

		System.out.println("Your Balance is : " + tutionBalance);
	}

	public void payment() {
		viewBalance();
		System.out.println("Enetr the amount : $");
		Scanner input = new Scanner(System.in);
		int payment = input.nextInt();
		System.out.println("Thank you for your payemnt of $ " + payment);
		tutionBalance = tutionBalance - payment;

		viewBalance();
	}

	public String toString() {
		return "Name :" + firstName + " " + lastName + "\nGrade: " + gradYear + "\nID :" + studentID + "\n Courses:"
				+ courses + "\n Tution Balance :$" + tutionBalance;

	}
}
