package smartgraduates;

import java.util.Scanner;

public class Floydtriangle {
	
	public static void main(String[] args) {
		
		int rows , number = 1 , counter , j ;
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of value for floyd");
		rows=input.nextInt();
		System.out.println("Floyds triangle");
		System.out.println("*********************");
		
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.println(number+" ");
				number++;
			}
			System.out.println();
			
		}
		
	}
   
    
}
