/*Exercise -6 ( Simple Calculator )
 * Write a java program to perform simple mathematical operationson two numbers .
 * The user will enter 3 inputs , the first input will be a number ,
 * second input will be an operator and third input will be a number again. 
 * It should display the result of the operation as output.
	Use switch statement.
 */

package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class SimpleCalculator {

	
	public static void main(String args[])
	   {   
	        Scanner scanner = new Scanner(System.in);
	        
	      
	            System.out.println("Enter the two numbers and operation to perform operations ");
	            
	            System.out.print("Enter the first number : ");
	            
	            int oprerand1 = scanner.nextInt();
	            System.out.println("Enter the operation you want to perform like +,-,*,/ or % :");
	            int oprerator = scanner.next().charAt(0); 

	            System.out.print("Enter the second number : ");
	            int oprerand2 = scanner.nextInt();
	            
	    
	      	            switch(oprerator)
	            {
	                case '+':
	                int add;
	                add = oprerand1 + oprerand2;
	                System.out.println("Result : "+add);
	                break;
	 
	                case '-':
	                int sub;
	                sub = oprerand1 - oprerand2;
	                System.out.println("Result : "+sub);
	                break;
	 
	                case '*':
	                int mul;
	                mul = oprerand1 * oprerand2;
	                System.out.println("Result : "+mul);
	                break;
	 
	                case '/':
	                float div;
	                div = (float) oprerand1 / oprerand2;
	                System.out.print("Result : "+div);
	                break;
	 
	                case '%':
	                int mod;               
	                mod = oprerand1 % oprerand2;
	                System.out.println("Result : "+mod);
	                break;
	 
	                default: System.out.println("Invalid operator");

	                break;
	                
	            }
	      	            scanner.close();
	        }
	    
}
