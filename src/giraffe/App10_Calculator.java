package giraffe;
import java.util.Scanner;

public class App10_Calculator {
	public static void main(String [] args){
		
		try (Scanner keyboardInput = new Scanner(System.in)) {
			System.out.print("Enter in first Number: ");
			double num1 = keyboardInput.nextDouble();
			System.out.print("Enter in second Number: ");
			double num2 = keyboardInput.nextDouble();
			System.out.println(num1 + num2);
		}
		
		// What if a user enters a string, such as, Dog? it will throw an error!
	}

}
