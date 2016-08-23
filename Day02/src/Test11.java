import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		double cel, fah;
		Scanner input = new Scanner(System.in);
		
		System.out.print("input Fahrenheit: ");
		fah = input.nextDouble();
		
		cel = (double)5/9*(fah-32);
		/*
		 *  5/9를 정수 연산으로 생각해서
		 *  값으로 0이 나오는 것을
		 *  방지하기 위해 type casting으로 (double) 
		 */
				
		System.out.println("Fahrenheit "+fah+" to Celsius: "+cel);
	}

}
