import java.util.Scanner;

public class Test15 {
	// LAB
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner input = new Scanner(System.in);
		System.out.println("�����Դϱ�?(����: 1, �����ƴ�: 0): ");
		int capital = input.nextInt();
		boolean getCapital = (capital == 1);
		
		System.out.println("�α�(���� �鸸): ");
		int population = input.nextInt();
		boolean getPopulation = (population >= 100);
		
		System.out.println("������ ��(���� �鸸): ");
		int rich = input.nextInt();
		boolean getRich = (rich >= 50);
		
		boolean getMetropolis = (getCapital&&getPopulation) || getRich;
		
		System.out.println("��Ʈ�� ������ ����: "+getMetropolis);
	}

}
