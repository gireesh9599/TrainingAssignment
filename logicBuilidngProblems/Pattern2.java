/*
Exercise -12 ( Print the Pattern)
The Goal is to print the given patternas follows based on the number of lines as input.
Problem :Write aprogram to print the above pattern.
        5
      4 5 4
    3 4 5 4 3
  2 3 4 5 4 3 2
1 2 3 4 5 4 3 2 1
 */
package com.techment.logicBuildingProblem;

public class Pattern2 {

	public static void main(String[] args) {
		int length=5;
		
		for (int i=1; i<=length; i++) //outer loop for number of rows
        { 
            int k = length+1-i;
         
        for (int j=1; j<2*length; j++ ) //inner loop for number of columns
        { 
        	if(j>length-i && j<length+i)
        			{
            System.out.print(k);
            if(j<length)
            	k++;
            	else
            		k--;
        	
        } 
        else
        	System.out.print(" ");
        }
        System.out.println(); //ending line after each row
    } 
} 
}
