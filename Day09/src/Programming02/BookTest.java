package Programming02;

public class BookTest {
	public static void main(String[] args) {
		Book b = new Book();
		b.setAuthor("Poe");
		b.setTitle("The Black Cat");
		
		System.out.println(b.getAuthor());
		System.out.println(b.getTitle());
	}
}
