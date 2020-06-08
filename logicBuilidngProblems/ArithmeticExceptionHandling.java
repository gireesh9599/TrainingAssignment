/*
Exercise -18 ( Arithmetic Exception)
Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception.
 In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.
Solution : Use try, catch and finally to handle ArithmeticExceptionwhich is raised as a result of division by zero .
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String args[]){ 
		
Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter two numbers:");
	    
	    int num1 = scanner.nextInt();
	    int num2 = scanner.nextInt();
		scanner.close();
		
		  try{  
		   int quotient=num1/num2;  
		   System.out.println(quotient);  
		  }  
		  catch(ArithmeticException e){
			  System.out.println(e);
			  }  
		  finally{
			  System.out.println("Inside finally block");
			  }  
		 
	}  
}
