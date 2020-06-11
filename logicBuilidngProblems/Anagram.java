/*
Exercise -50 (Anagram)
What is Anagram ?
If two strings contain same set of characters but in different order then the two strings are called anagrams for example : “now” and “own” are anagrams.
Solution :
Convert the two strings into uppercase and remove all white spaces.Convert the two strings into char arrays using toCharArray().Sort the two character arrays using sort() method of java.util.Arraysclass.After sorting, we compare both the arrays using equals() method. If both array are equal ,returns true ,means anagram.
Anagram Examples:
1."now"and "own"
2. "ton"and "not"
3."fiber" and "brief"
 */
package com.techment.logicBuildingProblem;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first string :");
		String str1 = scanner.nextLine();
		
		System.out.println("Enter second string :");

		String str2 = scanner.nextLine();
		scanner.close();
		str1 = str1.toUpperCase();

		 str2 = str2.toUpperCase();
		
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		if(Arrays.equals(string1, string2)) {
			System.out.println("strings are anagram");
		}else
		{
			System.out.println("strings are not anagram");
		}
	}

}
