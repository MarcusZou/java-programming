package giraffe;

public class Cow implements Animal {

	@Override
	public void speak() {
		System.out.println("Moo Moo");		
	}

	@Override
	public void eat() {
		System.out.println("Eats some grass");		
	}

}
