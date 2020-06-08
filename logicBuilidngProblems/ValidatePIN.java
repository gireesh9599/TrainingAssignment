/*
Exercise -28 (Validate PIN)
Write an ATM program to validate the PIN entered by the user . The Correct PIN is 12345. The ATM should keep asking the user for entering the pin until he accepts the correct PIN number. Once the correct PIN number is entered , It should show PIN accepted message.
Solution : Use a loop to continuously check for the PIN number and keep repeatedly ask the customer to enter PIN until he enters the correct PIN.
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class ValidatePIN {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter your pin :");
    	int pin = scanner.nextInt();
    	       
    	while(pin!=12345) {
    		System.out.println("You have entered wrong pin");
    		System.out.println("please enter your pin :");
        	 pin = scanner.nextInt();
    	}
    	
    	System.out.println("pin is correct");
	scanner.close();
	}

}
