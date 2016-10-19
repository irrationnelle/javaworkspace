package sample02;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class ScorePanel extends JPanel {
	String[] Column = { "����", "�����", "����" };
	Object[][] data;
	ScoreDAO d = new ScoreDAO(); // ���� DB DAO

	public ScorePanel() {

		d.createConnection();
		List<ScoreVO> l = d.selectScoreList();
		data = new Object[l.size()][];
		
		for (int i = 0; i < d.selectScoreList().size(); i++) {
			data[i] = new Object[3];
			data[i][0] = new Integer(i+1);
			data[i][1] = new String(l.get(i).getName());
			data[i][2] = new Integer(l.get(i).getScore());
		} // ���̺� �� ������ �Է�
		

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		// ��� ���Ŀ� DefaultTableCellRenderer
		
		JTable b = new JTable(data, Column);
		
		for(int i = 0 ; i < b.getColumnCount() ; i++)
			b.getColumnModel().getColumn(i).setCellRenderer(dtcr);
		// �� column���� ��� ������
		
		b.setEnabled(false);
		// ���̺� ��������
		b.getTableHeader().setReorderingAllowed(false);
		// ���̺� �̵� �Ұ�
		b.getTableHeader().setResizingAllowed(false);
		// ���̺� ũ�� ���� �Ұ�.
		JScrollPane p = new JScrollPane(b); 
		add(p); // JScrollPane���� ���̺� ��ũ���� �����Ŀ� �гο� �߰�

	}
//
	public static void main(String[] args) {
		JFrame f = new JFrame("Score board");
		f.setLayout(new BorderLayout());
		f.add(new ScorePanel(), BorderLayout.CENTER);
		
		f.pack();
		// ������ �ڵ�����

		//f.setSize(600, 200);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
//
}
