/*Exercise -8 ( Armstrong Number)
 * 10
An Armstrong number of three digits is an integer such that the sum 
of the cubes of its digits is equal to the number itself.
For example, 371 is an Armstrong number since 1^3 + 5^3 + 3^3 = 153.
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter a 3-digit number : ");
        
        int number = scanner.nextInt();
        scanner.close();
        int input = number;
        int armstrong=0;
        while(number>0) {//loop untill we calculate armstrong
        	
        	int temp = number%10;
        	armstrong= armstrong+temp*temp*temp;
        	number=number/10;
        }

        if(input==armstrong) {
        	System.out.println(input+" is an armstrong number");
        }
        else {
        	System.out.println(input+" is not an armstrong number");

        }
	}

}
