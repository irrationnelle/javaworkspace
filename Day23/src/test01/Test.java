package test01;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = {"cat", "dog", "bird", "cat"};
		
		for(String a : sample) {
			if(! s.add(a)) {
				System.out.println("Dupplication word: "+a);
			}
		}
		
		System.out.println("String array size: "+s.size());
		System.out.println("String elements"+s);
	}
}
