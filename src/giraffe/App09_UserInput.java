package giraffe;
import java.util.Scanner;

public class App09_UserInput {
	public static void main(String [] args) {
		
		// Scanner class
		try (
			Scanner keyboardInput = new Scanner(System.in)) {
			System.out.print("Enter your Name: ");
			String name = keyboardInput.nextLine();
			
			System.out.print("Enter your Age: ");
			int age = keyboardInput.nextInt();
			
			System.out.println("Hey " + name + ", you are " + age + " years old!");
		}
		
	}

}
