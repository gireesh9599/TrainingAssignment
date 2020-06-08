/*
 * 35
Write a program to accept a number from user and create the following pattern
Solution : Use Nested for loops to print the following pattern
(Refer to the Notes page for Sample Input Output format)
Exercise -35 (Pattern)
1			
12			
123			
1234
12345
123456		
1234567		
123456		
12345		
1234
123
12
1
 */
package com.techment.logicBuildingProblem;

public class Pattern4 {

	public static void main(String[] args) {
	

			int length=7;
					
					for (int i=1; i<2*length; i++) //outer loop for number of rows
			        { 
			            
			         
			        for (int j=1; j<=length; j++ ) //inner loop for number of columns
			        { 
			        	if(j<=i && j<=2*length-i)
			        			{
			            System.out.print(j);
			        	
			        } 
			        else
			        	System.out.print(" ");
			        }
			        System.out.println(); //ending line after each row
			    } 
				
	}
	
}


