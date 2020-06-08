/*
Exercise -23 ( BMI Calculator )
Smithais a Nutritionist who calculates the BMI of her patients and recommends appropriate diet plan depending on the BMI value. Help her calculating BMI for different people with different weight and height value and show results like Underweight, Normal or overweight based on the BMI index.
Height and weight needs to be entered in Kgs and Centimeters respectively
.Solution :

BMI = Weight in Kg/(Height in Meters * Height in Meters)

Example :
weight = 90kg, height = 1.5m
BMI = 90/(1.5*1.5) = 40


Category
BMI Range
Underweight < 18.5
Normal 18.5 –25
Overweight 25 –30
Obese > 30
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	
    System.out.println("Enter weight in kg:");
    
    double weight = scanner.nextDouble();
    System.out.println("Enter height in centimeter :");
    
    double height = scanner.nextDouble();
    
    scanner.close();
    
    double bmi = weight/((height/100)*(height/100));
    
    if(bmi< 18.5)
    	System.out.println("underweight");
    else if(bmi>18.5 &&bmi<25)
    	System.out.println("Normal");
    else if(bmi>25 &&bmi<30)
    	System.out.println("Overweight");
    else 
    	System.out.println("Obese");


}
}