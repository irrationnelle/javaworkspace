import java.util.Scanner;

// programming 1¹ø ¹®Á¦
public class Programming01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input your name: ");
		String name = input.nextLine();
		
		System.out.print("input your age: ");
		int age = input.nextInt();
		
		System.out.println("Your name is "+name);
		System.out.println("Your age is "+age);		
	}

}
