import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int PRICE = 100;
		final double DISCOUNT = 0.9;
		int count;
		
		do {
			System.out.print("구매 개수: ");
			count = input.nextInt();
			if(count < 0) {
				System.out.println("구매 개수는 0보다 커야 합니다!");
			}
		} while(count < 0);
		
		int pay;
		
		if(count >= 10) {
			pay = (int) (PRICE*DISCOUNT*count);
		}
		else{
			pay = (int) (PRICE*count); 
		}
		
		System.out.println(count+"개의 전체 가격: "+pay);
	}
}
