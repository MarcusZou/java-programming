package giraffe;

public class Movie {
	private String title;
	private String director;
	private String rating;
	
	public Movie(String title, String director, String rating) {
		this.setTitle(title);
		this.setDirector(director);
		this.setRating(rating);
	}
	
	public void setRating(String rating) {
		if(rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("NR")) {
			this.rating = rating;
		} else {
			this.rating = "NR";
		}
	}
	
	public String getRating() {
		return rating;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getDirector() {
		return this.director;
	}

}
