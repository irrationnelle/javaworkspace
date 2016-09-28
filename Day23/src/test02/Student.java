package test02;

public class Student {
	private int number;
	private String name;
	
	public Student(int number, String name) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
