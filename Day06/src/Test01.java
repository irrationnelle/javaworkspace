import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num1 = input.nextInt();
		System.out.print("���� �Է�: ");
		int num2 = input.nextInt();
		System.out.print("���� �Է�: ");
		int num3 = input.nextInt();
		
		System.out.println("��հ�: "+ ((num1+num2+num3)/(double)3));
	}
}
