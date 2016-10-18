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

public class MainFrame extends JFrame{

	protected JTextField idText;
	protected JTextField field3;
    protected JButton idButton;
	BufferedImage img = null;

	// ������ ���� �� �ʱ�ȭ
	public MainFrame() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int x = screenSize.width / 6 / 1 - this.getWidth() / 2;
		int y = screenSize.height / 300 / 1 - this.getHeight() / 2;
		setLocation(x, y);
		setTitle("Tetris");
		setSize(800, 950);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

//		try {
//			img = ImageIO.read(new File("/Tetris/img"));
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
		add(new MyPenal());

		// ������ ���� ���� ��� ����
		MyPenal p = new MyPenal();
		JPanel penalMain = new JPanel();
		JPanel penalBar = new JPanel();
		JPanel penalUnclear = new JPanel();
//		JPanel penalGame = new JPanel();
		Board board = new Board();
		JPanel penalNext = new JPanel();
		JPanel penalItem = new JPanel();

		// Bar�г� ����
		penalBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		penalBar.setBackground(Color.darkGray);
		penalBar.setSize(800, 40);
		penalMain.add(penalBar);

		JButton startBtn = new JButton("Start");
		startBtn.setBackground(Color.WHITE);
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new UserInput();
			}
		});
		penalBar.add(startBtn);
		JButton optionBtn = new JButton("Option");
		optionBtn.setBackground(Color.WHITE);
		penalBar.add(optionBtn);

		// Unclear�г� ����
		penalUnclear.setLayout(null);
		penalUnclear.setBounds(30, 70, 500, 100);
		penalUnclear.setSize(720, 800);
		penalUnclear.setBackground(new Color(0, 0, 0, 50));
		// -------------------Unclear��ο� ���� ���� ���̺�--------------------------//
		// NEXT ���̺�
		JLabel lable1 = new JLabel("NEXT");
		lable1.setBounds(40, 25, 50, 10);
		lable1.setForeground(Color.white);
		penalUnclear.add(lable1);
		// Player ���̺�
		JLabel lable2 = new JLabel("PLAYER");
		lable2.setBounds(30, 200, 50, 10);
		lable2.setForeground(Color.white);
		penalUnclear.add(lable2);
		// Mode ���̺�
		JLabel lable3 = new JLabel("MODE");
		lable3.setBounds(35, 300, 50, 10);
		lable3.setForeground(Color.white);
		penalUnclear.add(lable3);
		// Speed ���̺�
		JLabel lable4 = new JLabel("SPEED");
		lable4.setBounds(30, 400, 50, 10);
		lable4.setForeground(Color.white);
		penalUnclear.add(lable4);
		// Score ���̺�
		JLabel lable5 = new JLabel("SCORE");
		lable5.setBounds(640, 50, 50, 10);
		lable5.setForeground(Color.white);
		penalUnclear.add(lable5);

		// Level ���̺�
		JLabel lable7 = new JLabel("LEVEL");
		lable7.setBounds(105, 750, 100, 10);
		lable7.setForeground(Color.white);
		penalUnclear.add(lable7);

		// ------------------Unclear�гο� ���� ���� �ؽ�Ʈ-----------------------------//
		// Speed �ؽ�Ʈ
		JTextField Field1 = new JTextField();
		Field1.setBounds(17, 330, 70, 40);
		Field1.setBackground(Color.white);
		penalUnclear.add(Field1);
		// Mode �ؽ�Ʈ
		JTextField Field2 = new JTextField();
		Field2.setBounds(17, 430, 70, 40);
		Field2.setBackground(Color.white);
		penalUnclear.add(Field2);
		// Player �ؽ�Ʈ
		field3 = new JTextField();
		field3.setBounds(17, 230, 70, 40);
		field3.setBackground(Color.white);
		penalUnclear.add(field3);

		// Score �ؽ�Ʈ
		JTextField Field4 = new JTextField();
		Field4.setBounds(625, 80, 70, 40);
		Field4.setBackground(Color.white);
		penalUnclear.add(Field4);
		// Level �ؽ�Ʈ
		JTextField Field5 = new JTextField();
		Field5.setBounds(160, 750, 450, 10);
		Field5.setBackground(Color.white);
		penalUnclear.add(Field5);

		// --------------------------------------------------------------------------//

		// Game�г� ����
		board.setLayout(null);
		board.setBounds(135, 90, 400, 50);
		board.setSize(500, 700);
		board.setBackground(Color.gray);
//		board.setFocusable(true);
//		board.requestFocus();
//		board.requestFocusInWindow();
//		board.setRequestFocusEnabled(true);
//		board.grabFocus();
		board.addKeyListener(board.ta);
		board.setFocusable(true);
		penalMain.add(board);
		// NEXT�г� ����
		penalNext.setLayout(null);
		penalNext.setBounds(50, 125, 100, 100);
		penalNext.setSize(70, 100);
		penalNext.setBackground(Color.white);
		board.add(penalNext);

		// �� �гε��� ��ü Main�гο� ���̱�

		add(penalBar);
		add(board);
		add(penalNext);
		add(penalUnclear);
		add(penalMain);
		add(p);
		setVisible(true);

	}

	class MyPenal extends JPanel {
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

	// ID�Է��ϴ� ������

	class UserInput extends JFrame {

		Button idButton;
		BufferedImage img = null;
		JTextField idText;

		public UserInput() {

			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension screenSize = tk.getScreenSize();
			int x = screenSize.width / 3 / 1 - this.getWidth() / 2;
			int y = screenSize.height / 3 / 1 - this.getHeight() / 2;
			setLocation(x, y);
			setTitle("Tetris");
			setSize(300, 150);

			setResizable(false);

			try {
				img = ImageIO.read(new File("11.jpg"));

			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
			add(new MyPenal());

			MyPenal p = new MyPenal();
			JPanel penalMain = new JPanel();
			JPanel penalUnclear = new JPanel();

			penalUnclear.setLayout(null);
			penalUnclear.setBounds(30, 40, 30, 100);
			penalUnclear.setSize(240, 40);
			penalUnclear.setBackground(new Color(0, 0, 0, 0));

			JLabel idLabel = new JLabel("ID");
			idLabel.setBounds(10, 10, 50, 20);
			idLabel.setFont(new Font("����", Font.BOLD, 20));
			penalUnclear.add(idLabel);

			idText = new JTextField();
			idText.setBounds(40, 10, 130, 20);
			idText.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
				}
			});
			penalUnclear.add(idText);

			JButton idButton = new JButton("�Է�");
			idButton.setBounds(180, 10, 60, 20);
			penalUnclear.add(idButton);
			idButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
				    String text = idText.getText(); 
				    field3.setText(text);
				    dispose();
				    
                   
				}
			});

			add(penalUnclear);
			add(penalMain);
			add(p);
			setVisible(true);

		}

		class MyPenal extends JPanel {
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
		MainFrame main = new MainFrame();
		main.setLocationRelativeTo(null);
        main.setVisible(true);

	}

	
	
}
