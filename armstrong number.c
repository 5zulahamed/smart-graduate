#include<stdio.h>
int main()
{
    int num,originalnum,reminder,result = 0;
    printf("enter a three-digit integer:");
    scanf("%d",&num);
    originalnum=num;
     while(originalnum != 0){
        reminder = originalnum%10;
        result +=reminder*reminder*reminder;
        originalnum/=10;
     }
     if(result==num)
        printf("%d is an armstrong number.",num);
     else
        printf("%d is not an armstrong number.",num);

     return 0;
}
