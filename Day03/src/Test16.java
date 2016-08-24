import java.util.Scanner;

// PPT 도전문제
public class Test16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input year: ");
		int year=input.nextInt();
		
		boolean leapYear = (year%4==0 && year%100 != 0) || (year%400 == 0);
		System.out.println(year+" is leap year: "+leapYear);
	}
	
}
