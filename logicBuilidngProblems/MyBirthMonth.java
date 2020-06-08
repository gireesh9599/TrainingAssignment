/*
Exercise -5 ( My Birth Month )
Write a Java program that accepts an integer as your month of birth and displays the output as “your birthday is in corresponding month..
[ January, February, March, April, May, June, July, August, September, October, November, December].
Use Switch statement.
Solution : Write a program to accept the month of birth as number and displays appropriate message to print the month name. Use Switch statement . If input is not a valid month number should show error message as Invalid Month
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class MyBirthMonth {
	
	 public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter month's number: ");

         int monthNumber = scanner.nextInt();
         System.out.println();
         System.out.print("Your bisth month is ");
         switch (monthNumber) {

         case 1:System.out.print("January");

               break;

         case 2:System.out.print("February");

               break;

         case 3:System.out.print("March");

               break;

         case 4:System.out.print("April");

               break;

         case 5:System.out.print("May");

               break;

         case 6:System.out.print("June");

               break;

         case 7:System.out.print("July");

               break;

         case 8:System.out.print("August");

               break;

         case 9: System.out.print("September");

               break;

         case 10: System.out.print("October");

               break;

         case 11: System.out.print("November");

               break;

         case 12: System.out.print("December");

               break;

         default: System.out.println("Invalid month.");

               break;

         }
         scanner.close();
   }

}
