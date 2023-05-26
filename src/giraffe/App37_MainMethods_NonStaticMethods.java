package giraffe;

public class App37_MainMethods_NonStaticMethods {

	public static void main(String[] args) {
		App37_MainMethods_NonStaticMethods myApp = new App37_MainMethods_NonStaticMethods(); 
		myApp.sayHi("Mike");

	}
	
	public void sayHi(String name) {
		System.out.println("Hello " + name);
	}

}
