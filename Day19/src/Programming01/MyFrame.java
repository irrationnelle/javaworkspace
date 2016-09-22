package Programming01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JPanel panelLabel = new JPanel();
	private JPanel panelScore = new JPanel();
	private JButton button = new JButton("Cast!");
	private JLabel[] label = new JLabel[3];
	private JLabel score = new JLabel();
	private int[] num = new int[3];
	public static int scoreCount = 100;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		panelLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panelScore.setLayout(new FlowLayout(FlowLayout.CENTER));
		panelScore.add(score);
		for(int i=0; i<3; i++) {
			num[i] = 0;
			label[i] = new JLabel(Integer.toString(num[i]));
			label[i].setFont(new Font("Consolas", Font.BOLD, 40));
			panelLabel.add(label[i]);
		}
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(int i=0; i<3; i++) {
					num[i] = (int) (Math.random()*10);
					label[i].setText(Integer.toString(num[i]));
				}
				if(num[0] == num[1] && num[1] == num[2]) {
					score.setText("Jackpot!"+" + "+scoreCount);
					scoreCount += 100;
				} else {
					score.setText("Bomb!");
				}
				
			}
		});
		
		add(panelLabel, BorderLayout.PAGE_START);
		add(panelScore,BorderLayout.CENTER);
		add(button, BorderLayout.PAGE_END);
		
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
