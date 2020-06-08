/*
 * Exercise -13 ( The Super Market-Stock Challenge)
 * 
 * Mr. Ram Babuhas opened a super market. He is having all the products in his super market. Whenever he wants to order any product from the distributor, he finds it a tough task, as he has go through the entire store, check the products, count the products etc.
Hence he wants to automate this process so that it will be easy for him to manage. Please help him by writing a program (use 1D quantity technique).

Solution :Help Mr Babuto know the products which has maximum quantity.
Create an quantity and store the product quantities and find the maximum
value and print it
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class TheSuperMarketStockChallenge {

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
	    int max=quantity[0] ;
	    for(int i=1;i<length;i++) {//find largest elemnet in array
			
			
			if(quantity[i]>max) {
				max = quantity[i];
			}
		}
		System.out.println("maximum quantity :" + max );
		
	    
	}

}
