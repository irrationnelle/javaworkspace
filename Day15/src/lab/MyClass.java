package lab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class MyClass implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("beep");
	}
}
