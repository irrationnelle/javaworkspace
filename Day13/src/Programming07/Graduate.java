package Programming07;

public class Graduate extends Student {
	private String assistantType;
	private double scholarRate;
	
	public Graduate() {
		super();
		this.assistantType = "��������";
		this.scholarRate = 0.5;
	}

	public Graduate(String name, int studentNum, String major, double score, String assistantType, double scholarRate) {
		super(name, studentNum, major, score);
		this.assistantType = assistantType;
		this.scholarRate = scholarRate;
	}

	public String getAssistantType() {
		return assistantType;
	}
	
	public void setAssistantType(String assistantType) {
		this.assistantType = assistantType;
	}
	
	public double getScholarRate() {
		return scholarRate;
	}
	
	public void setScholarRate(double scholarRate) {
		this.scholarRate = scholarRate;
	}
	
	@Override
	public String toString() {
		return "�̸�: "+this.getName()+", �й�: "+this.getStudentNum()+", ����: "+this.getMajor()+", ����: "+this.getScore()+", ���� Ÿ��: "+this.getAssistantType()+", ���б� ����: "+this.getScholarRate();
	}
}
