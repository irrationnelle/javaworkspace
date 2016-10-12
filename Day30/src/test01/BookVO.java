package test01;

// VO, DTO, Bean으로 불리우는 형태의 클래스
// 여러 정보를 하나의 객체에 담아서 전달하거나 저장할 때 사용함.
// 아래는 책 한권에 대한 정보 5가지를 하나의 객체에 저장할 수 있도록 클래스를 설계하였음.
public class BookVO {
	// DB의 Column 수와 동일한 갯수의 필드. 하지만 반드시 Column수와 동일한 갯수가 있어야 하는 건 아님.
	private int bookID;
	private String title;
	private String publisher;
	private int price;
	private String year;
	
	public BookVO() {}
	
	public BookVO(int bookID, String title, String publisher, int price, String year) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		this.year = year;
	}
	
	public BookVO(String title, String publisher, int price, String year) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		this.year = year;
	}
	
	public BookVO(int bookID, int price, String year) {
		super();
		this.bookID = bookID;
		this.price = price;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "BookVO [bookID=" + bookID + ", title=" + title + ", publisher=" + publisher + ", price=" + price
				+ ", year=" + year + "]";
	}

	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
}
