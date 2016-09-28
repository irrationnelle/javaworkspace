package programming05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws OverRangeException {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Double> array = new ArrayList<Double>();
		
		for(int i=0; i<10; i++) {
			System.out.print("input number: ");
			array.add(scan.nextDouble());
			if(array.get(i) < 0.0 || array.get(i) > 10.0) {
				throw new OverRangeException("You must input between 0.0 and 10.0");
			}
		}
		
		Collections.sort(array);
		
		double total = 0;
		for(int i=1; i<9; i++) {
			total += array.get(i);
		}
		
		System.out.println("심사위원 점수 합산: "+total);
	}
	
	static class OverRangeException extends Exception {
		public OverRangeException(String msg) {
			super(msg);
		}
	}
}
