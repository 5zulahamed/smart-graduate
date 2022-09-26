package smartgraduates;

public class Swaptwonumbersexercise {

	public static void main(String[] args) {
		
		float first = 34.5f , second = 35.5f ;
		
		System.out.println("--BEFORE SWAP--");
		System.out.println("first number is " +first);
		System.out.println("second number is " +second);
		
		float temprory = first;
		
		first = second ;
		second = temprory ;
		
		System.out.println("--AFTER SWAP--");
		System.out.println("first number is " +first);
		System.out.println("second number is " +second);
		
	}
	
}
