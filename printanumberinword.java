package smartgraduates;

import java.util.Scanner;

public class Printnumberinword {

	public static void main(String[] args) {
		
		int number;
		System.out.println("enter the number:");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		if(number== 1) {
			System.out.println("ONE");
		}else if(number==2){
			System.out.println("TWO");
		}else if(number==3) {
			System.out.println("THREE");
		}else if(number==4) {
			System.out.println("FOUR");
		}else if(number==5){
			System.out.println("FIVE");
		}else if(number==6) {
			System.out.println("SIX");
		}else if(number==7) {
			System.out.println("SEVEN");
		}else if(number==8) {
			System.out.println("EIGHT");
		}else if(number==9) {
			System.out.println("NINE");
		}else {
			System.out.println("OTHER");
		}
		
	}
	
}
