
public class Test10 {
	public static void main(String[] args) {
		String s = new String("�ȳ��ϼ���. String��ü�� �����ϴ� �����Դϴ�.");
		int len = s.length();
		
		System.out.println(len);
		
		for(int i=0; i<len; i++) {
			char c = s.charAt(i);
			System.out.println(c);
		}
		
	}
}
