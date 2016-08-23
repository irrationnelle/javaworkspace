import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		double rad, result;
		final double pi = 3.14;
		Scanner input = new Scanner(System.in);
		
		System.out.print("input radius: ");
		rad = input.nextDouble();
		
		result = rad*rad*pi;
		
		System.out.println(result);
	}

}
