#include<stdio.h>
int main()
{
  int a,r;
  scanf("%d",&a);
  r=a%4;
  if(r==0)
    printf("Leap year");
  else
    printf("Not Leap year");
  return 0;
}