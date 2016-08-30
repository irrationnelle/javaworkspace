import java.util.Scanner;

public class Programming01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String modelNumber = scan.nextLine();
		
		// 문자열 길이 검사
		System.out.println("문자열 길이: "+modelNumber.length());
		if(modelNumber.length() > 6) {
			System.out.println("문자열 길이 6 초과함.");
			System.out.println("문자열 검증: "+false);
			return;
		}
		
		
		//문자열 조건 검사 for문
		for(int i=0; i<modelNumber.length(); i++) {
			//알파벳 여부 검사 boolean 값
			boolean checkAlphabet = ((modelNumber.charAt(i) >= 'a' && modelNumber.charAt(i) <= 'z') || (modelNumber.charAt(i) >= 'A' && modelNumber.charAt(i) <= 'Z'));
			if (i<2) {
				if(!checkAlphabet) {
					System.out.println("문자열 검증: "+checkAlphabet);
					return;
				}
			}
			//숫자 여부 검사 boolean 값. 따라서 !checkAlphabet 값을 가진다.
			else if(i>=2) {
				if(checkAlphabet) {
					System.out.println("문자열 검증: "+!checkAlphabet);
					return;
				}
			}
			
		}
		
		System.out.println("문자열 검증: "+true);
		
	}
}
