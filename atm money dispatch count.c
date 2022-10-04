#include<stdio.h>
#include<conio.h>

    int totalthousand=1000;
    int totalfivehundred=1000;
    int totalonehundred=1000;

    void main()
    {
      unsigned long withdrawamount;
      unsigned long totalmoney;
      int thousand=0,fivehundred=0,onehundred=0;


      printf("enter the amount in multiple of 100:");
      scanf("%lu",&withdrawamount);

      if(withdrawamount %100!=0){
        printf("invalid amount;");
        getch();
        return 0;
      }
      totalmoney = totalthousand*1000+totalfivehundred*500+totalonehundred*100;
      if(withdrawamount>totalmoney){
        printf("sorry,insufficient money");
        getch();
        return 0;
      }
      thousand=withdrawamount/1000;
      if(thousand>totalthousand)
        thousand=totalthousand;
      withdrawamount=withdrawamount-thousand*1000;

      if(withdrawamount>0){
        fivehundred=withdrawamount/500;
        if(fivehundred>totalfivehundred)
            fivehundred=totalfivehundred;
        withdrawamount=withdrawamount-fivehundred*500;
      }
      if(withdrawamount>0)
        onehundred=withdrawamount/100;

      printf("total 1000 note: %d\n",thousand);
      printf("total 500 note: %d\n",fivehundred);
      printf("total 100 note: %d\n,onehundred");

      getch();
    }



