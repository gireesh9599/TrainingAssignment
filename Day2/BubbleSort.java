package com.techment.day2;

import java.util.Scanner;

public class BubbleSort {

	 public static void main(String a[]){ 
	    	
	    	Scanner s = new Scanner(System.in);
	    	
	    	 System.out.println("Enter number of elements:");  //Read the length of array
		        
		        int length = s.nextInt();
		        
		        int  arr[] = new int[length];
		       
		       System.out.println("Enter Elements :");  
		       for(int i=0; i<length; i++ ) {  //read all elements
		        	 arr[i] = s.nextInt();
		        }
	        
	       
	        System.out.println("Array Before Bubble Sort"); //printing all elements before sorting 
            for(int i=0; i < length; i++){  
                    System.out.print(arr[i] + " ");  
            }  
            System.out.println();  
              
             
            int size = length;
	        int temp = 0;  
	         for(int i=0; i < size; i++){  
	                 for(int j=1; j < (size-i); j++){
	                	 
	                          if(arr[j-1] > arr[j]){    //here we compare two adjacent elements
	                                 
	                                 temp = arr[j-1];  //swap elements
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  

	      
	 System.out.println("Array After Bubble Sort");  //printing all elements after sorting
     for(int i=0; i <length; i++){  
             System.out.print(arr[i] + " ");  
     }  
  }
}
