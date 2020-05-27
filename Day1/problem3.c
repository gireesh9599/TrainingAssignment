#include<stdio.h>

int main(){
	int weight[3],i,j,temp;
	
	printf("Enter the weights of three horses: ");
	for(i=0;i<=2;i++) //here we store the values in array named weight
	scanf("%d",&weight[i]);

//	now we sort the array using bubble sort
for(i=0;i<=2;i++){
	for(j=0;j<=2-i;j++){
		if(weight[j]<weight[j+1]){
			temp=weight[j];
			weight[j]=weight[j+1];
			weight[j+1]=temp;
		}
	}
}
	if(weight[0]==weight[1] || weight[0]==weight[2])
		printf("Entered weights are not distinct values");
		else
		printf("The horse of the weight with maximum weight: %d",weight[0]);

	return 0;
}
