package programming04;

public class Person implements Comparable {
	private String name;
	private int height;
	
	public Person(String name, int height) {
		this.setName(name);
		this.setHeight(height);
	}
	
	@Override
	public int compareTo(Object other) {
		if(this.height > ((Person) other).height) {
			return 1;
		} else if((this.height < ((Person) other).height)) {
			return -1;
		} else {
			return 0;
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
