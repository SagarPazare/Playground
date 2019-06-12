#include<stdio.h>
int main()
{
  int a,x,t,sum;
  scanf("%d",&a);
  x=(a/100);
  t=(a%10);
  sum=x+t;
  printf("%d",sum);
  return 0;
}