/*
 * Exercise -15 ( Compare two array1s)
 * 
 * Write a program to find whether 2 array1s are the same.
Input consists of 2n+1 integers.
The first integer corresponds to ‘n’ , the size of the array1.
The next ‘n’ integers correspond to the elements in the first array1.
The next ‘n’ integers correspond to the elements in the second array1.
Assume that the maximum value of n is 15.

Problem :Write a program to accept values into two separate array1s , 
then compare the values and print if they are same or different.


 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class CompareTwoArrays {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter the length of array:");
	    
	    int length = scanner.nextInt();//here we get legth of arrays
	    
	    int  array1[] = new int[length];
	   
	    System.out.println("Enter the elements of array1 :");
	    for(int i=0; i<length; i++ ) {//now we take input for array1 element
	
	    	 array1[i] = scanner.nextInt();
	    }
	    
	    int  array2[] = new int[length];
		   
	    System.out.println("Enter the elements of array 2 :");
	    for(int i=0; i<length; i++ ) {//now we take input for array2 element
	
	    	 array2[i] = scanner.nextInt();
	    }
	    
		scanner.close();

	    for(int i=0;i<length;i++) {//loop to traverse all element in array1
			if(array1[i]!=array2[i])
			{
				System.out.println("values of both arrays are different");
				return ;
			}
		}
	    System.out.println("values of both arrays are same");
		
	    
	}


}
