package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private final String DB_ID = "root";
	private final String DB_PW = "sds902";
	
	private int bookID;
	private String title;
	private String publisher;
	private int price;
	private String year;
	
	public BookDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loading Complete!");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Fail!");
			e.printStackTrace();
		}
	}
	
	public void createConnection() {
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			System.out.println("Connection Construction Complete!");
		} catch (SQLException e) {
			System.out.println("Connection Construction Fail!");
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int insertBook(BookVO b) {
		String sql = "INSERT INTO books (title, publisher, price, year) VALUES(?, ?, ?, ?)";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getPublisher());
			pstmt.setInt(3, b.getPrice());
			pstmt.setString(4, b.getYear());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DAO Execute Fail!");
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	public int updateBook(BookVO b) {
		String sql = "UPDATE books SET price = ?, year = ? WHERE book_id=?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, b.getPrice());
			pstmt.setString(2, b.getYear());
			pstmt.setInt(3, b.getBookID());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
