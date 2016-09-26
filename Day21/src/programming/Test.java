package programming;

public class Test {
	public static void main(String[] args) {
		sub();
	}
	
	public static void sub() {
		int[] array = new int[10];
		try {
			int i = array[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArraySize is over");
			System.out.println(e.getMessage());
		}
	}
}
