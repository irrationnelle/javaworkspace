package test03;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2;
		
		c2 = c1;
		/*
		 * 이미 c1은 Car 자료형을 가지는 참조 변수이기 때문에
		 * 동일한 참조변수인 c2는 c1의 주소값을 공유한다.
		 */
		
		c1.speed = 100;
		c1.model = "Audi";
		
		System.out.println(c2.toString());
		
		c1 = null;
		
	}
}
