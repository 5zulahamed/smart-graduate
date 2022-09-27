package smartgraduates;

import java.util.Scanner;

public class Areaofcircle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of radius:");
		double radius = sc.nextDouble();
		
		double area = Math.PI *( radius * radius) ;
		System.out.println("area of the circle:"+area);
		
		double circumference = Math.PI *2*radius;
		System.out.println("circumference of the circle:"+circumference);
		
	}

}