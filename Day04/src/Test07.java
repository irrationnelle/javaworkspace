import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input year: ");
		int years = input.nextInt();
		
		System.out.print("input month: ");
		int month = input.nextInt();
		int days;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if((years%4 == 0 && years%100 != 0) || (years%400 == 0)) {
				days = 29;
				break;
			}
			else {
				days = 28;
				break;
			}
		default :
			days = 0;
			break;
		}
		
		System.out.println(years+" year "+month+" month has "+days+" days");		
	}
	
}
