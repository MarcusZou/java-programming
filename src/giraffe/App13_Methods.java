package giraffe;

public class App13_Methods {

	public static void main(String[] args) {
		System.out.println("Top");
		sayHi("Mike", 47);
		System.out.println("Bottom");

	}
	
	public static void sayHi(String name, int age) {
		System.out.println("Hello " + name + ", you are " + age);
	}

}
