/*
Exercise -9 ( First n terms in a series)
Write a program to generate the first n terms in the series ---1, 8, 27, 64, 125
Solution :Write aprogram to accept a number n, and display the first n numbers from the above series.
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class FirstNTerm {

	public static void main(String[] args) {
		int array[] = {1,8,27,64,125};

		Scanner scanner = new Scanner(System.in);
		 int number;
		do {
		System.out.println("Enter the number less than "+ (array.length+1)+" :");
	    
	     number = scanner.nextInt();
	    
		}while(number > array.length);
		
		scanner.close();
		System.out.println("first "+number+" terms :");
        for(int i = 0; i < number; i++) { 
        	System.out.print(" "+array[i]+ " ");
	}

	}
}
