/*
Exercise -17 ( Invalid Age Exception)
Write a program that accepts the age of the user as input.
 If the age is atleast18 it should display message “Welcome to Vote” . 
 When the age of the user is less than 18, a custom exception named InvalidAgeExceptionis thrown.
Use exception handling mechanisms to handle this exception.

Solution : Create user defined exception named “InvalidAgeException”
raise the Exception from within the try block.
handle the exception in corresponding catch block.
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
		  super(s);  
	 }  
	}  

public class InvalidAgeExceptionHandling {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter the number:");
	    
	    int age = scanner.nextInt();//here we get the age
	    scanner.close();
	    try{  
	    	 if(age>18)  
	    	      System.out.println("welcome to vote");  

	    	     else  
		    	      throw new InvalidAgeException("not valid");  // Throw an object of user defined exception 

	        }catch(Exception ex){
	        	
	        	System.out.println("InvalidAgeException is thrown : "+ ex);}  
	    
	    }  
	  
	    
	}


