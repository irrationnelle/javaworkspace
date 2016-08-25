import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		int i=1;
				
		Scanner input = new Scanner(System.in);
		System.out.println("input number: ");
		int num=input.nextInt();
				
		while(i<=9) {
			System.out.println(num+"x"+i+"="+(num*i));
			i++;
		}
		
		System.out.println("Exit. i: "+i);
	}
}
