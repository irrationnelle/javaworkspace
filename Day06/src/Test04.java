import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = input.nextLine();
		System.out.print("����: ");
		int age = input.nextInt();
		
		System.out.println("�Է��� �̸�: "+name);
		System.out.println("�Է��� ����: "+age);
		
	}
}
