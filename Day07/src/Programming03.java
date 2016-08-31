import java.util.Scanner;

class Check{
	int countFinal=0;
	
	public void setCount(String text, int element) {
		int count=0;
		int len = text.length();
		for(int i=0; i<len; i++) {
			switch(element) {
			case 1:
				boolean checkAlphabet = ((text.charAt(i) >= 'a' && text.charAt(i) <= 'z') || (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'));
				if(checkAlphabet){
					count++;
				}
				break;
			case 2:
				boolean checkNumber = (text.charAt(i) >='0' && text.charAt(i) <='9');
				if(checkNumber){
					count++;
				}
				break;
			case 3:
				boolean checkSpace = (text.charAt(i) == ' ');
				if(checkSpace) {
					count++;
				}
				break;
			}
		}
		countFinal = count;
	}
	
	public int getCount() {
		return countFinal;
	}
}	

public class Programming03 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¹®ÀÚ¿­ ÀÔ·Â: ");
		String text = scan.nextLine();
		
		Check c = new Check();
		
		c.setCount(text, 1);
		int countAlphabet = c.getCount();
		c.setCount(text, 2);
		int countNumber = c.getCount();
		c.setCount(text, 3);
		int countSpace = c.getCount();
		
		System.out.println("¾ËÆÄºª °¹¼ö: "+countAlphabet);
		System.out.println("¼ýÀÚ °¹¼ö: "+countNumber);
		System.out.println("°ø¹é °¹¼ö: "+countSpace);
	}
}