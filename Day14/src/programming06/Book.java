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
		 *�� if���� ������� �ʰ�
		 *Book Ŭ������ �ƴ� ��ü�� �� ���
		 *Book type�� ����ȯ �� �� ������ �߻��Ѵ�. 
		 */
		if(obj instanceof Book){   
			/*
			 *�ֻ� �θ� Ŭ������ �����ϴ� ���� obj����
			 *�翬�� getNumber()�޼ҵ尡 ���� ������
			 *Book���� ����ȯ�� �����ش�. 
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
