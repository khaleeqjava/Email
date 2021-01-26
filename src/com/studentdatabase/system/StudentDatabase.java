package com.studentdatabase.system;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.enroll();
		student1.viewBalance();
		student1.payment();
		System.out.println(student1.toString());

		System.out.println("Enter the number of Students:");
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();

		Student[] students = new Student[numberOfStudents];

		for (int number = 0; number < numberOfStudents; number++) {

			students[number] = new Student();
			students[number].enroll();
			students[number].viewBalance();
			students[number].payment();

		}
		System.out.println(students[0].toString());
		System.out.println(students[1].toString());

	}

}
