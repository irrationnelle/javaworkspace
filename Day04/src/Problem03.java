import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input alphabet: ");
		char alphabet = input.next().charAt(0);
		
		int criteria = (int) alphabet;
		
		if (criteria >= 97 && criteria <= 122) {
			System.out.println(alphabet+" is Small letter");
		}
		else if (criteria >= 65 && criteria <= 90) {
			System.out.println(alphabet+" is Capital letter");
		}
		else {
			System.out.println(alphabet+" is not alphabet");
		}
			
	}
}
