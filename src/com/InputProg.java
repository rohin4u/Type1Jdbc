package com;

import java.util.Scanner;

public class InputProg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Number: ");
		
		int nextInt = sc.nextInt();
		
		System.out.println("Enter Employee Name :");
		
		String next = sc.next();
		
		System.out.println("Enter Employee Salary :");
		double salary = sc.nextDouble();
		
		System.out.println(nextInt);
		System.out.println(next);
		System.out.println(salary);
		
		

	}

}
