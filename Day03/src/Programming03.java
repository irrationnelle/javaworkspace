import java.util.Scanner;

//programming 3¹ø ¹®Á¦
public class Programming03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input your height: ");
		double height = input.nextDouble();
		
		double toInch = height/2.54;
		int getFeet = (int)toInch/12;
		double getInch = toInch%12;
		
		System.out.println(height+"cm = "+getFeet+" feet "+getInch+" inches");
	}

}
