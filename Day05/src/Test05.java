import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num=input.nextInt();
		
		for(int i=1; i<num+1; i++) {
			for(int j=(num+1-i); j>0; j--){
				System.out.print(" ");
			}
			
			for(int j=0; j<(2*i-1); j++) {
				System.out.print("*");				
			}
			System.out.println();
					
		}
	}
}
