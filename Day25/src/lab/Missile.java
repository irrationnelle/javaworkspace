package lab;

import java.awt.event.KeyEvent;

public class Missile extends GraphicObject {
	boolean isLaunched = false;
	
	public Missile(String name) {
		super(name);
		y = -200;
	}
	
	public void update() {
		if(isLaunched) y -= 1;
		if(y < -100) isLaunched = false;
	}
	
	public void keyPressed(KeyEvent event, int x, int y) {
		if(event.getKeyCode() == KeyEvent.VK_SPACE) {
			isLaunched = true;
			this.x = x;
			this.y = y;
		}
	}
}
