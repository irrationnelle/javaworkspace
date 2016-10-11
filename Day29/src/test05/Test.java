package test05;

import java.sql.*;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		// finally에서 close하기 위해 변수 try 밖에서 선언함.
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 완료!");
			
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";
			
			// 2. 커넥션 연결 생성
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 생성 테스트 완료!");
			
			//3. SQL 명령어 작성
			String sql = "SELECT book_id, title, price FROM books";
			
			//4. Statement 생성
			pstmt = con.prepareStatement(sql);
			
			//5. 명령어 실행 -> 5.2 excuteQuery: SELECT 해당
			rs = pstmt.executeQuery();
			
			//6. 5번의 실행 결과값 컨트롤
			while(rs.next()) {
				int bookID = rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				
				System.out.println(bookID + "/" + title + "/" + price);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException 발생");
			e.printStackTrace();
		} finally {
			//7. 자원 반납
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
