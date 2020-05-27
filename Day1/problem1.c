#include<stdio.h>

int main(){
	int doorNumber,sum=0,temp,temp2,i;
	
	printf("Enter the two digit doon number: ");
	scanf("%d",&doorNumber);
	
		while(doorNumber>=100 || doorNumber<10){ //here we check tha entered number is a two digit number or not 
				printf("Entered number is incorrect , Please enter the two digit doon number: ");
	scanf("%d",&doorNumber);
       
    }
  
   temp = doorNumber%10; //here we calculate remainder of number
   temp2 = doorNumber/10;
   	sum= temp+temp2; //
   	
   	printf("Sum of entered number is : %d",sum);
   	
  
	return 0;
}
