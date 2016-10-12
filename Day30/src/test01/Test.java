package test01;

import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		BookDAO dao = new BookDAO();
		dao.createConnection();
		Scanner scan = new Scanner(System.in);
		
		String title, publisher, year;
		int bookID, price;
		
		BookVO book;
		List<BookVO> bookList;
		
		while(true) {
			System.out.println("1:å�߰�  2:å���� 3:å���� 4:å��ȸ 5:��üå��� -1:����");
			System.out.print("�Է�>>");
			int select = scan.nextInt();
			scan.nextLine();
			
			if(select == -1) {
				break;
			}
			
			switch(select) {
			case 1:	// å �߰�
				System.out.print("Title: ");
				title = scan.nextLine();
				System.out.print("Publisher: ");
				publisher = scan.nextLine();
				System.out.print("Year: ");
				year = scan.nextLine();
				System.out.print("Price: ");
				price = scan.nextInt();
				
				book = new BookVO(title, publisher, price, year);
				System.out.println("�߰� ���: "+dao.insertBook(book));
				break;
			case 2: // å ����
				System.out.print("������ å ��ȣ: ");
				bookID = scan.nextInt();
				System.out.print("���ο� ����: ");
				price = scan.nextInt();
				System.out.print("���ο� ����: ");
				year= scan.next();
				
				book = new BookVO(bookID, price, year);
				System.out.println("���� ���: "+dao.updateBook(book));
				break;
			case 3:	// å ����
				System.out.print("������ å ��ȣ: ");
				bookID = scan.nextInt();
				
				System.out.println("���� ���: "+dao.deleteBook(bookID));
				break;
			case 4:	// å �˻�
				System.out.print("�˻��� å ��ȣ: ");
				bookID = scan.nextInt();
				
				book = dao.selectBook(bookID);
				if(book == null) {
					System.out.println("�ش� ��ȣ�� å�� �����ϴ�.");
				} else {
					System.out.println(book);
				}
				break;
			case 5:	// ��� å ��� ����
				bookList = dao.selectBookList();
				
				if(bookList.size() == 0) {
					System.out.println("���� ��ϵ� å�� �����ϴ�.");
				} else {
					for(BookVO b: bookList) {
						System.out.println(b);
					}
				}
				break;
			}
		}
		
		dao.closeConnection();
		System.out.println("--�������� ���α׷� ����--");
	}
}
