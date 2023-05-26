package giraffe;

public class App08_MathNumbers {
	public static void main(String [] args) {
		
		System.out.println( 3 * 4);
		System.out.println( 3 / 4);
		System.out.println( 3 / 4.0);
		
		// modulus operator
		System.out.println( "Modulus of 10 % 3 is " + 10 % 3);
		
		int myInt = 3;
		double myDouble = -5.5;
		System.out.println(myDouble + myInt);
		
		// Math class
		System.out.println( Math.abs(myDouble) );
		System.out.println( Math.pow(myInt, 3) );
		System.out.println( Math.sqrt(36) );
		System.out.println( Math.min(myInt, 6) );
		System.out.println( Math.round(myDouble) );
		System.out.println( Math.random() );
		
	}

}
