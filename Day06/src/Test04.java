import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = input.nextLine();
		System.out.print("나이: ");
		int age = input.nextInt();
		
		System.out.println("입력한 이름: "+name);
		System.out.println("입력한 나이: "+age);
		
	}
}
