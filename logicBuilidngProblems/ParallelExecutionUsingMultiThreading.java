/*
Exercise -25 (Parallel Execution using Multi Threading )
Raj wants to print a “*” every one second and at the same time wants to print a “$” every 500 millisecond. The number of stars or dollars to be printed needs to be accepted as input. Both printing tasks should happen in parallel. Use multi threading featuesto do both the tasks at the same time. Use Thread.sleep() to delay in printing.
Solution : Create a Main Class and write the code to print a “*”
Create a ChildThreadclass and write the code to print “$” within the run
method.
Create an object of ChildThreadand call start() of the thread.
Use Thread.sleep() to print a * in every second and a dollar in every
500 millisecond. The order in which the $ and * appear does not matter.
 */
package com.techment.logicBuildingProblem;

import java.util.Scanner;

public class ParallelExecutionUsingMultiThreading {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter how many times to print * and $ :");
    	int number = scanner.nextInt();
    	
    	scanner.close();
    	
    	ChildThread object = new ChildThread();
    	object.start();
    	try {
    	for(int i=1;i<=number;i++) {
    		System.out.println("*");
    		Thread.sleep(1000);
    		
    		object.run();
    		Thread.sleep(500);
    	}
    	}
    	catch(Exception ex) {
    		ex.printStackTrace();
    	}
	}

}

class ChildThread extends Thread{
	public void run() {
		System.out.println("$");
	}
}
