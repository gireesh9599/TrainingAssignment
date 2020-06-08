/*
Exercise -31 (Multiplication Table)
Write a program to accept a number from the user and display the multiplication table for that number
Solution : Use looping feature.
Table of 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  
		System.out.println("Enter a number :"); 
		int number = scanner.nextInt(); 
	
		scanner.close();
		
		System.out.println("Table of "+number+" :"); 
		for(int i=1;i<=10;i++) {
			System.out.println(number+" * "+i+" = "+(number*i)); 

		}

	}

}
