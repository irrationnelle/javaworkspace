import java.util.Scanner;

public class Programming06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String text = scan.nextLine();
		
		int countVowel=0; // ���� ���� Ȯ��
		int countConsonant=0; // ���� ���� Ȯ��
		
		for(int i=0; i<text.length(); i++) {
			switch(text.charAt(i)) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				countVowel++;
				break;
			default:
				countConsonant++;
				break;
			}
		}
		
		System.out.println("����: "+countVowel+"��");
		System.out.println("����: "+countConsonant+"��");
	}
}
