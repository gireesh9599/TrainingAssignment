package com.techment.day2;

import java.util.Scanner;

public class BinarySearch {
	
	 public static void main(String a[]){ 
	    	int searchElement, flag= 0 ; 
	    	Scanner s = new Scanner(System.in);
	    	
	        System.out.println("Enter number of elements:");  //Read the length of array
	        
	        int length = s.nextInt();
	        
	        int  arr[] = new int[length];
	       
	       System.out.println("Enter Elements :");  
	       for(int i=0; i<length; i++ ) {  //read all elements
	        	 arr[i] = s.nextInt();
	        }
	        
	        System.out.println("Enter Element to be searched:");
	        
	        searchElement = s.nextInt();
	    
	        int first=0;
	        int last=length-1;;
	        
	        
	        while (last>=first){  //loop untill all elements are traversed
	            int mid = (first + last )/2;  //calsulate the mid of elments
	            
	            if (arr[mid] == searchElement){  //compare mid element with search element
	            flag=1;
	         
	        	System.out.println(searchElement +" is found at index: "+ mid);

	            break;
	            }  
	            if (searchElement > arr[mid]){  //compare mid element is largeer than search element or not 
	            	first = mid + 1;
	            }else{  
	            	last=mid-1;
	            }  
	        }  
	        
	        
	        if(flag!=1) {
	            System.out.println(searchElement +" is not found");    
	        }
	       

	    }    
}
