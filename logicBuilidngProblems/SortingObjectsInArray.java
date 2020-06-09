/*
Exercise -47 (Sorting Objects in Array)
Create a list of Product Objects with id,nameand price as attributes and store the objects into an array . Display the products in ascending order of their names.
Solution :Create a Product Class with withattributes pid, name and price.Provideparameterized constructor to create product objects initializing with values entered from user.
Use a loop to create 5 product objects populated with values from user and sort the products using any sorting algorithm and display the list in sorted order of their name

Products Sorted by Name
105 Colddrinks80.0
101 Mobile 30000.0
104 Notebook 120.0
102 Soap 50.0
103 Toothpaste 100.0
 */
package com.techment.logicBuildingProblem;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class SortingObjectsInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Products> products =new ArrayList<Products>();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter values for product "+i+" :");
			
			System.out.println("Enter product id :");
			int id = scanner.nextInt();
			
			System.out.println("Enter product name :");
			
			String name = scanner.next();
			
			System.out.println("Enter product price :");
			double price = scanner.nextDouble();
			
			products.add(new Products(id,name,price));

		}
		
		scanner.close();
		Collections.sort(products);
		
		for(Products product: products) {
			product.printProducts();
		}
		
		
	}

}

class Products implements Comparable<Products> {
	 private int pid;
	 private String name;
	 private double price;
	 
	 public int compareTo(Products other) {
	        return name.compareTo(other.name);
	    }
			 
	 public Products(int tempId,String tempName,double tempPrice) {
		
		    this.pid = tempId;
		    this.name = tempName;
		    this.price = tempPrice;

	 }
	  // Getters
	  public int getId() {
	    return pid;
	  }
	  public String getName() {
		    return name;
		  }
	  public double getPrice() {
		    return price;
		  }

	  // Setters
	  public void setId(int tempId) {
	    this.pid = tempId;
	  }
	  public void setName(String tempName) {
		    this.name = tempName;
		  }
	  public void setPrice(double tempPrice) {
		    this.price = tempPrice;
		  }
	  
	  public void printProducts() {
			System.out.println((this.pid) +" "+ this.name +" "+ (this.price));
		}
}