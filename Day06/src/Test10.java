
public class Test10 {
	public static void main(String[] args) {
		String s = new String("안녕하세요. String객체를 생성하는 문장입니다.");
		int len = s.length();
		
		System.out.println(len);
		
		for(int i=0; i<len; i++) {
			char c = s.charAt(i);
			System.out.println(c);
		}
		
	}
}
