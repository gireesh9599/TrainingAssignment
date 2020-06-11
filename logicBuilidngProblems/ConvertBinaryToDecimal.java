/*
Exercise -48 (Convert Binary to Decimal)
Smith is a machine language programmer who works with binary data as common task of his programming requirement. He needs to write a program to convert a given number in binary to decimal format. Help him find a solution .
Solution :Accept the Binary number into an integer variable. Using num%10 extract the digits from right to left . Use a while loop for the same. Find the power of each digit using Math. Pow() and find the sum of the powers which results in the decimal equivalent.
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
	static boolean checkBinary(int num){ //function to check the number is binary or not
		while(num!=0) {
       	 if(num%10!=0 && num%10!=1)
       		 return false;
       	 
       	 num=num/10;
        }
		return true;
	}

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 int binaryNumber;
		 do {
         System.out.print("Enter binary number: ");

         binaryNumber = scanner.nextInt();
         //loop until binary number is not entered
		 }while(!checkBinary(binaryNumber));
    
		 scanner.close();
		 
		 int number = binaryNumber;
		int decimalNumber=0;
		
		 for(int i=0;binaryNumber!=0;i++) {
			 
	       	 int temp=binaryNumber%10;
	       	 
			 decimalNumber = decimalNumber + (int) (temp*Math.pow(2, i));
	       	 
	       	binaryNumber=binaryNumber/10;
	        }
		 System.out.println("Decimal equivalent of "+number+" is :"+decimalNumber);
	}

}
