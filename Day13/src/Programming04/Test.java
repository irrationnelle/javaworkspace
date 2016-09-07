package Programming04;

public class Test {
	public static void main(String[] args) {
		Book book = new Book();
		
		Magazine magazine = new Magazine();
		
		System.out.println(book.getTitle());
		System.out.println(book.getPageCount());
		System.out.println(book.getAuthor());
		
		System.out.println();
		
		System.out.println(magazine.getTitle());
		System.out.println(magazine.getPageCount());
		System.out.println(magazine.getAuthor());
		System.out.println(magazine.getIssueDate());
	}
}
