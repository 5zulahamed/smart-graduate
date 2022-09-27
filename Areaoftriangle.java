package smartgraduates;

import java.util.Scanner;

public class Areaoftriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the base value :");
		double base = scan.nextDouble();
		System.out.println("enter the height value :");
		double height = scan.nextDouble();
		
		double area = (base*height)/2;
		System.out.println("area of the triangle :"+area);
		
	}
	
}
