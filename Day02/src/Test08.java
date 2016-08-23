import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		double mile, result;
		final double ToKilo = 1.609;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input mile: ");
		mile = input.nextDouble();
		
		result = mile * ToKilo;
		
		System.out.println(result);
	}

}
