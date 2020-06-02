package com.techment;

public class StarPattern {

	public static void main(String[] args) {
		int length=5;
		
		for (int i=0; i<length; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        { 
            
         
        for (int j=0; j<length; j++ ) //inner loop for number of columns
        { 
        	if(i==0||i==length-1||j==0 || j==length-1)
        			{
            System.out.print("*");
        	
        } 
        else
        	System.out.print(" ");
        }
        System.out.println(); //ending line after each row
    } 
} 
}
	