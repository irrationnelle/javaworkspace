import java.util.Scanner;

//programming 2�� ����
public class Programming02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		num1 = input.nextInt();
		
		System.out.print("������ �Է��Ͻÿ�: ");
		num2 = input.nextInt();
		
		int firstNum = (num1>num2) ? num1 : num2;
		int secondNum = (num1>num2) ? num2 : num1;
		int resultQuotient = (num1>num2)? num1/num2 : num2/num1;
		int resultRemainder = (num1>num2)? num1%num2 : num2%num1;
		
		System.out.println(firstNum+"�� "+secondNum+"���� ���� ���� "+resultQuotient+"�̰� �������� "+resultRemainder+"�̴�.");
	}

}
