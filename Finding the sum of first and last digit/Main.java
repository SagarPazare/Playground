#include <stdio.h>
int main() {
	int n,x,y;
  scanf("%d",&n);
  x=n%10;
  while(n>10)
  {
    n=n/10;
  }
  y=n+x;
  printf("%d",y);
	return 0;
}