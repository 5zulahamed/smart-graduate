package smartgraduates;

import java.util.Scanner;

public class Areaofsquare {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the side value:");
		double side = scan.nextInt();
		
		double area = side*side;
		System.out.println("area of the square:"+area);
		
	}
	
}