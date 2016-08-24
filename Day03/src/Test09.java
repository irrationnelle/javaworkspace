
public class Test09 {
	public static void main(String[] args) {
		int a = 100, b, c, d, e, f;

		b = a++ + 10;
		c = --b * 2;
		d = a + a++;
		e = d-- - 50;
		f = a + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
