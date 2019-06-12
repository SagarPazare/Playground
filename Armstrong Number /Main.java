#include <stdio.h>
int main() {
	int n,i,j;
  scanf("%d",&n);
  int temp=n;
  int compare=n;
  int count=0;
  int remainder;
  int total=0;
  
  while(temp!=0)
  {
    temp=temp/10;
    count++;
  }
  
  for(i=0;i<=count;i++)
  {
    remainder=n%10;
    total=total+pow(remainder,count);
    n=n/10;
  }
  
  if(compare==total)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}