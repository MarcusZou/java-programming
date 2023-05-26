package giraffe;

public class App31_GettersSetters {

	public static void main(String[] args) {
		// Getters and Setters
		Movie movie1 = new Movie("The Avengers", "Joss Whedon", "PG-13");
		Movie movie2 = new Movie("Step Brothers", "Adam McKay", "R");
		
		// valid ratings: G, PG, PG-13, R, NR
		movie1.setRating("Dog");
		
		System.out.println( movie1.getRating() );
		System.out.println( movie2.getDirector() );
	}

}
