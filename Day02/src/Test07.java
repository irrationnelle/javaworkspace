import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		double width, height;
		double area, perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input width : ");
		width = input.nextInt();
		
		System.out.print("input height : ");
		height = input.nextInt();
		
		area = width * height;
		perimeter = (width + height)*2;
		
		System.out.println("area : "+area+", perimeter: "+perimeter);
	}

}
