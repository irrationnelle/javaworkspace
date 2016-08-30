import java.util.Scanner;

public class Programming05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String text = scan.nextLine();
				
		System.out.print("문자열 역순: ");
		for(int i = text.length(); i>0; i--) {
			System.out.print(text.charAt(i-1));
		}
	}
}
