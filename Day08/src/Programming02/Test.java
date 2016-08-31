package Programming02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �迭 ũ�� ����
		final int ARRAY_SIZE = 10;
		
		// �迭 ��(* ����) �ʱ�ȭ
		int[] array = new int[ARRAY_SIZE];
		for(int i=0; i<array.length; i++) {
			array[i] = 0;
		}
		
		// �迭 ��(* ����) ���ϱ� ���� for��
		for(int i=0; i<ARRAY_SIZE; i++) {
			System.out.print((i+1)+"��° ���� �Է�: ");
			int num = scan.nextInt();
			if(num%10 == 0) {
				num /= 10;
				array[num-1]++;
			}
			else {
				num /= 10;
				array[num]++;
			}
		}
		
		int loopNum=1; // 1 - 10, 11 - 21, ... ��Ÿ���� ���� ����
		// �迭 ��(* ����) ������� * ���
		for(int i=0; i<array.length; i++) {
			System.out.print(loopNum+" - "+(loopNum+9)+": ");
			for(int j=0; j<array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
			loopNum += 10;
		}
		
	}
}
