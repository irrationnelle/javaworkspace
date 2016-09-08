package programming05;

public class TwoDimShape extends Shape {
	//TwoDimShape 클래스에 width와 height가 존재하는 것은
	// 타원 클래스 같은 경우 전혀 의미가 없기 때문에
	// 변수 선언을 하지 않는 것이 좋음.
	// 차라리 비워두는 게 나음
	private int width;
	private int height;
	
	public TwoDimShape() {
		super();
	}
	
	public TwoDimShape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		// 이런 식으로 getArea()를 설정하는 것은 잘못됨
		// 차라리 return 0; 로 두는 것이 낫다.
		return (double)(width*height);
	}
}
