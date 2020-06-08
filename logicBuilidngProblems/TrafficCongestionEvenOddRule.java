/*
Exercise -2 ( Traffic Congestion-Even Odd rule )
Delhi government has introduced a rule to avoid traffic congestion on roads.
The rule governs the cars plying on the roads on any given day depending on the current day of the month.
Carswith evenregistration numberscan ply if the current day is even, else it would be cars with oddregistration numbers.
Added to this the Digital message board should display either of the following messages depending on the day of the month, ' Cars with Odd registration numbers are permitted today' or 'Cars with Even registration numbers are permitted today‘.
Date value should be between 1 to 31 . Or else should show error message “Invalid Input”
Solution : Write a program to accept the day value as input and display appropriate message as output based on the day .
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class TrafficCongestionEvenOddRule {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the date: ");
		 int date = scanner.nextInt();

		
		
			while(date>=31 || date<1){ //here we check the entered number is in range of 1 to 31 or not 
					System.out.println("Entered date is incorrect it should be between 1 to 31 \nPlease enter the date: ");
					 
					 date = scanner.nextInt();

				
	       
	    }
	  /*Now we check tha date is even or odd
	  */
			scanner.close();
	   if(date%2==0){
System.out.println("Cars with Even registration numbers are permitted today");
	   }
	   	else{
	   		System.out.println("Cars with Odd registration numbers are permitted today");
		   }
	   
	}

}
