import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n번째까지의 피보나치 수열: ");
		int count = input.nextInt();
		
		int Fibo_01 = 0;
		int Fibo_02 = 1;
		System.out.print(Fibo_01+" ");
		System.out.print(Fibo_02+" ");
		int Fibo_03;
		
		for(int i=0; i<(count-2); i++) {
			Fibo_03 = Fibo_01 + Fibo_02;
			System.out.print(Fibo_03+" ");
			Fibo_01 = Fibo_02;
			Fibo_02 = Fibo_03;
		}
		
		
		
		
	}
}
