import java.util.Scanner;

//programming 7¹ø ¹®Á¦
public class Programming07 {

	public static void main(String[] args) {
		final double VALUE_PYEONG = 3.3058;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input pyeong(Korean areal unit): ");
		int pyeong = input.nextInt();
		double toSquareMeter = pyeong*VALUE_PYEONG;
		
		System.out.println(pyeong+" pyeong is "+toSquareMeter+"m^2");
	}

}
