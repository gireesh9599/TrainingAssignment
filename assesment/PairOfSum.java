package com.techment;


import java.util.Arrays;

public class PairOfSum {

	public static void main(String[] args) {
		
		int array[] = {2,5,1,6,3,4};

		int sum = 8;
		
		Arrays.sort(array);
		
		

		System.out.println("pairs :");
        for(int i = 0; i < array.length; i++) { 
        	int first = array[i];
        	
        	for (int j = i + 1; j < array.length; j++) {
        	int second = array[j];
        	if ((first + second) == sum) {
        		System.out.println("("+first+","+second+")");

        		
        	} 
        	} }

       
		

	}
}
