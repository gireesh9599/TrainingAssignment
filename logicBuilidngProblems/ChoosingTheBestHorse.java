/*
Exercise -3 ( Choosing the Best Horse )
A king has three horsesand want to go for hunting on the horse. It was a difficult choice, as the three horses were equally good. He came up with a strategy to choose the horse.
The horse that weighs the most will be the one that goes with him for hunting.He has approached you to design a program to automate this process. Can you help him?
Solution : Write a program to accept the weights of 3 horses and display the weight of the horse with maximum weight. If to horses are of same weight and are best then should show message ,”Entered weights are not distinct values”
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class ChoosingTheBestHorse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int weight[]= new int[3];
				
		System.out.println("Enter the weights of three horses: ");
		for(int i=0;i<=2;i++) //here we store the values in array named weight
			  weight[i] = scanner.nextInt();
		
scanner.close();
//		now we sort the array using bubble sort
	for(int i=0;i<=2;i++){
		for(int j=0;j<=2-i;j++){
			if(weight[j]<weight[j+1]){
				int temp=weight[j];
				weight[j]=weight[j+1];
				weight[j+1]=temp;
			}
		}
	}
		if(weight[0]==weight[1] || weight[0]==weight[2])
			System.out.println("Entered weights are not distinct values");
			else
				System.out.println("The horse of the weight with maximum weight: "+weight[0]);
			
	}

}
