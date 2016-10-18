package sample01;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame3 extends JFrame{

	protected JTextField idText;
	protected JTextField field3;
    protected JButton idButton;
	BufferedImage img = null;
	JTextField fieldScore;
	Board board;
	String userName = "rase";

	// 프레임 생성 및 초기화
	public MainFrame3() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int x = screenSize.width / 6 / 1 - this.getWidth() / 2;
		int y = screenSize.height / 300 / 1 - this.getHeight() / 2;
		setLocation(x, y);
		

//		try {
//			img = ImageIO.read(new File("/Tetris/img"));
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
		add(new MyPanel());

		// 프레임 위에 붙일 페널 생성
		MyPanel p = new MyPanel();
		JPanel panelMain = new JPanel();
		JPanel panelBar = new JPanel();
		JPanel panelUnclear = new JPanel();
//		JPanel panelGame = new JPanel();
		
		JPanel panelNext = new JPanel();
		JPanel panelItem = new JPanel();

//		// Bar패널 설정
		panelBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelBar.setBackground(Color.darkGray);
		panelBar.setSize(800, 40);
		panelMain.add(panelBar);
		panelBar.setFocusable(false);

		JButton startBtn = new JButton("Start");
		startBtn.setBackground(Color.WHITE);
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new UserInput();
			}
		});
		startBtn.setFocusable(false);
		
		panelBar.add(startBtn);
		JButton optionBtn = new JButton("Option");
		optionBtn.setBackground(Color.WHITE);
		panelBar.add(optionBtn);
		optionBtn.setFocusable(false);

		// Unclear패널 설정
		panelUnclear.setLayout(null);
		panelUnclear.setBounds(30, 70, 500, 100);
		panelUnclear.setSize(720, 800);
		panelUnclear.setBackground(new Color(0, 0, 0, 50));
		panelUnclear.setFocusable(false);
		// -------------------Unclear페널에 붙을 각종 레이블--------------------------//
		// NEXT 레이블
		JLabel lable1 = new JLabel("NEXT");
		lable1.setBounds(40, 25, 50, 10);
		lable1.setForeground(Color.white);
		lable1.setFocusable(false);
		panelUnclear.add(lable1);
		// Player 레이블
		JLabel lable2 = new JLabel("PLAYER");
		lable2.setBounds(30, 200, 50, 10);
		lable2.setForeground(Color.white);
		lable2.setFocusable(false);
		panelUnclear.add(lable2);
		// Mode 레이블
		JLabel lable3 = new JLabel("MODE");
		lable3.setBounds(35, 300, 50, 10);
		lable3.setForeground(Color.white);
		lable3.setFocusable(false);
		panelUnclear.add(lable3);
		// Speed 레이블
		JLabel lable4 = new JLabel("SPEED");
		lable4.setBounds(30, 400, 50, 10);
		lable4.setForeground(Color.white);
		lable4.setFocusable(false);
		panelUnclear.add(lable4);
		// Score 레이블
		JLabel lable5 = new JLabel("SCORE");
		lable5.setBounds(640, 50, 50, 10);
		lable5.setForeground(Color.white);
		lable5.setFocusable(false);
		panelUnclear.add(lable5);

		// Level 레이블
		JLabel lable7 = new JLabel("LEVEL");
		lable7.setBounds(105, 750, 100, 10);
		lable7.setForeground(Color.white);
		lable7.setFocusable(false);
		panelUnclear.add(lable7);

		// ------------------Unclear패널에 붙을 각종 텍스트-----------------------------//
		// Speed 텍스트
		JTextField Field1 = new JTextField();
		Field1.setBounds(17, 330, 70, 40);
		Field1.setBackground(Color.white);
		panelUnclear.add(Field1);
		Field1.setFocusable(false);
		// Mode 텍스트
		JTextField Field2 = new JTextField();
		Field2.setBounds(17, 430, 70, 40);
		Field2.setBackground(Color.white);
		panelUnclear.add(Field2);
		Field2.setFocusable(false);
		// Player 텍스트
		field3 = new JTextField();
		field3.setBounds(17, 230, 70, 40);
		field3.setBackground(Color.white);
		panelUnclear.add(field3);
		field3.setFocusable(false);

		// Score 텍스트
		fieldScore = new JTextField("0");
		fieldScore.setBounds(625, 80, 70, 40);
		fieldScore.setBackground(Color.white);
		panelUnclear.add(fieldScore);
		fieldScore.setFocusable(false);
		// Level 텍스트
		JTextField Field5 = new JTextField();
		Field5.setBounds(160, 750, 450, 10);
		Field5.setBackground(Color.white);
		panelUnclear.add(Field5);
		Field5.setFocusable(false);

		// --------------------------------------------------------------------------//
