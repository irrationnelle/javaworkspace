package programming06;

public class Test {
	public static void main(String[] args) {
		Book book = new Book();
		
		calc(new Poet());
		
	}
	
	public static void calc(Book book) {
		System.out.print("��ü��: ");
		System.out.println(book.getLateFee(3));
	}
}
