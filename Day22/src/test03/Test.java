package test03;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(100);
		intList.add(10);
		intList.add(55);
		intList.add(913);
		intList.add(3);
		
		System.out.println(intList.size());
		System.out.println("intList의 2번째 값: "+intList.get(1));
		
		for(int i=0; i<intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		intList.remove(1);
		System.out.println("intList의 2번째 값: "+intList.get(1));
		for(int i=0; i<intList.size(); i++) {
			System.out.println(intList.get(i));
		}
	}
}
