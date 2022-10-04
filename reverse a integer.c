#include<stdio.h>
int main()
{
    int n,reverse = 0,reminder;

    printf("enter an integer:");
    scanf("%d",&n);

    while(n!=0){
        reminder = n%10;
        reverse = reverse*10+reminder;
        n/=10;
    }
    printf("reversed number = %d",reverse);

    return 0;
}
