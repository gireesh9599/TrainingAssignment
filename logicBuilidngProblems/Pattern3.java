/*
Exercise -34 (Pattern)
Write a program to accept a number from user and create the following pattern
7654321
765432
76543
7654
765
76
7
Solution : Use Nested for loops to print the following pattern
 */
package com.techment.logicBuildingProblem;

public class Pattern3 {

	public static void main(String[] args) {

int length=7;
		
		for (int i=1; i<=length; i++) //outer loop for number of rows
        { 
            
         
        for (int j=1; j<=length; j++ ) //inner loop for number of columns
        { 
        	if((i+j)<=length+1)
        			{
            System.out.print(length+1-j);
        	
        } 
        else
        	System.out.print(" ");
        }
        System.out.println(); //ending line after each row
    } 
	}

}
