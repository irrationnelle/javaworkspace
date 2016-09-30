package lab;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
	Enemy enemy;
	SpaceShip spaceship;
	Missile missile;
	
	public MyPanel() {
		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
		enemy = new Enemy("enermy.png");
		spaceship = new SpaceShip("spaceship.png");
		missile = new Missile("missile.png");
		
		class MyThread extends Thread {
			public void run() {
				while(true) {
					enemy.update();
					spaceship.update();
					missile.update();
					repaint();
					try { Thread.sleep(50);} 
					catch (InterruptedException e) { }
				}
			}
		}
		Thread t = new MyThread();
		t.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		enemy.draw(g);
		spaceship.draw(g);
		missile.draw(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		spaceship.keyPressed(e);
		missile.keyPressed(e, spaceship.x, spaceship.y);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {	}

	@Override
	public void keyTyped(KeyEvent e) {	}
}
