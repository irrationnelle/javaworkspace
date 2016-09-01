package LAB;

public class Box {
	private int width;
	private int length;
	private int height;
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setLength(int l) {
		length = l;
	}
	
	public int getLenth() {
		return length;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getVolume() {
		return height*length;
	}
	
	public void print() {
		System.out.println("Width: "+width);
		System.out.println("Length: "+length);
		System.out.println("Height: "+height);
	}
}
