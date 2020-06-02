package com.techment;

public class OddAndEvenSum {

	public static void main(String a[]){ 
	int array[] = {2,6,7,9,4};
	int oddSum=0 ;
	int evenSum =0 ;
	
	for(int i=0;i<array.length;i++) {
		if(array[i]%2==0) {
			evenSum=evenSum+array[i];
		}
		else {
			oddSum=oddSum+array[i];
		}
	}
	
	System.out.println("even sum :"+evenSum);
	System.out.println("odd sum :"+oddSum);
	

}
}