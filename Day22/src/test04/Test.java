package test04;

import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		LinkedList<String> strList = new LinkedList<>();
		strList.add("jsp");
		strList.add("spring");
		strList.add("java");
		strList.add("android");
		strList.add("oracle");
		
		System.out.println(strList);
		System.out.println("strList의 사이즈: "+strList.size());
		System.out.println("strList의 2번 원소: "+strList.get(2));
		
		strList.remove(1);
		System.out.println("1번 삭제 후 strList의 사이즈: "+strList.size());
		System.out.println("1번 삭제 후 strList의 2번 원소: "+strList.get(2));
	}
}
