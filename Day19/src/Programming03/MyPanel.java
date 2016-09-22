package Programming03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int x=190;
	private JButton leftBtn = new JButton("Left Move");
	private JButton rightBtn = new JButton("Right Move");

	public MyPanel() {
		MyListener listener = new MyListener();
		leftBtn.addActionListener(listener);
		rightBtn.addActionListener(listener);

		add(leftBtn);
		add(rightBtn);
		
		requestFocus();
		setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(x, 45, 20, 50);
		
	}
	
	public void setButton() {
		setLayout(new GridLayout(1, 2));
		add(leftBtn);
		add(rightBtn);
	}

	public JButton getLeftBtn() {
		return leftBtn;
	}

	public void setLeftBtn(JButton leftBtn) {
		this.leftBtn = leftBtn;
	}

	public JButton getRightBtn() {
		return rightBtn;
	}

	public void setRightBtn(JButton rightBtn) {
		this.rightBtn = rightBtn;
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == leftBtn) {
				x -= 30;
			} else if(e.getSource() == rightBtn) {
				x += 30;
			}
			repaint();
		}
		
	}
}
