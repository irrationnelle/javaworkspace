import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		double rad, volume;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input radius: ");
		rad = input.nextDouble();
		
		volume = 4.0/3.0*rad*rad*rad;
		// 4/3�� ���, �������� 1�� ������ ������ Ȯ���ϰ� �Ǽ� ǥ�����ش�.
		
		System.out.println("Sphere volume: "+volume);
	}

}
