package Programming04;

public class Magazine extends Book {
	private int issueDate;

	public Magazine() {
		this("�ƽ�", 200, "������", 20160907);
	}
	
	public Magazine(String title, int pageCount, String author, int issueDate) {
		super(title, pageCount, author);
		this.issueDate = issueDate;
	}
	
	public int getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(int issueDate) {
		this.issueDate = issueDate;
	}
}
