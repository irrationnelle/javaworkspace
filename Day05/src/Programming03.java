import java.util.Scanner;

public class Programming03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input your height: ");
		int height = input.nextInt();
		
		double criteria = 0.9*(height-100);
		
		System.out.print("input your weight: ");
		int weight = input.nextInt();
		
		if(weight == criteria) {
			System.out.println("You have a standard weight");
		}
		else if(weight > criteria) {
			System.out.println("You have a overweight");
		}
		else {
			System.out.println("You have a low weight");
		}
			
	}
}
