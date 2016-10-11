package test04;

import java.sql.*;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		// finally���� close�ϱ� ���� ���� try �ۿ��� ������.
		Connection con = null;
		PreparedStatement pstmt = null;
		
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
			Scanner scan = new Scanner(System.in);
			System.out.print("Title: ");
			String title = scan.nextLine();
			System.out.print("Publisher: ");
			String publisher = scan.nextLine();
			System.out.print("Price: ");
			int price = scan.nextInt();
			System.out.print("Year: ");
			String year = scan.next();
			
			String sql = "insert into books(title, publisher, price, year)"
					+ "values(?, ?, ?, ?)";
			
			//4. Statement ����
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, publisher);
			pstmt.setInt(3, price);
			pstmt.setString(4, year);
			
			//5. ��ɾ� ���� -> 5.1 excuteUpdate: insert, update, delete �ش�
			int result = pstmt.executeUpdate();
			
			//6. 5���� ���� ����� ��Ʈ��
			System.out.println("SQL ���� �Ϸ� ���: "+result);
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
