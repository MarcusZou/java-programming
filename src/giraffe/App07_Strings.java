package giraffe;

public class App07_Strings {
	public static void main(String [] args) {
		
		System.out.println("Giraffe \"Academy\"");
		System.out.println("Giraffe \\ Academy");
		System.out.println("Giraffe \n Academy");
		System.out.println("Giraffe Academy "
							+ "is soooooooooooooo"
							+ " greeeeeaaaaat!\n");
		
		// methods for strings
		String phrase = "Giraffe Academy";
		// indexNum:     0123456789....
		System.out.println( phrase.toUpperCase() );
		System.out.println( phrase.toLowerCase() );
		System.out.println( phrase.length() );
		System.out.println( phrase.contains("Dog") );
		System.out.println( phrase.charAt(0) );
		System.out.println( phrase.indexOf("A") );
		System.out.println( phrase.indexOf("a") );
		System.out.println( phrase.lastIndexOf("a") );
		System.out.println( phrase.substring(8) );
		System.out.println( phrase.substring(8, 11) );
		// Grab the first word excluding the space
		System.out.println( phrase.substring(0, phrase.indexOf(" ")) );
		
	}

}
