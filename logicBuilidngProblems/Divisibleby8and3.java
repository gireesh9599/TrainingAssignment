/*Exercise -16 ( Divisible by 8 and 3)
 * 
Mr Raj wants to buy goods only if itsprice is divisible by both 8 & 3.
He is buying goodsevery day,and it is becoming difficult for him to decide if the price is divisible by both 8 & 3.
He is looking for a solution to automate this process.
Can you help him by writing a program to accept the amount and to display if it is divisible by 8& 3.

Solution :Write a program to accept a number and display it itis divisible by both 8 and 3

 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class Divisibleby8and3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter the number:");
	    
	    int number = scanner.nextInt();//here we get the number
	    scanner.close();
	    if(number%8==0 && number%3==0) {//here we check number is divisible by 8 and 3 or not
	    	System.out.println(number + " is divisible by both 8 and 3");
	    }
	    else {
	    	System.out.println(number + " is not divisible by both 8 and 3");

	    }
	    
	}

}
