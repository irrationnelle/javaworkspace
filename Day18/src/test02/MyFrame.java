package test02;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JTextField tf = new JTextField(10);
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
//		MyKeyListener keyListener = new MyKeyListener();
		tf.addKeyListener(new MyKeyListener());
		
		setLayout(new FlowLayout());
		add(tf);
		
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("¥≠∑»¿Ω: "+arg0.getKeyCode()+"/"+arg0.getKeyChar()+"/"+arg0.isControlDown());
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("«ÿ¡¶µ : "+arg0.getKeyCode()+"/"+arg0.getKeyChar()+"/"+arg0.isControlDown());
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("¿‘∑¬µ : "+arg0.getKeyCode()+"/"+arg0.getKeyChar()+"/"+arg0.isControlDown());
		}
		
	}
}
