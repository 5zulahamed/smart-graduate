#include<stdio.h>
int main()
{
    int num,originalnum,reminder,n=0;
    float result = 0.0;

    printf("enter an integer:");
    scanf("%d",&num);

    originalnum = num;

    for(originalnum = num;originalnum!=0;++n){
        originalnum/=10;
    }
    for(originalnum = num;originalnum!=0;originalnum/=10){
        reminder=originalnum%10;
        result += pow(reminder,n);
    }
    if((int)result==num)
        printf("%d is an armstrong number.",num);
    else
        printf("%d is not an armstrong number.",num);
    return 0;
}