package test04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int x=10, y=10;
	private int size=50;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		addKeyListener(new MyPanelKeyListener()); // ���� Ŭ�����̱� ������ ��Ʈ ������ ���ʿ�
		
		requestFocus();
		setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(new Color(100, 150, 250));
		g.fillRect(x, y, size, size);
	}
	
	class MyPanelKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:	// ����Ű ���� ������ �׷��� ���簢�� ��ǥ�� y�� ����
				y -= 10;
				break;
			case KeyEvent.VK_DOWN:	// ����Ű �Ʒ��� ������ �׷��� ���簢�� ��ǥ�� y�� ����
				y += 10;
				break;
			case KeyEvent.VK_LEFT:
				x -= 10;
				break;
			case KeyEvent.VK_RIGHT:
				x += 10;
				break;
			}
			
			switch(e.getKeyChar()) {
			case 'b':
				size+=10;
				break;
			case 's':
				size-=10;
				break;
			}
			
			repaint();
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
