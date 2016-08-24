import java.util.Scanner;

//programming 10¹ø ¹®Á¦
public class Programming10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input Small Triangle Width(cm): ");
		double smallTriWidth = input.nextDouble();
		
		System.out.print("input Big Triangle Width(cm): ");
		double bigTriWidth = input.nextDouble();
		
		System.out.print("input Small Triangle Height(cm): ");
		double smallTriHeight = input.nextDouble();
		
		double bigTriHeight = (bigTriWidth*smallTriHeight)/smallTriWidth;
		System.out.println("Big Triangle Height is "+bigTriHeight+"cm");
	}

}
