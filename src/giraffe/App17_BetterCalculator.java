package giraffe;
import java.util.Scanner;

public class App17_BetterCalculator {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Enter an number: ");
		double num1 = keyboardInput.nextDouble();
		
		System.out.println("Enter an operator: ");
		String op = keyboardInput.next();
		
		System.out.println("Enter another number: ");
		double num2 = keyboardInput.nextDouble();
		
		keyboardInput.close();
		
		if(op.equals("+")) {
			System.out.println( num1 + num2 );
		} else if(op.equals("-")) {
			System.out.println( num1 - num2 );
		} else if(op.equals("*")) {
			System.out.println( num1 * num2 );
		} else if(op.equals("/")) {
			System.out.println( num1 / num2 );
		} else {
			System.out.println( "invalid operator" );
		}
		

	}

}
