package lab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private JButton button = new JButton("button");
	private int lightNum = 0;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		MyListener listner = new MyListener();
		setLayout(new BorderLayout());
		add(button, BorderLayout.SOUTH);
		button.addActionListener(listner);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawOval(100, 50, 100, 100);
		g.drawOval(100, 150, 100, 100);
		g.drawOval(100, 250, 100, 100);
		
		if(lightNum == 0) {
			g.setColor(Color.RED);
			g.fillOval(100, 50, 100, 100);
		} else if(lightNum == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 150, 100, 100);
		} else {
			g.setColor(Color.YELLOW);
			g.fillOval(100, 250, 100, 100);
		}
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(++lightNum >= 3) {
				lightNum = 0;
			}
			repaint();	// 까먹지 말 것.
		}
		
	}
}
