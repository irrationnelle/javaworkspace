
public class Test12 {
	public static void main(String[] args) {
		int a = 1, b = 1, c= 10, d = 100;
		
		boolean r1 = (a>b) && (b >= c);
		boolean r2 = (c <= a) || (a >= d);
		boolean r3 = (a == c) || (b != a);
		boolean r4 = !(d>c);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}
