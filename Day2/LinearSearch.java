package com.techment.day2;

import java.util.Scanner;

public class LinearSearch {

  
    public static void main(String a[]){ 
    	int searchElement, flag= 0; 
    	Scanner s = new Scanner(System.in);
    	
        System.out.println("Enter number of elements:"); //Read the length of array
        
        int length = s.nextInt();
        
        int  arr[] = new int[length];
       
       System.out.println("Enter Elements :"); //read all elements
       for(int i=0; i<length; i++ ) {
        	 arr[i] = s.nextInt();
        }
        
        System.out.println("Enter Element to be searched:");
        
        searchElement = s.nextInt();
    
        
        
        for(int i=0;i<length;i++){    //traverse all element in array
            if(arr[i] == searchElement){ //compare the index value with search element
            	flag = 1;
                System.out.println(searchElement +" is found at index: "+ i);    
               break;
            } 
            
        }    
       
        if(flag!=1) {
            System.out.println(searchElement +" is not found");    

        }

    }    
}    

