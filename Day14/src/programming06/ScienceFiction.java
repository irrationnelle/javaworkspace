package programming06;

public class ScienceFiction extends Book {
	public ScienceFiction() {
		super();
	}
	
	public ScienceFiction(String title, String author) {
		super(title, author);
	}
	
	@Override
	public int getLateFee(int day) {
		return 600*day;
	}
}
