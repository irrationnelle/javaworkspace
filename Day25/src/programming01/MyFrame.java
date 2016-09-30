package programming01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton startBTN = new JButton("Counter Start");
	private JButton stopBTN = new JButton("Counter Stop");
	private JPanel btnPanel = new JPanel(); 
	private JLabel countLabel = new JLabel("0");
	
	private MyThread t = new MyThread();
	
	public MyFrame() {
		startBTN.setAlignmentX(CENTER_ALIGNMENT);
		stopBTN.setAlignmentX(CENTER_ALIGNMENT);
		btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.Y_AXIS));
		btnPanel.add(startBTN);
		btnPanel.add(stopBTN);
		
		setLayout(new FlowLayout());
		add(btnPanel);
		add(countLabel);
		
		MyListener listener = new MyListener();
		startBTN.addActionListener(listener);
		stopBTN.addActionListener(listener);
		
		countLabel.setFont(new Font("Consolas", Font.BOLD, 50));
		
		setTitle("Count by thread");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	class MyThread extends Thread{
		private int counter = 0;
		
		@Override
		public void run() {
			int i=0;
			try {
				while(i<10000000) {
					countLabel.setText(i+"");
					Thread.sleep(1000);
					i++;
				}
			} catch (InterruptedException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}

		public int getCounter() {
			return counter;
		}

	}
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			boolean isLoop = true;
			boolean isResume = false;
			if(e.getSource() == startBTN) {
				if(isResume == true) {
					t.resume();
				} else if(isResume == false) {
					t.start();
				}
			} else if(e.getSource() == stopBTN) {
				t.suspend();
				isLoop = false;
				isResume=true;
			}
		}
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