//		new UserInput();
		
		// Game패널 설정
		board = new Board(this);
		board.setLayout(null);
		board.setBounds(135, 90, 400, 50);
		board.setSize(500, 700);
		board.setBackground(Color.gray);
		board.setFocusable(true);
//		board.requestFocus();
//		board.requestFocusInWindow();
//		board.setRequestFocusEnabled(true);
//		board.grabFocus();
		panelMain.add(board);
		panelMain.setFocusable(false);
		// NEXT패널 설정
		panelNext.setLayout(null);
		panelNext.setBounds(50, 125, 100, 100);
		panelNext.setSize(70, 100);
		panelNext.setBackground(Color.white);
		board.add(panelNext);
		panelNext.setFocusable(false);
		// 각 패널들을 전체 Main패널에 붙이기

		
		add(panelBar);
		add(board);
		add(panelNext);
		add(panelUnclear);
		add(panelMain);
		add(p);
		setVisible(true);


		panelBar.setFocusable(false);
		panelNext.setFocusable(false);
		panelUnclear.setFocusable(false);
		p.setFocusable(false);
//		board.start();
		board.setFocusable(true);
		
		new UserInput();
		
		setTitle("Tetris");
		setSize(800, 950);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setFocusable(true);
	}
	
	public JTextField getScoreBoard() {
		return fieldScore;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public JTextField getUserField() {
		return field3;
	}

	class MyPanel extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, 800, 1100, null, null);
		}

		public Dimension getPreferredSize() {
			if (img == null) {
				return new Dimension(800, 900);
			} else {
				return new Dimension(img.getWidth(null), (img.getHeight(null)));
			}

		}

	}

	// ID입력하는 프레임

	class UserInput extends JFrame {

		Button idButton;
		BufferedImage img = null;
		JTextField idText;

		public UserInput() {

			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension screenSize = tk.getScreenSize();
			int x = screenSize.width / 3 / 1 - this.getWidth() / 2;
			int y = screenSize.height / 3 / 1 - this.getHeight() / 2;

//			add(new MyPanel());

			MyPanel p = new MyPanel();
			JPanel panelMain1 = new JPanel();
			JPanel panelUnclear1 = new JPanel();

			panelUnclear1.setLayout(null);
			panelUnclear1.setBounds(30, 40, 30, 100);
			panelUnclear1.setSize(240, 40);
			panelUnclear1.setBackground(new Color(0, 0, 0, 0));
			panelUnclear1.setFocusable(false);

			JLabel idLabel = new JLabel("ID");
			idLabel.setBounds(10, 10, 50, 20);
			idLabel.setFont(new Font("바탕", Font.BOLD, 20));
			idLabel.setFocusable(false);
			panelUnclear1.add(idLabel);
			panelUnclear1.setFocusable(false);

			idText = new JTextField();
			idText.setBounds(40, 10, 130, 20);
			idText.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
//					userName = idText.getText();
					setUserName(idText.getText());
					field3.setText(userName);
					field3.setFocusable(false);
					dispose();
					fieldScore.setText("0");
					fieldScore.setFocusable(false);
					board.start();
					board.setFocusable(true);
					
				}
			});
			panelUnclear1.add(idText);
			panelUnclear1.setFocusable(false);
			JButton idButton = new JButton("입력");
			idButton.setFocusable(false);
			idButton.setBounds(180, 10, 60, 20);
			idButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					userName = idText.getText();
					field3.setText(userName);
					field3.setFocusable(false);
					dispose();
					fieldScore.setText("0");
					fieldScore.setFocusable(false);
					board.start();
					board.setFocusable(true);
				}
			});
			panelUnclear1.add(idButton);
			panelUnclear1.setFocusable(false);

			add(panelUnclear1); 
//			add(panelMain);
			add(p);
			
			setTitle("Tetris");
			setLocation(x, y);
			setSize(300, 150);
			
			setResizable(false);
			setVisible(true);

		}

		class MyPanel extends JPanel {
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, 300, 200, null, null);
			}

			public Dimension getPreferredSize() {
				if (img == null) {
					return new Dimension(300, 200);
				} else {
					return new Dimension(img.getWidth(null), (img.getHeight(null)));
				}

			}

		}

	}

	public static void main(String[] args) {
		MainFrame3 main = new MainFrame3();
		main.setLocationRelativeTo(null);
        main.setVisible(true);

	}

	
	
}
