import java.util.Scanner;

//programming 4¹ø ¹®Á¦
public class Programming04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.14159; 
		System.out.print("input cylinder radius: ");
		int radius = input.nextInt();
		
		System.out.print("input cylinder height: ");
		int height = input.nextInt();
		
		double getVolume = PI*radius*radius*height;
		System.out.println("Cylinder Volume is "+getVolume);
	}

}
