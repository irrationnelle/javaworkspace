package programming02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAction {
	private MyFrame frame;
	private CalcInterest calc;
	private MyListener listener;
	
	public MyAction() {
		frame = new MyFrame();
		listener = new MyListener();
		frame.getButton().addActionListener(listener);
	}
	
	public class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			calc = new CalcInterest(Integer.parseInt(frame.getTextPrincipal().getText()), Double.parseDouble(frame.getTextInterest().getText()));
			frame.getTextResult().setText(Integer.toString(calc.getResult()));
		}
		
	}
}
