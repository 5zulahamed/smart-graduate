package smartgraduates;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num = 0;
		int reversenum =0;
		
		System.out.println("input your number and press enter :");
		
		 num = scn.nextInt();
		 
		 while( num != 0 ) {
			 reversenum=reversenum*10;
			 reversenum=reversenum+num%10;
			 num=num/10;
		 }
		 System.out.println("the reversenum of the num you enterd is :"+reversenum);
		
	}
	
}
