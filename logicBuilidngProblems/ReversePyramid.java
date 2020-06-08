/*
Exercise -19 ( Reverse Pyramid)
The Goal is to print the given patternas follows based on the number of lines as input.

Problem :Write aprogram to print the above pattern.
Use Nested for loops

1 2 3 4 5 6 5 4 3 2 1 
  1 2 3 4 5 4 3 2 1 
    1 2 3 4 3 2 1  
      1 2 3 2 1
        1 2 1
          1
 */ 
package com.techment.logicBuildingProblem;

public class ReversePyramid {

	public static void main(String[] args) {
		int length=6;
		
		for (int i=1; i<=length; i++) //outer loop for number of rows
        { 
            int k = 1;
         
        for (int j=1; j<2*length; j++ ) //inner loop for number of columns
        { 
        	if( j>=i && j<=2*length-i)
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
