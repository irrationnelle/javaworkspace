package test02;

public class Test {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		box.setData("Hello");
		
		String str = box.getData();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		
		box2.setData(10);
		
		Integer intNum = box2.getData();
		System.out.println(intNum);
	}
}
