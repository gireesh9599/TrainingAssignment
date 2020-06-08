/*
Exercise -30 (Letter at a time)
Write a program to accept a message from the user and display the following data.
How many characters is the whole message consists of ?
Which is the first and last character and the position of the same
Print all the characters in the message one at a time.
How many times is the letter ‘a’ present in the message?
Solution : Use appropriate java String methods to parse the String message and solve all the problems
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class LetterAtATime {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter message :");
	    
	    String message = scanner.nextLine();
	    
	    scanner.close();
	
	    System.out.println("characters present in the message :"+message.length());
	    System.out.println("First character in message :"+message.charAt(0));
	    System.out.println("Last character in message :"+message.charAt(message.length()-1));

	    System.out.println("characters in the message one at a time :");
	    System.out.println();
	    for(int i=0;i<message.length();i++) {
	    	
	    	System.out.print(message.charAt(i)+" ");
	    }
	    System.out.println();
	    int count=0;
	    for(int i=0;i<message.length();i++) {

	    	if(message.charAt(i)=='a')
	    		count++;
	    }
	    System.out.println("letter ‘a’ present in the message " + count+" times");
	}

}
