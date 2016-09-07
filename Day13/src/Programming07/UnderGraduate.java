package Programming07;

public class UnderGraduate extends Student {
	private String clubName;
	
	public UnderGraduate() {
		super();
		this.clubName = "어있자";
	}

	public UnderGraduate(String name, int studentNum, String major, double score, String clubName) {
		super(name, studentNum, major, score);
		this.clubName = clubName;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	@Override
	public String toString() {
		return "이름: "+this.getName()+", 학번: "+this.getStudentNum()+", 전공: "+this.getMajor()+", 학점: "+this.getScore()+", 동아리: "+this.getClubName();
	}
}
