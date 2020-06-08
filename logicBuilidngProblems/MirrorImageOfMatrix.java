package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class MirrorImageOfMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  
		System.out.println("Enter the number of size of the matrix"); 
		int size = scanner.nextInt(); 
		
		
		int matrix[][]=new int[size][size];
		int mirrorImage[][]=new int[size][size]; 
		

		
        System.out.println("Enter elments of first matrix: ");
        for (int i =0; i< size; i++) 
            for (int j =0;j < size;j++) 
            	matrix[i][j] = scanner.nextInt();
        
      
        scanner.close();
        System.out.println("Mirror image of given matrices is :");
        
        
        
        for (int row = 0; row < size; row++) { 
            // initialize column for image array 
            int imageColumn = 0; 
            // iterate over the columns of original array in reverse direction
             for (int column = size - 1; column >= 0; column--) {
 		// get element at current row and column
 		
 		// assign element to the image array
 		mirrorImage[row][imageColumn] =  matrix[row][column];;
 		// increment the image array column counter
 		imageColumn++;
 	}             
        }
        System.out.println("The original matrix :");

        //The original matrix :
 for(int i=0;i<size;i++){    
			
			for(int j=0;j<size;j++){ 
			
		
			System.out.print(matrix[i][j]+" ");    
		}    
		System.out.println();   
		}    
		
 System.out.println("Mirror image of given matrices is :");

        //The mirror image :
        for(int i=0;i<size;i++){    
			
			for(int j=0;j<size;j++){ 
			
		
			System.out.print(mirrorImage[i][j]+" ");    
		}    
		System.out.println();   
		}    
		
	}
}
