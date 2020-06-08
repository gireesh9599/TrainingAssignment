/*
Exercise -21 ( Product Catalogue)
Mr. Shyamneeds to maintain a product catalogue for his shop to keep track of the list of products available in his store . One of his important requirement is to add products into the catalogue and search for the availability of a particular product in the list . Write a program to help him create a list of products , and find a particular product details based on the product ID.
If product is found in the list it should display the product details such as name and price
If product is not found in the list it should display Message ,”Product Not Found”
.
Solution : Create a Product class with id, name and price as private attributes
Provide public getters and setters
Create an ArrayListtype of collection to store product objects.
Use Generics
Use Enhanced for loop to iterate through the collection.
 */
package com.techment.logicBuildingProblem;

import java.util.*;

public class ProductCatalogue {

	public static void main(String[] args) {

		ArrayList<Product> products =new ArrayList<Product>();
		
		products.add(new Product(1,"parle biscuit", 5.5));
		products.add(new Product(2,"washing powder", 20.15));
		products.add(new Product(3,"eno", 8.0));
		products.add(new Product(4,"tofee", 5.00));
		products.add(new Product(5,"maggi", 10.00));
		products.add(new Product(6,"kurkure", 5.00));

		for(Product product: products) {
			product.printProducts();
		}
	}

}

 class Product{
	 private int id;
	 private String name;
	 private double price;
			 
	 public Product(int tempId,String tempName,double tempPrice) {
		
		    this.id = tempId;
		    this.name = tempName;
		    this.price = tempPrice;
 
	 }
	  // Getters
	  public int getId() {
	    return id;
	  }
	  public String getName() {
		    return name;
		  }
	  public double getPrice() {
		    return price;
		  }

	  // Setters
	  public void setId(int tempId) {
	    this.id = tempId;
	  }
	  public void setName(String tempName) {
		    this.name = tempName;
		  }
	  public void setPrice(double tempPrice) {
		    this.price = tempPrice;
		  }
	  
	  public void printProducts() {
			System.out.println((this.id) +" "+ this.name +" "+ (this.price));
		}
 }