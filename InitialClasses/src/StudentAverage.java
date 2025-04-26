/*
 * Data type --- with user input
 */

import java.util.Scanner;

public class StudentAverage {

	public static void main(String[] args) {
		System.out.println("Enter student details:");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Name:");
		String Sname = sc.nextLine();
		
		int regNo;
		System.out.print("Registration Number:");
		regNo = sc.nextInt();
		
		float m1, m2, m3;
		System.out.print("marks1:");
		m1 = sc.nextFloat();
		
		System.out.print("marks2:");
		m2 = sc.nextFloat();
		
		System.out.print("marks3:");
		m3 = sc.nextFloat();
		
		float total = m1+m2+m3;		//
		System.out.println("Total:"+total);
		
		float avg = total/3;
		System.out.println("Average:"+avg);
	}

}
