/*
Exercise -44 (Heron’s Formula)
In geometry Heron's formula (sometimes called Hero's formula)states that Heron's formula states that the area of a tringle whose sides have lengths a, b, and cis
where sis the semi perimeter of the triangle; that is
Soln: Use Math.sqrt() to findoutthe square root
INPUT
Enter the 3 sides of a triangle as integer:
3 4 5
OUTPUT
Area of Tringle is 6.0
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class HeronsFormula {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  
		System.out.println("Enter the 3 sides of a triangle as integer :"); 
		int side1 = scanner.nextInt(); 
		int side2 = scanner.nextInt(); 
		int side3 = scanner.nextInt(); 

		scanner.close();
		
		double semiperimeter = (side1+side2+side3)/2;
		
		double area = Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
		System.out.println("Area of triangle is "+area);
	}

}
