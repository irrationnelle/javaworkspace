package test01;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		/*
		 * �Ʒ��� �޼ҵ���� â�� ���� �� ���� ���� ����ϴ� �޼ҵ���̴�.
		 */
		JFrame f = new JFrame();
		f.setTitle("Title");
		f.setSize(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư�� ������ â�� ���� �� ����.
	}
}
