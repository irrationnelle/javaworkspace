package test05;

import java.sql.*;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		// finally���� close�ϱ� ���� ���� try �ۿ��� ������.
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 1. ����̹� �ε�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� �Ϸ�!");
			
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";
			
			// 2. Ŀ�ؼ� ���� ����
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("Ŀ�ؼ� ���� �׽�Ʈ �Ϸ�!");
			
			//3. SQL ��ɾ� �ۼ�
			String sql = "SELECT book_id, title, price FROM books";
			
			//4. Statement ����
			pstmt = con.prepareStatement(sql);
			
			//5. ��ɾ� ���� -> 5.2 excuteQuery: SELECT �ش�
			rs = pstmt.executeQuery();
			
			//6. 5���� ���� ����� ��Ʈ��
			while(rs.next()) {
				int bookID = rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				
				System.out.println(bookID + "/" + title + "/" + price);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException �߻�");
			e.printStackTrace();
		} finally {
			//7. �ڿ� �ݳ�
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
