import java.util.Scanner;

public class Programming04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String text = scan.nextLine();
		int count = 0;
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i)==' ') {
				count++;
			}
		}
		
		System.out.println("�Էµ� �ܾ� ��: "+(count+1));
	}
}
