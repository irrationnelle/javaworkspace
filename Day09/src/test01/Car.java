package test01;

public class Car {
	// 기본 설정으로 클래스 내에서 필드의 초기화가 가능
	/*
	 * 	new 키워드로 인스턴스를 생성하면
	 *  생성된 인스턴스의 필드값은 아래와 같이 가진다.
	 */
	public int speed = 0;
	public String color = "WHITE";
	public String model = "Citroen";
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedDown() {
		speed -= 10;
	}
	
	public String toString() {
		return "색상:"+color+", 모델:"+model+", 현재속도:"+speed;
	}
}
