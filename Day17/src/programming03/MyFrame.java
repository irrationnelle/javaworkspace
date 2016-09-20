package programming03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel pl1 = new JPanel();
	private JPanel pl2 = new JPanel();
	private JPanel pl3 = new JPanel();
	private JPanel totalPanel= new JPanel();
	private JButton buttonC = new JButton("C");
	private JButton[] button = new JButton[16];
	private JTextField text = new JTextField("1000        ");
	
	public MyFrame() {
		setTitle("°è»ê±â");
		setSize(400, 300);

		pl1.setSize(400, 25);
		text.setSize(400, 25);
		pl2.setSize(400, 75);
		buttonC.setSize(75, 75);
		pl3.setSize(400, 300);
		int temp = 7;
		for(int i=0; i<(button.length-4); i++) {
			if(i==3) {
				button[i] = new JButton("/");
				temp=4;
				pl3.add(button[i]);
				continue;
			}
			if(i==7) {
				button[i] = new JButton("*");
				temp=1;
				pl3.add(button[i]);
				continue;
			}
			if(i==11) {
				button[i] = new JButton("-");
				pl3.add(button[i]);
				break;
			}
			button[i] = new JButton(Integer.toString(temp));
			button[i].setSize(75, 75);
			temp++;
			pl3.add(button[i]);
		}
		button[12] = new JButton("0");
		button[13] = new JButton("+/-");
		button[14] = new JButton("=");
		button[15] = new JButton("+");
		for(int i=12; i<16; i++) {
			button[i].setSize(75, 75);
			pl3.add(button[i]);
		}
		
		pl1.setLayout(new GridLayout(1, 1));
		pl1.add(text);
		pl2.setLayout(new GridLayout(1, 4));
		pl2.add(buttonC);
		pl3.setLayout(new GridLayout(4, 4));
		totalPanel.setLayout(new BoxLayout(totalPanel, BoxLayout.Y_AXIS));
		totalPanel.add(pl1);
		totalPanel.add(pl2);
		totalPanel.add(pl3);
		add(totalPanel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
