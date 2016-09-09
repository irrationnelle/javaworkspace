package test03;

public class Student implements Comparable {
	private double grade;
	private String name;
	private String studentNum;
	private String phone;
	
	public Student(double grade, String name, String studentNum, String phone) {
		super();
		this.grade = grade;
		this.setName(name);
		this.studentNum = studentNum;
		this.phone = phone;
	}

	@Override
	public int compareTo(Object other) {
		if(this.grade > ((Student) other).grade)
			return 1;
		else if(this.grade < ((Student) other).grade)
			return -1;
		else
			return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
