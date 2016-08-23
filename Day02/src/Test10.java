import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		double rad, volume;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input radius: ");
		rad = input.nextDouble();
		
		volume = 4.0/3.0*rad*rad*rad;
		// 4/3일 경우, 정수값인 1이 나오기 때문에 확실하게 실수 표기해준다.
		
		System.out.println("Sphere volume: "+volume);
	}

}
