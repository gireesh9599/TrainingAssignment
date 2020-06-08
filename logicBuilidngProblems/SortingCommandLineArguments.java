/*
Exercise -22 (Sorting Command Line Arguments )
Kumar is creating a java based game application in which he wants to enter the name of players as command line arguments.
Write a program to accept a number of names as command line arguments and display the names in alphabetically sorted order.
.
Solution : Create ArrayListcollection to store the names and use appropriate method from Collection apito 
	sort the names .
 */
package com.techment.logicBuildingProblem;

import java.util.*;

public class SortingCommandLineArguments {

	public static void main(String[] args) {

		List<String> playersName = Arrays.asList(args);
	
		playersName.sort(null);
		
		for(String name: playersName) {
			System.out.println(name);
		}
		

	}

}
