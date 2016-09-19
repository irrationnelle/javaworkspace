package test01;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		/*
		 * 아래의 메소드들은 창을 만들 때 가장 많이 사용하는 메소드들이다.
		 */
		JFrame f = new JFrame();
		f.setTitle("Title");
		f.setSize(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼을 누르면 창을 닫을 수 있음.
	}
}
