import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		double rad, volume;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input radius: ");
		rad = input.nextDouble();
		
		volume = 4/3*rad*rad*rad;
		
		System.out.println("Sphere volume: "+volume);
	}

}
