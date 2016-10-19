package sample02;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
CREATE TABLE SCOREBOARD (
NO INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(12),
SCORE INT,
);
*/

public class db {
	private final String db_url = "jdbc:mysql://127.0.0.1:3306/tetris";
	private final String db_id = "root";
	private final String db_pw = "sds902";
	
	private Connection con = null;
	
	public db() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver ���� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	void Connection(){
		try {
			con = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("db ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void closeConnect(){
		try {
			con.close();
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<ScoreVO> selectScoreList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ScoreVO> ScoreList = new ArrayList<>();
		try {
			String sql = "SELECT NAME, SCORE FROM SCOREBOARD ORDER BY SCORE DESC";
			// ������ SQL���� ���� DB���� �̸� �����Ͽ� ������ �´�.
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				ScoreVO resultScore = new ScoreVO();
				resultScore.setName(rs.getString(1));
				resultScore.setScore(rs.getInt(2));
				ScoreList.add(resultScore);
			}
		} catch (SQLException e) {
			System.out.println("Dao update ����");
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ScoreList;
	}
}
