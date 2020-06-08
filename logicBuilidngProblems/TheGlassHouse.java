/*
Exercise -1 ( The Glass House )
Once King of Dholokpurhas constructed a glass house for the prince. This glasshouse consists of 18 doors numbering 1, 2, 3 …18.
On one fine day when prince was playing hide & seek with his friends he went inside this glass house and was struggling to come out of the glass house since all the doors look similar. None other than the king know the solution to this complex problem.
Based on the location of the prince, the king announces the solution “The sum of the digits of a two digit number, would lead you out of the glass house”
Solution : Write a generic program which accepts a two digit number and find the exit door number of the glasshouse.
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class TheGlassHouse {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter the two digit doon number: ");
		 int doorNumber = scanner.nextInt();
	       
		
			while(doorNumber>=100 || doorNumber<10){
				//here we check tha entered number is a two digit number or not 
					System.out.println("Entered number is incorrect , Please enter the two digit doon number: ");
				 doorNumber = scanner.nextInt();
	       
	    }
			 scanner.close();
	  int temp = doorNumber%10; //here we calculate remainder of number
	   int temp2 = doorNumber/10;
	   	int sum= temp+temp2; //
	   	
	   System.out.println("Sum of entered number is : "+sum);
	   	
	  
	}

}
