import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�:");
		x = input.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�:");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
	}

}
