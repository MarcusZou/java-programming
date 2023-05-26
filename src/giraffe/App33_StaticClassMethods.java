package giraffe;

public class App33_StaticClassMethods {

	public static void main(String[] args) {
		
		// Static class is a class that you don't need to create an instance of it.
		Prints.sayGoodbye();
		
		// Print out the static variable (CONSTANT) from our custom class
		System.out.println(Prints.feetInMile);
		// print out the CONSTANT of Math.PI
		System.out.println(Math.PI);

	}

}
