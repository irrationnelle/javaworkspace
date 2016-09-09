package programming04;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Person[] personArr = new Person[3];
		
		personArr[0] = new Person("rase", 110);
		personArr[1] = new Person("tyr", 200);
		personArr[2] = new Person("lc", 150);
		
		System.out.println(getMaximum(personArr));
	}
	
	public static String getMaximum(Person[] array) {
		Arrays.sort(array);
		return array[array.length-1].getName();
	}
	
//	public static String getMaximum(Person[] array) {
//		int maximum = 0;
//		String nameTallPerson = "unknown";
//		for(int i=0; i<array.length; i++) {
//			if(maximum < array[i].getHeight()) {
//				maximum = array[i].getHeight();
//				nameTallPerson = array[i].getName();
//			} else {
//				continue;
//			}
//		}
//		return nameTallPerson;
//	}
}
