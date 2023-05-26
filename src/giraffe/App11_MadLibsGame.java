package giraffe; 

import java.util.Scanner;

public class App11_MadLibsGame {
	public static void main(String [] args){
		
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("Enter a color: ");
		String color = keyboardInput.nextLine();
		System.out.print("Enter a plural noun: ");
		String pluralNoun = keyboardInput.nextLine();
		System.out.print("Enter a celebrity: ");
		String celebrity = keyboardInput.nextLine();
		
		System.out.println("Roses are " + color + " \n"
						 + pluralNoun + " are blue \n"
						 + "I love " + celebrity);
		keyboardInput.close();
	}
}
