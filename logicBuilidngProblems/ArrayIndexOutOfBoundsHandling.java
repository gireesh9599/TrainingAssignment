package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsHandling {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter the length of array:");
	    
	    int length = scanner.nextInt();//here we get legth of arrays
	    
	    int  array[] = new int[length];
	   
	    System.out.println("Enter the elements of array :");
	    for(int i=0; i<length; i++ ) {//now we take input for array element
	
	    	 array[i] = scanner.nextInt();
	    }
	    
	    System.out.println("Enter the index number of array to find item :");
	    int index = scanner.nextInt();//here we get index number
	    scanner.close();
	    try {
		    System.out.println("EnElement on intered index is :" + array[index]);

	    }catch(ArrayIndexOutOfBoundsException ex) {
	    	System.out.println(ex);
	    }
	}

}
