import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		int price, pay, changemoney;
		double tax;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input price: ");
		price=input.nextInt();
		
		System.out.print("input payment: ");
		pay=input.nextInt();
		
		tax = price/10;
		changemoney = pay - price;
		
		System.out.println("price: "+price);
		System.out.println("payment: "+pay);
		System.out.println("tax: "+tax);
		System.out.println("change money: "+changemoney);
	}

}
