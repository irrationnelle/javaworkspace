class Calcu {
	
	int num1;
	int num2;
	
	public int sum(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		int total = this.num1 + this.num2;
		return total; 
	}
	
	int multiple(int num1, int num2) {
		return num1*num2;
	}
}


public class Test12 {
	public static void main(String[] args) {
		Calcu c = new Calcu();
		
		int result = c.sum(3, 5);
		System.out.println(result);
		
		result = c.multiple(5, 4);
		System.out.println(result);
	}
}
