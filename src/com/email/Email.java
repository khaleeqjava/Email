package com.email;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	private String changePassword;
	private int defaultpassword = 10;
	private int mailBoxCapcity = 500;
	private int defaultpasswordLength = 8;
	private String alternateEmail;
	private String companySuffix = "anycompany.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// set Department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		// set e-mail
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println(email);
// set password
		this.password = randomPassword(defaultpasswordLength);
		System.out.println(this.password);
	}

	private String setDepartment() {
		System.out.println(
				"Deaprtment Codes: \n 1 for Accounting \n 2 for Marketing \n 3 for IT \n Please Enter appropriate Department Code:");
		Scanner input = new Scanner(System.in);
		int departmentSelection = input.nextInt();
		if (departmentSelection == 1) {
			return "Accounting";
		} else if (departmentSelection == 2) {
			return "Marketing";
		} else if (departmentSelection == 3) {
			return "IT";
		} else {
			return "Null";
		}
	}

	private String randomPassword(int length) {
		String passwordChoice = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#$%&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordChoice.length());
			password[i] = passwordChoice.charAt(rand);
		}
		return new String(password);
	}

	public String showInfo() {

		return "Department : " + this.department + "\n Email : " + email + "\n Password :" + this.password;
	}
}
