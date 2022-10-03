#include<stdio.h>
int main()
{
    int dividend,divisor,quotient,reminder;
    printf("enter dividend: ");
    scanf("%d",&dividend);
    printf("enter divisor: ");
    scanf("%d",&divisor);

    quotient = dividend / divisor;

    reminder = dividend % divisor;

    printf("quotient = %d\n",quotient);
    printf("reminder = %d",reminder);
    return 0;

}
