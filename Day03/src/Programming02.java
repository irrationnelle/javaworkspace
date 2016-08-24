import java.util.Scanner;

//programming 2번 문제
public class Programming02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("정수를 입력하시오: ");
		num1 = input.nextInt();
		
		System.out.print("정수를 입력하시오: ");
		num2 = input.nextInt();
		
		int firstNum = (num1>num2) ? num1 : num2;
		int secondNum = (num1>num2) ? num2 : num1;
		int resultQuotient = (num1>num2)? num1/num2 : num2/num1;
		int resultRemainder = (num1>num2)? num1%num2 : num2%num1;
		
		System.out.println(firstNum+"을 "+secondNum+"으로 나눈 몫은 "+resultQuotient+"이고 나머지는 "+resultRemainder+"이다.");
	}

}
