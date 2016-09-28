package programming06;

public class Student {
	private String name;
	private String phoneNum;
	private String address;
	
	public Student(String name, String phoneNum, String address) {
		this.setName(name);
		this.phoneNum = phoneNum;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
