package sample01;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class UserInput extends JFrame {

	Button idButton;
	BufferedImage img = null;
	JTextField idText;
	Board _board;

	public UserInput(Board board) {

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int x = screenSize.width / 3 / 1 - this.getWidth() / 2;
		int y = screenSize.height / 3 / 1 - this.getHeight() / 2;
		_board = board;
		setLocation(x, y);
		setTitle("Tetris");
		setSize(300, 150);

		setResizable(false);

		// try {
		// img = ImageIO.read(new File("11.jpg"));
		//
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// System.exit(0);
		// }
		add(new MyPenal());

		MyPenal p = new MyPenal();
		JPanel panelMain = new JPanel();
		JPanel panelUnclear = new JPanel();

		panelUnclear.setLayout(null);
		panelUnclear.setBounds(30, 40, 30, 100);
		panelUnclear.setSize(240, 40);
		panelUnclear.setBackground(new Color(0, 0, 0, 0));

		JLabel idLabel = new JLabel("ID");
		idLabel.setBounds(10, 10, 50, 20);
		idLabel.setFont(new Font("πŸ≈¡", Font.BOLD, 20));
		panelUnclear.add(idLabel);

		idText = new JTextField();
		idText.setBounds(40, 10, 130, 20);
		idText.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		panelUnclear.add(idText);

		JButton idButton = new JButton("¿‘∑¬");
		idButton.setBounds(180, 10, 60, 20);
		panelUnclear.add(idButton);
		idButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				userName = idText.getText();
				field3.setText(userName);
				dispose();
				field4.setText("0");
				// board.start();

			}
		});

		add(panelUnclear);
		add(panelMain);
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
