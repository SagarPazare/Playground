#include <stdio.h>
int main() {
int n,i,x,product=1,add=0;
  scanf("%d",&n);
  int compare=n;
  while(n!=0)
  {
    x=n%10;
    for(i=1;i<=x;i++)
    {
      product=product*i;
    }
    add=add+product;
    n=n/10;
    product=1;
  }
  if(compare==add)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}