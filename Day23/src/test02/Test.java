package test02;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(200801881, new Student(200801881, "�Ƴ⼮"));
		map.put(200901234, new Student(200901234, "������"));
		map.put(201301114, new Student(201301114, "Ÿ����"));
		
		System.out.println(map);
		
		map.remove(200801881);
		
		System.out.println(map);
		
		map.put(200701234, new Student(200701234, "�Ƴ⼮"));
		
		System.out.println(map.get(200701234));
		
		for(Map.Entry<Integer, Student> s: map.entrySet()) {
			Integer key = s.getKey();
			Student value = s.getValue();
			System.out.println("Number :"+key);
			System.out.println("Info: "+value);
		}
	}
}
