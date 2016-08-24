import java.util.Scanner;

public class Test15 {
	// LAB
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner input = new Scanner(System.in);
		System.out.println("수도입니까?(수도: 1, 수도아님: 0): ");
		int capital = input.nextInt();
		boolean getCapital = (capital == 1);
		
		System.out.println("인구(단위 백만): ");
		int population = input.nextInt();
		boolean getPopulation = (population >= 100);
		
		System.out.println("부자의 수(단위 백만): ");
		int rich = input.nextInt();
		boolean getRich = (rich >= 50);
		
		boolean getMetropolis = (getCapital&&getPopulation) || getRich;
		
		System.out.println("메트로 폴리스 여부: "+getMetropolis);
	}

}
