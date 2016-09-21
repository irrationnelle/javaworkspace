package programming03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JTextField text = new JTextField(50);
	private int num1, num2;
	public static int startPoint=0;
	public static int op = 0;
	
	public MyFrame() {
		setTitle("계산기");
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
				button[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(startPoint==0) {
							num1 = Integer.parseInt(text.getText());
							startPoint = text.getText().length()+1;
							op=1;
						} else {
							num2 = Integer.parseInt(text.getText().substring(startPoint));
							switch(op) {
							case 1:
								num1 = num1/num2;
								break;
							case 2:
								num1 = num1*num2;
								break;
							case 3:
								num1 = num1-num2;
								break;
							case 4:
								num1 = num1+num2;
								break;
							}
							startPoint = text.getText().length()+1;
							op=1;
						}
						if(text.getText() == null) {
							//JButton 객체에 있는 요소를 받아서 TextField에 보내줌.
							JButton b = (JButton)e.getSource();
							text.setText(b.getText());
						} else {
							JButton b = (JButton)e.getSource();
							text.setText(text.getText()+b.getText());
						}
					}
				});
				continue;
			}
			if(i==7) {
				button[i] = new JButton("*");
				temp=1;
				pl3.add(button[i]);
				button[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(startPoint==0) {
							num1 = Integer.parseInt(text.getText());
							startPoint = text.getText().length()+1;
							op=2;
						} else {
							num2 = Integer.parseInt(text.getText().substring(startPoint));
							switch(op) {
							case 1:
								num1 = num1/num2;
								break;
							case 2:
								num1 = num1*num2;
								break;
							case 3:
								num1 = num1-num2;
								break;
							case 4:
								num1 = num1+num2;
								break;
							}
							startPoint = text.getText().length()+1;
							op=2;
						}
						if(text.getText() == null) {
							//JButton 객체에 있는 요소를 받아서 TextField에 보내줌.
							JButton b = (JButton)e.getSource();
							text.setText(b.getText());
						} else {
							JButton b = (JButton)e.getSource();
							text.setText(text.getText()+b.getText());
						}
					}
				});
				continue;
			}
			if(i==11) {
				button[i] = new JButton("-");
				pl3.add(button[i]);
				button[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(startPoint==0) {
							num1 = Integer.parseInt(text.getText());
							startPoint = text.getText().length()+1;
							op=3;
						} else {
							num2 = Integer.parseInt(text.getText().substring(startPoint));
							switch(op) {
							case 1:
								num1 = num1/num2;
								break;
							case 2:
								num1 = num1*num2;
								break;
							case 3:
								num1 = num1-num2;
								break;
							case 4:
								num1 = num1+num2;
								break;
							}
							startPoint = text.getText().length()+1;
							op=3;
						}
						if(text.getText() == null) {
							//JButton 객체에 있는 요소를 받아서 TextField에 보내줌.
							JButton b = (JButton)e.getSource();
							text.setText(b.getText());
						} else {
							JButton b = (JButton)e.getSource();
							text.setText(text.getText()+b.getText());
						}
					}
				});
				break;
			}
			button[i] = new JButton(Integer.toString(temp));
			button[i].setSize(75, 75);
			button[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(text.getText() == null) {
						//JButton 객체에 있는 요소를 받아서 TextField에 보내줌.
						JButton b = (JButton)e.getSource();
						text.setText(b.getText());
					} else {
						JButton b = (JButton)e.getSource();
						text.setText(text.getText()+b.getText());
					}
//					// TODO Auto-generated method stub
//					if(text.getText()== null) {
//						text.setText(Integer.toString(3));
//					} else {
//						text.setText(text.getText()+Integer.toString(3));
//					}
				}
			});
			temp++;
			pl3.add(button[i]);
		}
		button[12] = new JButton("0");
		button[12].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(text.getText() == null) {
					//JButton 객체에 있는 요소를 받아서 TextField에 보내줌.
					JButton b = (JButton)e.getSource();
					text.setText(b.getText());
				} else {
					JButton b = (JButton)e.getSource();
					text.setText(text.getText()+b.getText());
				}
			}
		});
		button[13] = new JButton("+/-");
		button[14] = new JButton("=");
		button[14].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				num2 = Integer.parseInt(text.getText().substring(startPoint));
				switch(op) {
				case 1:
					num1 = num1/num2;
					break;
				case 2:
					num1 = num1*num2;
					break;
				case 3:
					num1 = num1-num2;
					break;
				case 4:
					num1 = num1+num2;
					break;
				}
				text.setText(Integer.toString(num1));
				startPoint = 0;
//				System.out.println(Integer.toString(num1));
//				System.out.println(num1);
//				System.out.println(num2);
				
				/*
				if(text.getText() == null) {
					//JButton 객체에 있는 요소를 받아서 TextField에 보내줌.
					JButton b = (JButton)e.getSource();
					text.setText(b.getText());
				} else {
					JButton b = (JButton)e.getSource();
					text.setText(text.getText()+b.getText());
				}
				*/
			}
		});
		button[15] = new JButton("+");
		button[15].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(startPoint==0) {
					num1 = Integer.parseInt(text.getText());
					startPoint = text.getText().length()+1;
					op=4;
				} else {
					num2 = Integer.parseInt(text.getText().substring(startPoint));
					switch(op) {
					case 1:
						num1 = num1/num2;
						break;
					case 2:
						num1 = num1*num2;
						break;
					case 3:
						num1 = num1-num2;
						break;
					case 4:
						num1 = num1+num2;
						break;
					}
					startPoint = text.getText().length()+1;
					op=4;
				}
				if(text.getText() == null) {
					//JButton 객체에 있는 요소를 받아서 TextField에 보내줌.
					JButton b = (JButton)e.getSource();
					text.setText(b.getText());
				} else {
					JButton b = (JButton)e.getSource();
					text.setText(text.getText()+b.getText());
				}
			}
		});
		for(int i=12; i<16; i++) {
			button[i].setSize(75, 75);
			pl3.add(button[i]);
		}
		
		buttonC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText("");
				num1 = 0;
				startPoint = 0;
				
			}
		});
		
		pl1.setLayout(new BorderLayout());
		pl1.add(text, BorderLayout.WEST);
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
