import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int PRICE = 100;
		final double DISCOUNT = 0.9;
		int count;
		
		do {
			System.out.print("���� ����: ");
			count = input.nextInt();
			if(count < 0) {
				System.out.println("���� ������ 0���� Ŀ�� �մϴ�!");
			}
		} while(count < 0);
		
		int pay;
		
		if(count >= 10) {
			pay = (int) (PRICE*DISCOUNT*count);
		}
		else{
			pay = (int) (PRICE*count); 
		}
		
		System.out.println(count+"���� ��ü ����: "+pay);
	}
}
