package giraffe;

public class App32_ClassAttributes {

	public static void main(String[] args) {
		// Class Attributes
		Song holiday = new Song("Holiday", "Green Day", 200);
		Song americanIdiot = new Song("American Idiot", "Green Day", 168);
		
		System.out.println(holiday.getSongsCount());
		System.out.println(americanIdiot.getSongsCount());
		
		Song africa = new Song("Africa", "Toto", 280);
		
		System.out.println(holiday.getSongsCount());
		System.out.println(americanIdiot.getSongsCount());
		System.out.println(africa.getSongsCount());

	}

}
