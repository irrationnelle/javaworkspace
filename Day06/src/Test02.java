import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int HOUR = 60*60;
		final int MINUTE = 60;
		
		System.out.print("시간 입력(초): ");
		int sec = input.nextInt();
		
		int getHour = sec/HOUR;
		sec %= HOUR;
		int getMinute = sec/MINUTE;
		sec %= MINUTE;
		
		System.out.println(getHour+"시간 "+getMinute+"분 "+sec+"초");
		
	}
}
