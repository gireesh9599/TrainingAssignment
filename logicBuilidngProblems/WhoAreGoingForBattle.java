/*
Exercise -7 ( Who are going for Battle)
A king wants to go for war. He has a strategy in mind for this war, according to the strategy the soldiers will be numbered and the king will decide on who will go for battle based on the numbers he calls. Each time the calling strategy is different. This time he wants the soldiers whose numbers are in between the first & the last number (including first & last) that he calls to go. Please write a program to automate (use for loop).
Problem : Write a program to display the soldiers whose numbers are between the first and the last number that the king calls out.
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class WhoAreGoingForBattle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		  
        System.out.println("Enter first number: ");
        
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        
        int number2 = scanner.nextInt();
        System.out.println("soliers number between "+number1+" and "+number2+" are :");

        scanner.close();
        for(int i=number1+1;i<number2;i++) {
        	System.out.print(" "+i);
        }
 
	}

}
