/*
Exercise -43 (Sort Words of Sentense)
Rohan wants to break a sentence into words and then sort the words in ascending order .Find a solution to his problem by writing a java program which inputs a sentence and outputs the words in ascending order.
Solution :Use split() method to break the sentence into words . Use Arrays.sort() to sort the array of strings and display in ascending order
Use BufferedReaderto read a line from user.
INPUT
java is beautiful language
OUTPUT
beautiful
is
java
language
 */
package com.techment.logicBuildingProblem;

import java.io.*;
import java.util.Arrays;


public class SortWordsOfSentense {

	public static void main(String[] args) throws Exception {
		
		
		InputStreamReader ist =new InputStreamReader(System.in); 
		BufferedReader reader = new BufferedReader(ist);

		
	    System.out.println("Enter message :");
	    
	    String message = reader.readLine();
	    
	    reader.close();
		
		
	  
	    String[] arrayString = message.split(" ");
	    
	    Arrays.sort(arrayString);
	    
	    System.out.println("Sorted message :");
	    for(String str:arrayString)
	    	System.out.println(str);
	}

}
