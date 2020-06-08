/*
Exercise -4 ( Leap Year Event )
There is a couple living in a certain village, they conduct an event in their houseevery leap year by inviting their friends and relatives.They always end up in confusion on deciding the leap year for this event.
They require your help to automate this process, as that would help them to make the decision easily every year.
Solution : Write a program to accept a year value as input and display if the year is a leap year or not
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class LeapYearEvent {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("enter year in YYYY format :");
    	int year = scanner.nextInt();
    	       
	    scanner.close();

    	boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    	}

	}


