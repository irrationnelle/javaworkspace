package test02;

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
		if(speed<300) 
			speed += 10;
	}
	
	public void speedDown() {
		if(speed >= 10)
			speed -= 10;
	}
	
	public String toString() {
		return "색상:"+color+", 모델:"+model+", 현재속도:"+speed;
	}
	
	// private으로 선언된 필드 color의 값을 외부에서 변경하기 위해
	public void setColor(String c) {
		color = c;
	}

	// private으로 선언된 필드 color의 값을 외부에서 가져다가 사용하기 위해	
	public String getColor() {
		return color;
	}
	
	public void setModel(String m) {
		model = m;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
}
