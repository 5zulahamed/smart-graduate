package smartgraduates;

import java.util.Scanner;

public class Areaofrectangle {
	public static void main(String[] args) {
		
		System.out.println("enter the width of the rectangle:");
		Scanner scan = new Scanner(System.in);
		 double width = scan.nextInt();
		 System.out.println("enter the length of the rectangle:");
		double length = scan.nextInt();
		
		 double area = length*width;
		 System.out.println("area of the rectangle is : "+area);
	}
	
}
