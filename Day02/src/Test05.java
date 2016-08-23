import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		int salary;
		
		Scanner input = new Scanner(System.in);
						
		System.out.print("input your salary: ");
		salary = input.nextInt();
		
		int afterTenYears = salary*120;
		
		System.out.println(afterTenYears);
	}
}
