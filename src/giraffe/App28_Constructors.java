package giraffe;

public class App28_Constructors {

	public static void main(String[] args) {

		Bookc book1 = new Bookc("Harry Potter", "JK Rowling", 500, "English");

		Bookc book2 = new Bookc("The 4 hour workweek", "Tim Ferries", 300, "English");
			
		System.out.println(book1.author);
		System.out.println(book2.pages);

	}

}
