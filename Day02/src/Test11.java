import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		double cel, fah;
		Scanner input = new Scanner(System.in);
		
		System.out.print("input Fahrenheit: ");
		fah = input.nextDouble();
		
		cel = (double)5/9*(fah-32);
		/*
		 *  5/9�� ���� �������� �����ؼ�
		 *  ������ 0�� ������ ����
		 *  �����ϱ� ���� type casting���� (double) 
		 */
				
		System.out.println("Fahrenheit "+fah+" to Celsius: "+cel);
	}

}
