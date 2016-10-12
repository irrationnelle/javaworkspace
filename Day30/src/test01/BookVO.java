package test01;

// VO, DTO, Bean���� �Ҹ���� ������ Ŭ����
// ���� ������ �ϳ��� ��ü�� ��Ƽ� �����ϰų� ������ �� �����.
// �Ʒ��� å �ѱǿ� ���� ���� 5������ �ϳ��� ��ü�� ������ �� �ֵ��� Ŭ������ �����Ͽ���.
public class BookVO {
	// DB�� Column ���� ������ ������ �ʵ�. ������ �ݵ�� Column���� ������ ������ �־�� �ϴ� �� �ƴ�.
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
