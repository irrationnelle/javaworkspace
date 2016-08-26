import java.util.Scanner;

public class Programming11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int JAN = 31;
		final int FEB = 28;
		final int MAR = 31;
		final int APR = 30;
		final int MAY = 31;
		final int JUN = 30;
		final int JUL = 31;
		final int AUG = 31;
		final int SEP = 30;
		final int OCT = 31;
		final int NOV = 30;
//		final int DEC = 31;
		
		
		System.out.print("input year: ");
		int years = input.nextInt();
		
		System.out.print("input month: ");
		int month = input.nextInt();
		
		System.out.print("input days: ");
		int days = input.nextInt();
		
		int total_days = 0;
		total_days += (years-1900)*365;
		total_days += (years-1900)/4;
		
		boolean leapYear = (years%4==0 && years%100 != 0) || (years%400 == 0);
		if(leapYear && (month==1 || month==2)) {
			total_days -= 1;
		}
		
		int sum_days = 0;			
		switch(month) {
		case 1:
			sum_days = days; 
			total_days += sum_days;
			break;
		case 2:
			sum_days = days + JAN; 
			total_days += sum_days;
			break;
		case 3:
			sum_days = days + JAN + FEB; 
			total_days += sum_days;
			break;
		case 4:
			sum_days = days + JAN + FEB + MAR; 
			total_days += sum_days;
			break;
		case 5:
			sum_days = days + JAN + FEB + MAR + APR; 
			total_days += sum_days;
			break;
		case 6:
			sum_days = days + JAN + FEB + MAR + APR + MAY; 
			total_days += sum_days;
			break;
		case 7:
			sum_days = days + JAN + FEB + MAR + APR + MAY + JUN; 
			total_days += sum_days;
			break;
		case 8:
			sum_days = days + JAN + FEB + MAR + APR + MAY + JUN + JUL; 
			total_days += sum_days;
			break;
		case 9:
			sum_days = days + JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG; 
			total_days += sum_days;
			break;
		case 10:
			sum_days = days + JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP;  
			total_days += sum_days;
			break;
		case 11:
			sum_days = days + JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP + OCT;  
			total_days += sum_days;
			break;
		case 12:
			sum_days = days + JAN + FEB + MAR + APR + MAY + JUN + JUL + AUG + SEP + OCT + NOV;  
			total_days += sum_days;
			break;
		}
		
		int result = (total_days%7);
	
		switch(result) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		}
				
	}
}
