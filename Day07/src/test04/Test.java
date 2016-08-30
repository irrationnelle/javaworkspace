package test04;

public class Test {
	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(i+10);
		
		String s = i+""; // "10"
		
		System.out.println(s+10);
		
		String s2 = "123";
		System.out.println(s2+10);
		
		int i2 = Integer.parseInt(s2);
		System.out.println(i2+10);
		double d = Double.parseDouble(s2);
		System.out.println(d+10);
	}
}
