#include <stdio.h>
int main() {
	int n,x,y,z=0;
  scanf("%d",&n);
  while(n>0)
  {
    x=n%10;
    z=z+x;
    n=n/10;
  }
  printf("%d",z);
	return 0;
}