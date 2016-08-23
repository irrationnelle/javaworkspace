import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		double cel, fah;
		Scanner input = new Scanner(System.in);
		
		System.out.print("input Fahrenheit: ");
		fah = input.nextDouble();
		
		cel = 5*(fah-32)/9;
		
		System.out.println("Fahrenheit "+fah+" to Celsius: "+cel);
	}

}
