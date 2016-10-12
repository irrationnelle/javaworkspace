package ex01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookDAO dao = new BookDAO();
		int bookID;
		String title;
		String publisher;
		String year;
		int price;
		BookVO b;
		dao.createConnection();
		
		System.out.println("1. Insert 2. Update");
		System.out.print("Num>> ");
		int num = scan.nextInt();
		scan.nextLine();
		
		switch(num) {
		case 1:
			System.out.print("Title: ");
			title = scan.nextLine();
			System.out.print("Publisher: ");
			publisher = scan.nextLine();
			System.out.print("Year: ");
			year = scan.nextLine();
			System.out.print("Price: ");
			price = scan.nextInt();
			
			b = new BookVO(title, publisher, price, year);
			System.out.println("���� ���: "+dao.insertBook(b));
			break;
		case 2:
			System.out.print("������ å��ȣ: ");
			bookID = scan.nextInt();
			System.out.print("������ Price: ");
			price = scan.nextInt();
			System.out.print("������ Year: ");
			year = scan.next();
			
			b = new BookVO(bookID, price, year);
			System.out.println("���� ���: "+dao.updateBook(b));
		}
		
		
		dao.closeConnection();
	}
}
