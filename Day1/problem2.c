#include<stdio.h>

int main(){
	int date;
	
	printf("Enter the date: ");
	scanf("%d",&date);
	
		while(date>=31 || date<1){ //here we check the entered number is in range of 1 to 31 or not 
				printf("Entered date is incorrect it should be between 1 to 31 \nPlease enter the date: ");
	scanf("%d",&date);
       
    }
  /*Now we check tha date is even or odd
  */
   if(date%2==0){
   	printf("Cars with Even registration numbers are permitted today");
   }
   	else{
   			printf("Cars with Odd registration numbers are permitted today");
	   }
   
   	
  
	return 0;
}
