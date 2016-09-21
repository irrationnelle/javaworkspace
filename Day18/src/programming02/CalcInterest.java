package programming02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcInterest {
	private int principal;
	private double interest;
	private int result;
	
	public CalcInterest(int principal, double interest) {
		this.setPrincipal(principal);
		this.setInterest(interest);
		this.setResult((int)(this.getPrincipal()*this.getInterest()));
	}
	
	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getResult() {
		return (int)(this.getPrincipal()*this.getInterest());
	}

	public void setResult(int result) {
		this.result = result;
	}
}
