import java.util.Scanner;

//programming 6¹ø ¹®Á¦
public class Programming06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int VALUE_500 = 500;
		final int VALUE_100 = 100;
		final int VALUE_50 = 50;
		final int VALUE_10 = 10;
		
		int count500, count100, count50, count10;
		
		System.out.print("500won count: ");
		count500 = input.nextInt();
		
		System.out.print("100won count: ");
		count100 = input.nextInt();

		System.out.print("50won count: ");
		count50 = input.nextInt();
		
		System.out.print("10won count: ");
		count10 = input.nextInt();
		
		int total = count500*VALUE_500 + count100*VALUE_100 + count50*VALUE_50 + count10*VALUE_10;
		
		System.out.println("Total Money is "+total+"won");
	}

}
