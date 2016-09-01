package test05;

public class Car {
	// 기본 설정으로 클래스 내에서 필드의 초기화가 가능
	/*
	 * 	new 키워드로 인스턴스를 생성하면
	 *  생성된 인스턴스의 필드값은 아래와 같이 가진다.
	 */
	private int speed = 0;
	private String color = "WHITE";
	private String model = "Citroen";
	
	public void speedUp() {
		// 엄한 값이 들어가지 않도록 제한을 걸어준다
		speed += 10;
	}

	//메소드 오버로딩
	public void speedUp(int s) {
		speed += s;
	}
	
}
