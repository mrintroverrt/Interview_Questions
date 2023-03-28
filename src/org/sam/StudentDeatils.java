package org.sam;

import java.util.Scanner;

public class StudentDeatils {
	public static void main(String[] args) {
		System.out.println("Enter The Student ID : ");
		Scanner s = new Scanner(System.in);
		int stdid = s.nextInt();
		System.out.println("Enter Student Name : ");
		String stdname = s.nextLine();
		s.nextLine();
		System.out.println("Enter First Mark : ");
		int m1 = s.nextInt();
		System.out.println("Enter Second Mark : ");
		int m2 = s.nextInt();
		System.out.println("Ente Third Mark : ");
		int m3 = s.nextInt();
		System.out.println("Enter Fourth Mark : ");
		int m4 = s.nextInt();
		System.out.println("Enter Fifth Mark : ");
		int m5 = s.nextInt();
		int total = m1 + m2 + m3 + m4 + m5;
		int avg = total / 5;
		System.out.println("The Total Mark of " + stdname + "is : " + total);
		System.out.println("The Average Mark of " + stdname + "is :" + avg);
	}

}
