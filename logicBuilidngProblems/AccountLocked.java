/*
Exercise -45 (Account Locked)
An ATM machine can only accepts invalid number for a maximum of 3 times after which the account gets locked. If correct pin is entered within 3 attempts then it shows message ,” PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT”.
Or else shows ,”YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.”
Solution :create a variable to store the auctualpin code number as 12345. and accept the pin from user using a while loop to compare the pin entered with the auctualpin code. If matches shows PIN Accepted. Only 3 attempts are allowed.
Account gets locked if invalid pin entered 3 times
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class AccountLocked {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

		int actualPin = 12345;

    	System.out.println("Enter your pin :");
    	int pinEntered = scanner.nextInt();
    	       int count=1;
    	while(pinEntered!= actualPin) {
    		if(count==3) {
    			System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED");
    			scanner.close();
    			return;
    		}
    		
    		System.out.println("You have entered wrong pin");
    		System.out.println("please enter your pin :");
    		pinEntered = scanner.nextInt();
    		count++;
    	}
    	
    	System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
	scanner.close();
	}

}
