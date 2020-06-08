/*
Exercise -11 ( Print the Pattern)
The Goal is to print the given patternas follows based on the number of lines as input.
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
Solution :Write aprogram to print the above pattern. Use nested for loop.
 */
package com.techment.logicBuildingProblem;

public class Patern1 {

	public static void main(String[] args) {
		int length=5;
		
		for (int i=0; i<length; i++) //outer loop for number of rows
        { 
            
         
        for (int j=0; j<length; j++ ) //inner loop for number of columns
        { 
        	if((i+j)<length)
        			{
            System.out.print(j+1);
        	
        } 
        else
        	System.out.print(" ");
        }
        System.out.println(); //ending line after each row
    } 
} 
}
