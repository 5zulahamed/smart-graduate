#include<stdio.h>
#include<conio.h>
void main()
{
    float num1;
    double num2;

    printf("enter a number:");
    scanf("%f",&num1);
    printf("enter a number:");
    scanf("%lf",&num2);

    printf("num1 = %f\n",num1);
    printf("num2 = %lf",num2);
    return 0;
}
