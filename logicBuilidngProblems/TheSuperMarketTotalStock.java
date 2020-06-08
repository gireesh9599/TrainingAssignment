/*
 * Exercise -14 ( The Super Market-Total Stock)
 * Mr. Ram Babuhas opened a super market. He is having all the products in his super market. Whenever he wants to order any product from the distributor, he finds it a tough task, as he has go through the entire store, check the products, count the products etc. hence he wants to automate this process so that it will be easy for him to manage. Please help him by writing a program (use 1D Array technique).

Problem :Help Mr. Babuto know the total number of products present in super market. 
	Use an array to store values and find the sum of the elements using a loop.
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class TheSuperMarketTotalStock {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter how many products are there:");
	    
	    int length = scanner.nextInt();//here we get legth of array
	    
	    int  quantity[] = new int[length];
	   

	    for(int i=0; i<length; i++ ) {//now we take input for array element
	    	int j = i+1;
	    	 System.out.println("Enter the quantity of product " + j + " :");
	    	 quantity[i] = scanner.nextInt();
	    }
	    scanner.close();
	    int total=quantity[0] ;
	    for(int i=1;i<length;i++) {//loop to traverse all element in array
			
	    	total = total + quantity[i];
			
		}
		System.out.println("total quantity of products :" + total );
		
	    
	}

}
