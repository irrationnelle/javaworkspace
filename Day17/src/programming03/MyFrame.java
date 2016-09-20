package programming03;

import java.awt.BorderLayout;
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
		// TODO Auto-generated constructor stub
		setTitle("°è»ê±â");
		setSize(300, 500);
		
		int temp = 7;
		for(int i=0; i<(button.length-4); i++) {
			button[i] = new JButton(Integer.toString(temp));
			temp++;
			if(i==3) {
				button[i] = new JButton("/");
				temp=4;
				continue;
			}
			if(i==7) {
				button[i] = new JButton("*");
				temp=1;
				continue;
			}
			if(i==11) {
				button[i] = new JButton("-");
				break;
			}
		}
		button[12] = new JButton("0");
		button[13] = new JButton("+/-");
		button[14] = new JButton("=");
		button[15] = new JButton("+");
		
		pl1.add(text);
		pl2.add(buttonC);
		pl3.add(button);
		pl3.setLayout(new GridLayout(0, 4));
		totalPanel.add(pl1);
		totalPanel.add(pl2);
		totalPanel.add(pl3);
		totalPanel.setLayout(new BoxLayout(totalPanel, BoxLayout.Y_AXIS));
		add(totalPanel);
		setVisible(true);
	}
}
