package test07;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private BufferedImage img = null;
	private int x=10, y=10;
	private boolean isSelected = false;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		try {
			img = ImageIO.read(new File("octocat.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseListener());
		
		requestFocus();
		setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img, x, y, null);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			if(isSelected) {
				x = e.getX()-(img.getWidth()/2);
				y = e.getY()-(img.getHeight()/2);
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
			if((e.getX() >= x && e.getX() <= x+img.getWidth()) && (e.getY() >= y && e.getY() <= y+img.getHeight())) {
				isSelected = true;
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			if(isSelected) {
				x = e.getX()-(img.getWidth()/2);
				y = e.getY()-(img.getHeight()/2);
			}
			isSelected = false;
			repaint();
		}
		
	}

}