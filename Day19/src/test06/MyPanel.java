package test06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int x=10, y=10;
	private int size=50;
	private boolean isSelected = false;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		addMouseMotionListener(new MyMouseListener());
		addMouseListener(new MyMouseListener());
		
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
	
	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			if(isSelected) {
				x = e.getX()-(size/2);
				y = e.getY()-(size/2);
			}
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
			if((e.getX() >= x && e.getX() <= (x+size))&&(e.getY() >= y && e.getY() <= (y+size))) {
				isSelected = true;
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			if(isSelected) {
				x = e.getX()-(size/2);
				y = e.getY()-(size/2);
			}
			isSelected = false;
			repaint();
			
		}
	}
}
