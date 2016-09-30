package lab;

public class Enemy extends GraphicObject {
	int dx = -10;
	
	public Enemy(String name) {
		super(name);
		x = 500;
		y = 0;
	}
	
	public void update() {
		x += dx;
		if(x < 0) {
			dx = +10;
		}
		if(x > 500) {
			dx = -10;
		}
	}
}
