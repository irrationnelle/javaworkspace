package Programming03;

public class Box {
	private int height;
	private int length;
	private int width;
	private boolean isEmpty;
	
	public Box(int height, int length, int width) {
		this.height = height;
		this.length = length;
		this.width = width;
	}
	
	public Box() {
		this.isEmpty = true;
	}
}
