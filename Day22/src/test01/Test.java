package test01;

public class Test {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setData(10);
		String str = (String)box.getData();
		
		System.out.println(str);
	}
}
