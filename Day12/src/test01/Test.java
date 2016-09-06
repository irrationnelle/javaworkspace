package test01;

public class Test {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		countEven(a);

		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		double p = Math.PI;
		
		System.out.println(p);
		
	}
	
	public static void countEven(int[] list) {
		list[5] = 99;
	}
}
