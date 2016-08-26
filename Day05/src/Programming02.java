import java.util.Scanner;

public class Programming02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input one word: ");
		char alphabet = input.next().charAt(0);
		
		switch(alphabet) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':		
			System.out.println(alphabet+" is vowel");
			break;
		default:
			System.out.println(alphabet+" is consonants");
		}
	} 
}
