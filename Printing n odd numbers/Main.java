#include <stdio.h>
int main() {
	int n,i,j;
  scanf("%d",&n);
  for(i=0;i<=2*n;i++)
  {
    
    if(i%2==1)
    {
      printf("%d\n",i);
    }
  }
	return 0;
}