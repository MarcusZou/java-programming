package giraffe;

public class App27_ClassesObjects_Continued {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title = "Harry Potter";
		book1.author = "JK Rowling";
		book1.pages = 500;
		book1.language = "English";
		
		Book book2 = new Book();
		book2.title = "The 4 hour workweek";
		book2.author = "Tim Ferries";
		book2.pages = 300;
		book2.language = "English";
		
		System.out.println(book1.author);
		System.out.println(book2.pages);

	}

}
