package LAB;

public class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.setName(name);
		this.setAge(age);
		System.out.println("Human ������ ��� �Ϸ�");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name: "+this.name+", age: "+this.age;
	}
	
	public String getProfession() {
		return "�ΰ�";
	}
	
	public static void main(String[] args) {
		Human h1 = new Human("����", 18);
		Human h2 = new Human("����", 21);
		Human h3 = new Human("���", 50);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
	}
}
