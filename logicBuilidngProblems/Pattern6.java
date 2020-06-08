/*
 * 37
Write a program to accept a number from user and create the following pattern
Solution : Use Nested for loops to print the following pattern
(Refer to the Notes page for Sample Input Output format)
Exercise -37 (Pattern)
    1
   212
  32123
 4321234
543212345
 4321234 	i6 j2-8
  32123		i7 j3-7
   212		i8 j4-6
    1
 */
package com.techment.logicBuildingProblem;

public class Pattern6 {

	public static void main(String[] args) {
		int length=5;
		
		for (int i=1; i<2*length; i++) //outer loop for number of rows
        { 
			int k;
            if(i<=length)
			  k = i;
            else
            	 k= 2*length-i;
            
        for (int j=1; j<2*length; j++ ) //inner loop for number of columns
        { 
        	if(j>length-i && j<length+i && j<=2*length+4-i && j>=i-length+1 )
        			{
        		System.out.print(k);
                if(k<=1)
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
