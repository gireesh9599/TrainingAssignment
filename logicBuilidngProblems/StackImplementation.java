/*
Exercise -41 (Stack Implementation)
Vinod wants to create a playing card game application in which he wants to arrange the deck of cards as a stack in which he can only insert a card at the top of the deck or can remove the card only from the top of the deck. Help him create a stack to push and pop cards into his deck.
Solution :Create a stack with push and pop methods , The elements should be stored in an array with a fixed maximum stack size of 5 elements. Push 5 elements and pop all the elements . Should allow pop only from top.

Elements Pushed into Stack
---------------------------------
2
5
7
8
3
Elements Popped from stack
----------------------------------
Item popped is:3
Item popped is:8
Item popped is:7
Item popped is:5
Item popped is:2
 */
package com.techment.logicBuildingProblem;

public class StackImplementation {

	public static void main(String[] args) {

		 Stack stack = new Stack(); 
		 
		 System.out.println("Element pushed into stack :");
	        stack.push(100); 
	        stack.push(50); 
	        stack.push(70);
	        stack.push(60);
	        stack.push(40);
	        
	        System.out.println("Element Popped from stack :");
	        for(int i=1;i<=Stack.MAX;i++)
	        System.out.println(stack.pop()); 
		
	}

}

class Stack { 
    static final int MAX = 5; 
    int top=-1; 
    int array[] = new int[MAX]; // Maximum size of Stack 
  
 
  
    boolean push(int value) 
    { 
        if (top >= MAX) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            array[++top] = value; 
            System.out.println(value + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int value = array[top--]; 
            return value; 
        } 
    } 
}