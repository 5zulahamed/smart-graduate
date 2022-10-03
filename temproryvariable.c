#include<stdio.h>
int main()
{
    double first , second , temp ;
    printf("enter the first number:");
    scanf("%d",&first);
    printf("enter the second number:");
    scanf("%d",&second);

    first = second;
    second = temp;
    temp = first;

    printf("after swapping variable 1= %.2lf\n",first);
    printf("after swapping variable 2= %.2lf",second);
    return 0;
}
