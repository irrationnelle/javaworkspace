package test05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int x=10, y=10;
	private int size=50;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		addMouseMotionListener(new MyMouseListener());
		
		requestFocus();
		setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(x, y, size, size);
	}
	
	class MyMouseListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			x = e.getX()-(size/2);
			y = e.getY()-(size/2);
			repaint();
//			System.out.println("Moved!"+e.getPoint());
//			System.out.println(e.getX());
//			System.out.println(e.getY());
		}
		
		
	}
}
