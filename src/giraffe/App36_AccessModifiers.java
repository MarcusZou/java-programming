package giraffe;

public class App36_AccessModifiers {

	public static void main(String[] args) {
		
		/* 	3 Types of Access Modifiers -
			Private: only be accessible by entity in the same class;
			Public: can be accessed from other class;
			Protected: can be accessed only by other entity in the same package.
		*/
		
		Song holiday = new Song("Holiday", "Green Day", 300);
		System.out.println(holiday.getTitle());

	}

}
