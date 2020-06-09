/*
Exercise -46 (Sum of the series)
Write a Java program to find the sum of the series 1/1! + 2/2! + 3/3! + ……1/N!
Enter the number of terms you want in the series as input. Use loops and factorials to calculate the sum and get the desired result.
Solution :create a separate method named fact() which accepts an integer and returns the factorial of the number. Call this fact() method within the loop to find the factorial of each term and the sum of the series.

INPUT
Enter the no. of terms in series:5
OUTPUT
Sum of series:2.708333333333333
1/1! + 2/2! + 3/3! + ……1/N!
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;


public class SumOfTheSeries {

	static int fact(int number){
		int fact=1;
		if(number==0)
			return 0 ;
		
		while(number>1) {
			fact=fact*number;
			number--;
		}
		return fact;
	}

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter the no. of terms in series:");
    	int terms = scanner.nextInt();
    	scanner.close();
    	double sum=0.0;
    	for(int i=1;i<=terms;i++) {
    		sum = sum + (double)i/fact(i);
    	}
    	System.out.println("Sum of series: " + sum);
    	
    	
    	       
	}

}
