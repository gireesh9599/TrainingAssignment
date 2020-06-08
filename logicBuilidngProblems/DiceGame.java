/*
Exercise -27 (Dice Game )
Smith is creating a dice game , The player needs to roll the dice 2 times, and the result of each roll of the dice should be noted, if both the results are even numbers then it should display the sum of the numbers as the points. Else should display the difference of the bigger number –smaller number as the points.
Solution : Use Random class of UtilPackage to generate random numbers.
check if both the random numbers are even or not
Add the numbers if both are even or else subtract the values.
 */
package com.techment.logicBuildingProblem;

import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {

		Random rand = new Random(); 
		
		int num1 = rand.nextInt(1000); 
        int num2 = rand.nextInt(1000); 
        
        if(num1%2==0 && num2%2==0) {
        	
        	System.out.println("The sum of numbers are : " + (num1+num2));
        }
        else {
        	if(num1>num2)
        		System.out.println("The difference of Numbers are : " + (num1-num2));
        	else
        		System.out.println("The difference of Numbers are : " + (num2-num1));
        }
        	
		
	}
	}


