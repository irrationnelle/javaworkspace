import java.util.Scanner;

public class Table02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int ONE_BASIC = 410;
		final int TWO_BASIC = 910;
		final int THREE_BASIC = 1600;
		final int FOUR_BASIC = 3850;
		final int FIVE_BASIC = 7300;
		final int SIX_BASIC = 12940;
		
		final double ONE_STEP = 60.7;
		final double TWO_STEP = 125.9;
		final double THREE_STEP = 187.9;
		final double FOUR_STEP = 280.6;
		final double FIVE_STEP = 417.7;
		final double SIX_STEP = 709.5;
		
		
		System.out.println("input your usage for electric: ");
		int elec = input.nextInt();
		int step = elec/100;
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
		
		if (step > 5) {
			int total = SIX_BASIC + (int) (remainder*SIX_STEP) + (int) (100*(ONE_STEP + TWO_STEP + THREE_STEP + FOUR_STEP + FIVE_STEP));
			System.out.println("Total price: "+total);
		}
		else if (step > 4) {
			int total = FIVE_BASIC + (int) (remainder*FIVE_STEP) + (int) (100*(ONE_STEP + TWO_STEP + THREE_STEP + FOUR_STEP));
			System.out.println("Total price: "+total);
		}
		else if (step > 3) {
			int total = FOUR_BASIC + (int) (remainder*FOUR_STEP) + (int) (100*(ONE_STEP + TWO_STEP + THREE_STEP));
			System.out.println("Total price: "+total);
		}
		else if (step > 2) {
			int total = THREE_BASIC + (int) (remainder*THREE_STEP) + (int) (100*(ONE_STEP + TWO_STEP));
			System.out.println("Total price: "+total);
		}
		else if (step > 1) {
			int total = TWO_BASIC + (int) (remainder*TWO_STEP) + (int) (100*(ONE_STEP));
			System.out.println("Total price: "+total);
		}
		else {
			int total = ONE_BASIC + (int) (remainder*ONE_STEP);
			System.out.println("Total price: "+total);
		}
			
		
	}
}
