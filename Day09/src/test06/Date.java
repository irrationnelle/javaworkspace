package test06;

public class Date {
	private int year;
	private String month;
	private int day;
	
	public void setDate(int y, String m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	public void printDate() {
		System.out.println(year+"³â"+month+" ¿ù"+day+"ÀÏ");
	}
}
