package giraffe;

public class App35_InterfaceInheritance {

	public static void main(String[] args) {
		
		Animal [] animals = {
				new Cow(),
				new Dog(),
				new Bird()
		};
		
		for(int i=0; i<animals.length; i++) {
			animals[i].eat();
			animals[i].speak();
		}
		
		/*
		Cow myCow = new Cow();
		myCow.eat();
		
		Dog myDog = new Dog();
		myDog.eat();
		
		Animal myBird = new Bird();
		myBird.eat();
		*/

	}

}
