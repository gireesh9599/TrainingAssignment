/*
Exercise -39 (Matrix Manipulation)
Write a program to accept the data of two matrix from the user and display the sum of the matrix.
Solution : Create two dimensional array to store the values of n*n matrix and using nested for loop calculate the sum of the matrix and display in the shown format

 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class MatrixManipulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  
		System.out.println("Enter the number of rows of the matrix"); 
		int row = scanner.nextInt(); 
		System.out.println("Enter the number of columns of the matrix"); 
		int column= scanner.nextInt(); 
		
		int matrix1[][]=new int[row][column];
		int matrix2[][]=new int[row][column]; 
		int addition[][]=new int[row][column];
		

		
        System.out.println("Enter elments of first matrix: ");
        for (int i =0; i< row; i++) 
            for (int j =0;j < column;j++) 
            	matrix1[i][j] = scanner.nextInt();
        
        System.out.println("Enter elments of second matrix: ");
        for (int i =0; i< row; i++) 
            for (int j =0;j < column;j++) 
            	matrix2[i][j] = scanner.nextInt();
        
        scanner.close();
        System.out.println("additon of given matrices is :");
        
	    

		//adding and printing addition of 2 matrices    
		for(int i=0;i<row;i++){    
			
			for(int j=0;j<column;j++){ 
			
			addition[i][j] = matrix1[i][j] + matrix2[i][j];    //use + for addition  
		
			System.out.print(addition[i][j]+" ");    
		}    
		System.out.println();   
		}    
		}
}
