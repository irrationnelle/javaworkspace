package Programming01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input=1;
		int[] sit = new int[10];
		for(int i=0; i<sit.length; i++) {
			sit[i] = 0;
		}
		
		while(input!=0) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(Yes:1, No:0) ");
			input = scan.nextInt();
			
			if(input == 0) {
				break;
			}
			System.out.println("������ ������´� ������ �����ϴ�.");
			System.out.println("--------------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("--------------------------------");
			for(int i=0; i<sit.length; i++) {
				System.out.print(sit[i]+" ");
			}
			System.out.println();
			System.out.println("���° �¼��� �����Ͻðڽ��ϱ�?");
			input = scan.nextInt();
			sit[(input-1)] = 1;
			System.out.println("����Ǿ����ϴ�.");
		}
	}
}
