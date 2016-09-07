package Programming04;

public class Book {
	private String title;
	private int pageCount;
	private String author;
	
	public Book() {
		this("ºñ±ØÀÇ Åº»ý", 400, "´ÏÃ¼");
	}
	
	public Book(String title, int pageCount, String author) {
		this.title = title;
		this.pageCount = pageCount;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
