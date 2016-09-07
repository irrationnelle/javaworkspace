package Programming07;

public class Student {
	private String name;
	private int studentNum;
	private String major;
	private double score;
	
	public Student() {
		this("아년석", 2008, "프랑스어과", 3.5);
	}
	
	public Student(String name, int studentNum, String major, double score) {
		this.name = name;
		this.studentNum = studentNum;
		this.major = major;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "이름: "+this.getName()+", 학번: "+this.getStudentNum()+", 전공: "+this.getMajor()+", 학점: "+this.getScore();
	}
}
