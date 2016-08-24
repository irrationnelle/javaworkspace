import java.util.Scanner;

//programming 9¹ø ¹®Á¦
public class Programming09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input power: ");
		double power = input.nextDouble();
		
		System.out.print("input size: ");
		double size = input.nextDouble();
		
		System.out.println("Pressure is "+(power/size)+"pa");
	}

}
