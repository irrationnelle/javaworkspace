package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// ���α׷� ���� �߿� �����ͺ��̽� �۾��� �ʿ��� ������ �Ʒ��� BookDAO Ŭ���� ��ü�� Ȱ���ϵ��� ����
public class BookDAO {
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private final String DB_ID = "root";
	private final String DB_PW = "sds902";
	
	private Connection con;
	
	public BookDAO() {
		// 1. ����̹� �ε�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loading Complete!");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Fail!");
			e.printStackTrace();
		}
	}
	
	public void createConnection() {
		// 2. Connection ����
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			System.out.println("Connection Construction Complete!");
		} catch (SQLException e) {
			System.out.println("Connection Construction Fail!");
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			con.close();
			System.out.println("Connection End");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//DB�� Book �� ���� ������ �Է����ִ� �޼ҵ�
	public int insertBook(BookVO b) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "INSERT INTO books (title, publisher, price, year)"
					   + "VALUES(?, ?, ?, ?)";
			// 4. PreparedStatement ��ü ����
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getPublisher());
			pstmt.setInt(3, b.getPrice());
			pstmt.setString(4, b.getYear());
			
			// 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��.
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DAO Insert error");
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
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "UPDATE books SET price = ?, year = ? WHERE book_id = ?";
			// 4. PreparedStatement ��ü ����
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, b.getPrice());
			pstmt.setString(2, b.getYear());
			pstmt.setInt(3, b.getBookID());
			
			// 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��.
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DAO Update error");
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
	
	public int deleteBook(int bookID) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "DELETE FROM books WHERE book_id=?";
			// 4. PreparedStatement ��ü ����
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookID);
			
			// 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��.
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DAO Delete error");
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
	
	public BookVO selectBook(int bookID) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookVO resultBook = null;
		
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "SELECT book_id, title, year, price, publisher "
					   + " FROM books WHERE book_id = ?";
			// 4. PreparedStatement ��ü ����
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookID);
			
			// 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��.
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				resultBook = new BookVO();
				resultBook.setBookID(rs.getInt(1));
				resultBook.setTitle(rs.getString(2));
				resultBook.setYear(rs.getString(3));
				resultBook.setPrice(rs.getInt(4));
				resultBook.setPublisher(rs.getString(5));
			}
		} catch (SQLException e) {
			System.out.println("DAO Select error");
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return resultBook;
	}
	
	public List<BookVO> selectBookList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookVO> bookList = new ArrayList<>();
		
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "SELECT book_id, title, year, price, publisher "
					   + " FROM books";
			// 4. PreparedStatement ��ü ����
			pstmt = con.prepareStatement(sql);
			
			// 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��.
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BookVO resultBook = new BookVO();
				resultBook.setBookID(rs.getInt(1));
				resultBook.setTitle(rs.getString(2));
				resultBook.setYear(rs.getString(3));
				resultBook.setPrice(rs.getInt(4));
				resultBook.setPublisher(rs.getString(5));
				
				bookList.add(resultBook);
			}
		} catch (SQLException e) {
			System.out.println("DAO Select error");
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return bookList;
	}
}
