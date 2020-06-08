package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  
		System.out.println("Enter the sides of triangle :"); 
		int side1 = scanner.nextInt(); 
		int side2 = scanner.nextInt(); 
		int side3 = scanner.nextInt(); 

		scanner.close();
		if(side1>side2&&side1>side3) {
			if(side1*side1!=side2*side2+side3*side3) {
			System.out.println("The tringle is not a right angle triangle");
				return;
			}
		}
		else if(side2>side1&&side2>side3) {
			if(side2*side2!=side1*side1+side3*side3)
			 {
				System.out.println("The tringle is not a right angle triangle");
					return;
				}
		}
		else 
		{
			if(side3*side3!=side1*side1+side2*side2)
			 {
				System.out.println("The tringle is not a right angle triangle");
					return;
				}
		}
		
			System.out.println("The tringle is a right angle triangle");

		
	}

}
