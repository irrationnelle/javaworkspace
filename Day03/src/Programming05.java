import java.util.Scanner;

//programming 5¹ø ¹®Á¦
public class Programming05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		byte length, width, height;
		
		System.out.print("input length: ");
		length = input.nextByte();
		
		System.out.print("input width: ");
		width = input.nextByte();
		
		System.out.print("input height: ");
		height = input.nextByte();
		
		int volume = length*width*height;
		System.out.println("Box volume is "+volume);
	}

}
