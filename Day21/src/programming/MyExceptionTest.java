package programming;

public class MyExceptionTest extends Exception {
	public static void checkNegative(int number) throws MyException {
		if (number < 0) {
			throw new MyException("Unable for negative number");
		}
		System.out.println("is not negative number");
	}
	
	public static void main(String[] args) {
		try {
			checkNegative(1);
			checkNegative(-1);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}