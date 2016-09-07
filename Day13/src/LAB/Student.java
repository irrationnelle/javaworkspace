package LAB;

public class Student extends Human {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.setMajor(major);
		System.out.println("Student ������ ��� �Ϸ�");
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
		return "�л�";
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("����", 21, "��ǻ��");
		Student s2 = new Student("����", 22, "�濵");
		Student s3 = new Student("����", 24, "����");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
