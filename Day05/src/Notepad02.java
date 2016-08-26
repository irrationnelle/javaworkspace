
public class Notepad02 {
	public static void main(String[] args) {
		int num = 10;
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
			else if(i%3==0) {
				System.out.print("* ");
			}
			else if(i%5==0) {
				System.out.print("# ");
			}
			else {
				System.out.print(i+" ");
			}
			
			if(i >= num) {
				System.out.println();
				num += 10;
			}
		}
	}
}
