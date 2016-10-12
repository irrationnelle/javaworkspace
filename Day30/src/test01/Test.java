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
			System.out.println("1:책추가  2:책수정 3:책삭제 4:책조회 5:전체책목록 -1:종료");
			System.out.print("입력>>");
			int select = scan.nextInt();
			scan.nextLine();
			
			if(select == -1) {
				break;
			}
			
			switch(select) {
			case 1:	// 책 추가
				System.out.print("Title: ");
				title = scan.nextLine();
				System.out.print("Publisher: ");
				publisher = scan.nextLine();
				System.out.print("Year: ");
				year = scan.nextLine();
				System.out.print("Price: ");
				price = scan.nextInt();
				
				book = new BookVO(title, publisher, price, year);
				System.out.println("추가 결과: "+dao.insertBook(book));
				break;
			case 2: // 책 수정
				System.out.print("수정할 책 번호: ");
				bookID = scan.nextInt();
				System.out.print("새로운 가격: ");
				price = scan.nextInt();
				System.out.print("새로운 연도: ");
				year= scan.next();
				
				book = new BookVO(bookID, price, year);
				System.out.println("수정 결과: "+dao.updateBook(book));
				break;
			case 3:	// 책 삭제
				System.out.print("삭제할 책 번호: ");
				bookID = scan.nextInt();
				
				System.out.println("삭제 결과: "+dao.deleteBook(bookID));
				break;
			case 4:	// 책 검색
				System.out.print("검색할 책 번호: ");
				bookID = scan.nextInt();
				
				book = dao.selectBook(bookID);
				if(book == null) {
					System.out.println("해당 번호의 책이 없습니다.");
				} else {
					System.out.println(book);
				}
				break;
			case 5:	// 모든 책 목록 보기
				bookList = dao.selectBookList();
				
				if(bookList.size() == 0) {
					System.out.println("현재 등록된 책이 없습니다.");
				} else {
					for(BookVO b: bookList) {
						System.out.println(b);
					}
				}
				break;
			}
		}
		
		dao.closeConnection();
		System.out.println("--도서관리 프로그램 종료--");
	}
}
