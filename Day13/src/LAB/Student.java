package LAB;

public class Student extends Human {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.setMajor(major);
		System.out.println("Student 생성자 출력 완료");
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "name: "+super.getName()+", age: "+super.getAge()+", major: "+this.major; 
	}
	
	@Override
	public String getProfession() {
		return "학생";
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("명진", 21, "컴퓨터");
		Student s2 = new Student("미현", 22, "경영");
		Student s3 = new Student("용준", 24, "경제");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
