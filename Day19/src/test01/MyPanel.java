package test01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paintComponent(arg0); //비어있는 패널 판 그리기는 지우지 않음.
		arg0.drawLine(10, 10, 50, 50);
		
		arg0.drawRect(10, 70, 40, 30);
		arg0.setColor(Color.BLACK);
		arg0.fillRect(10, 170, 40, 30);
	}
}
