package exercise01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.fillOval(35, 35, 200, 200);
		g.setColor(Color.WHITE);
		g.drawArc(50, 70, 75, 75, 0, 180);
		
		g.setColor(Color.WHITE);
		g.drawArc(150, 70, 75, 75, 0, 180);
		
		g.setColor(Color.WHITE);
		g.drawArc(80, 80, 120, 120, 200, 140);
		
	}
}
