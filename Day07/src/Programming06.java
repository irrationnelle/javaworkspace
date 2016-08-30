import java.util.Scanner;

public class Programming06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String text = scan.nextLine();
		
		int countVowel=0; // 자음 갯수 확인
		int countConsonant=0; // 모음 갯수 확인
		
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
		
		System.out.println("모음: "+countVowel+"개");
		System.out.println("자음: "+countConsonant+"개");
	}
}
