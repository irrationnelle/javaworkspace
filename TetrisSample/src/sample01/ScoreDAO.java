package sample01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sample01.ScoreVO;

public class ScoreDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	// ���� DB ������ �����ϰ� �ʹٸ� �Ʒ� DB_URL�� IP�ּҿ� ��Ʈ�� ������ ��
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/tetris";
	private final String DB_ID = "root";
	private final String DB_PW = "sds902";
	
	private int userID;
	private String name;
	private int score;
	
	public ScoreDAO() {
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
	
	public int insertScore(ScoreVO scoreVO) {
		String sql = "INSERT INTO scoreboard (name, score) VALUES(?, ?)";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, scoreVO.getName());
			pstmt.setInt(2, scoreVO.getScore());
			
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
	
	public int deleteScore(int userID) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "DELETE FROM scoreboard WHERE book_id=?";
			// 4. PreparedStatement ��ü ����
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userID);
			
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
	
	public ScoreVO selectScore(int userID) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ScoreVO resultScore = null;
		
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "SELECT user_id, name, score "
					   + " FROM scoreboard WHERE book_id = ?";
			// 4. PreparedStatement ��ü ����
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userID);
			
			// 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��.
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				resultScore = new ScoreVO();
				resultScore.setUserID(rs.getInt(1));
				resultScore.setName(rs.getString(2));
				resultScore.setScore(rs.getInt(3));
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
		return resultScore;
	}
	
	public List<ScoreVO> selectScoreList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ScoreVO> scoreList = new ArrayList<>();
		
		try {
			// 3. SQL ��ɾ� �ۼ�
			String sql = "SELECT user_id, name, score "
					   + " FROM scoreboard WHERE book_id = ?";
			// 4. PreparedStatement ��ü ����
			pstmt = con.prepareStatement(sql);
			
			// 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��.
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ScoreVO resultScore = new ScoreVO();
				resultScore.setUserID(rs.getInt(1));
				resultScore.setName(rs.getString(2));
				resultScore.setScore(rs.getInt(3));
				
				scoreList.add(resultScore);
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
		return scoreList;
	}
	
}
