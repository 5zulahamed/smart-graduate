package smartgraduates;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		
		Scanner sm = new Scanner(System.in);
		int number;
		
		System.out.println("Entered the number : ");
		number = sm.nextInt();
		
		if(number%2==0){
			
			System.out.println("the number you entered is even");
			
		}
		else {
			
			System.out.println("the number you entered is odd");
			
		}
			
		
		
	}
	
}
