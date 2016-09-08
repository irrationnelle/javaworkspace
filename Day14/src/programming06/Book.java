package programming06;

public class Book {
	private int number;
	private String title;
	private String author;
	public static int memberNum = 1000;
	
	public Book() {		}
	
	public Book(String title, String author) {
		this.number = memberNum++;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public boolean equals(Object obj) {
		/*
		 *이 if문을 통과하지 않고
		 *Book 클래스가 아닌 객체가 올 경우
		 *Book type로 형변환 할 때 오류가 발생한다. 
		 */
		if(obj instanceof Book){   
			/*
			 *최상 부모 클래스를 참조하는 변수 obj에는
			 *당연히 getNumber()메소드가 없기 때문에
			 *Book으로 형변환을 시켜준다. 
			 */
			return this.getNumber() == ((Book)obj).getNumber();
		}else{
			return false;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getLateFee(int day) {
		return day*0;
	}
}
