import java.util.Scanner;

public class Programming01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String modelNumber = scan.nextLine();
		
		// ���ڿ� ���� �˻�
		System.out.println("���ڿ� ����: "+modelNumber.length());
		if(modelNumber.length() > 6) {
			System.out.println("���ڿ� ���� 6 �ʰ���.");
			System.out.println("���ڿ� ����: "+false);
			return;
		}
		
		
		//���ڿ� ���� �˻� for��
		for(int i=0; i<modelNumber.length(); i++) {
			//���ĺ� ���� �˻� boolean ��
			boolean checkAlphabet = ((modelNumber.charAt(i) >= 'a' && modelNumber.charAt(i) <= 'z') || (modelNumber.charAt(i) >= 'A' && modelNumber.charAt(i) <= 'Z'));
			if (i<2) {
				if(!checkAlphabet) {
					System.out.println("���ڿ� ����: "+checkAlphabet);
					return;
				}
			}
			//���� ���� �˻� boolean ��. ���� !checkAlphabet ���� ������.
			else if(i>=2) {
				if(checkAlphabet) {
					System.out.println("���ڿ� ����: "+!checkAlphabet);
					return;
				}
			}
			
		}
		
		System.out.println("���ڿ� ����: "+true);
		
	}
}
