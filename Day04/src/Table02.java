import java.util.Scanner;

public class Table02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int ZERO_BASIC = 410;
		final int ONE_BASIC = 910;
		final int TWO_BASIC = 1600;
		final int THREE_BASIC = 3850;
		final int FOUR_BASIC = 7300;
		final int FIVE_BASIC = 12940;
		
		final double ZERO_STEP = 60.7;
		final double ONE_STEP = 125.9;
		final double TWO_STEP = 187.9;
		final double THREE_STEP = 280.6;
		final double FOUR_STEP = 417.7;
		final double FIVE_STEP = 709.5;
		
		
		System.out.println("input your usage for electric: ");
		int elec = input.nextInt();
		//int step = elec/100;
		int remainder;
		if (elec >500) {
			remainder = elec-500;
		}
		else {
			remainder = elec%100;
			if (remainder == 0) {
				remainder = 100;
			}
		}
		
		if (elec > 500) {
			int total = FIVE_BASIC + (int) (remainder*FIVE_STEP) + (int) (100*(ZERO_STEP + ONE_STEP + TWO_STEP + THREE_STEP + FOUR_STEP));
			System.out.println("Total price: "+total);
		}
		else if (elec > 400) {
			int total = FOUR_BASIC + (int) (remainder*FOUR_STEP) + (int) (100*(ZERO_STEP + ONE_STEP + TWO_STEP + THREE_STEP));
			System.out.println("Total price: "+total);
		}
		else if (elec > 300) {
			int total = THREE_BASIC + (int) (remainder*THREE_STEP) + (int) (100*(ZERO_STEP + ONE_STEP + TWO_STEP));
			System.out.println("Total price: "+total);
		}
		else if (elec > 200) {
			int total = TWO_BASIC + (int) (remainder*TWO_STEP) + (int) (100*(ZERO_STEP + ONE_STEP));
			System.out.println("Total price: "+total);
		}
		else if (elec > 100) {
			int total = ONE_BASIC + (int) (remainder*ONE_STEP) + (int) (100*(ZERO_STEP));
			System.out.println("Total price: "+total);
		}
		else {
			int total = ZERO_BASIC + (int) (remainder*ZERO_STEP);
			System.out.println("Total price: "+total);
		}
			
		
	}
}
