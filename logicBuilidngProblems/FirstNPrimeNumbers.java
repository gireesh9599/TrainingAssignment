package com.techment.logicBuildingProblem;

import java.util.Scanner;



public class FirstNPrimeNumbers {
	
	public static void main(String[] args) {
		int array[] = {2,3,5,7,9,11,13,17};

		Scanner scanner = new Scanner(System.in);
		 int number;
		do {
			System.out.println("Enter the number less than "+ (array.length+1)+" :");
		    
		     number = scanner.nextInt();
		     
		    
			}while(number > array.length);
		
		scanner.close();
		System.out.println("first "+number+" prime numbers :");
        for(int i = 0; i <= number; i++) { 
        	if(isPrime(array[i])==true)
        	System.out.print(" "+array[i]+ " ");
	}

        
	}
	
	 public static boolean isPrime(int num) {
			if(num<=1) {
				return false;
			}
			else {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
				return true;
			
		}
	 } 
	}
		




