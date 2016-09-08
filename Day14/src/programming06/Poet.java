package programming06;

public class Poet extends Book {
	public Poet() {
		super();
	}
	
	public Poet(String title, String author) {
		super(title, author);
	}
	
	@Override
	public int getLateFee(int day) {
		return 200*day;
	}
}
