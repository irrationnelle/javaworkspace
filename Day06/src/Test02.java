import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int HOUR = 60*60;
		final int MINUTE = 60;
		
		System.out.print("�ð� �Է�(��): ");
		int sec = input.nextInt();
		
		int getHour = sec/HOUR;
		sec %= HOUR;
		int getMinute = sec/MINUTE;
		sec %= MINUTE;
		
		System.out.println(getHour+"�ð� "+getMinute+"�� "+sec+"��");
		
	}
}
