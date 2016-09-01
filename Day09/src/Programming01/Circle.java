package Programming01;

public class Circle {
	private int cx;
	private int cy;
	private int r;
	
	public double area() {
		System.out.print("반지름 "+r+"의 원의 넓이: ");
		final double PI = 3.14159;
		double result = PI*r*r;
		return result;
	}

	public int getCx() {
		return cx;
	}

	public void setCx(int x) {
		cx = x;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int y) {
		cy = y;
	}
	
	public int getRad() {
		return r;
	}

	public void setRad(int rad) {
		r = rad;
	}
}
