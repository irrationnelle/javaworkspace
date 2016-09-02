package Programming04;

public class Movie {
	private String title;
	private String director;
	private String company;
	
	public Movie(String title, String director, String company) {
		this.title = title;
		this.director = director;
		this.company = company;
	}
	
	public Movie() {
		this("none", "none", "none");
	}
}
