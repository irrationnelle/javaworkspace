
public class Test06 {
	public static void main(String[] args) {
		int firstNum, secondNum;
		
		for(firstNum = 2; firstNum<10; firstNum++) {
			for(secondNum = 1; secondNum<10; secondNum++) {
				int result = firstNum*secondNum;
				System.out.println(firstNum+"x"+secondNum+"="+result);
			}
		}
	}
}
