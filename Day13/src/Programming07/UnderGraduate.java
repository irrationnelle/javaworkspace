package Programming07;

public class UnderGraduate extends Student {
	private String clubName;
	
	public UnderGraduate() {
		super();
		this.clubName = "������";
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
		return "�̸�: "+this.getName()+", �й�: "+this.getStudentNum()+", ����: "+this.getMajor()+", ����: "+this.getScore()+", ���Ƹ�: "+this.getClubName();
	}
}
