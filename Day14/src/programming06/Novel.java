package programming06;

public class Novel extends Book {
	public Novel() {
		super();
	}
	
	public Novel(String title, String author) {
		super(title, author);
	}
	
	@Override
	public int getLateFee(int day) {
		return 300*day;
	}
}
