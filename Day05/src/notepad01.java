import java.util.Scanner;

public class notepad01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num = input.nextInt();
		int i=1;
		
		while(num != i) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println(i);
	}
}
