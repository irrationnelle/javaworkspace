package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 프로그램 진행 중에 데이터베이스 작업이 필요한 시점에 아래의 BookDAO 클래스 객체를 활용하도록 설계
public class BookDAO {
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private final String DB_ID = "root";
	private final String DB_PW = "sds902";
	
	private Connection con;
	
	public BookDAO() {
		// 1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loading Complete!");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Fail!");
			e.printStackTrace();
		}
	}
	
	public void createConnection() {
		// 2. Connection 연결
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
	
	//DB에 Book 한 권의 정보를 입력해주는 메소드
	public int insertBook(BookVO b) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			// 3. SQL 명령어 작성
			String sql = "INSERT INTO books (title, publisher, price, year)"
					   + "VALUES(?, ?, ?, ?)";
			// 4. PreparedStatement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getPublisher());
			pstmt.setInt(3, b.getPrice());
			pstmt.setString(4, b.getYear());
			
			// 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기.
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
			// 3. SQL 명령어 작성
			String sql = "UPDATE books SET price = ?, year = ? WHERE book_id = ?";
			// 4. PreparedStatement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, b.getPrice());
			pstmt.setString(2, b.getYear());
			pstmt.setInt(3, b.getBookID());
			
			// 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기.
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
			// 3. SQL 명령어 작성
			String sql = "DELETE FROM books WHERE book_id=?";
			// 4. PreparedStatement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookID);
			
			// 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기.
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
			// 3. SQL 명령어 작성
			String sql = "SELECT book_id, title, year, price, publisher "
					   + " FROM books WHERE book_id = ?";
			// 4. PreparedStatement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookID);
			
			// 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기.
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
			// 3. SQL 명령어 작성
			String sql = "SELECT book_id, title, year, price, publisher "
					   + " FROM books";
			// 4. PreparedStatement 객체 생성
			pstmt = con.prepareStatement(sql);
			
			// 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기.
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
