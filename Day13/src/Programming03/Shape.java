package Programming03;

public class Shape {
	private int x;
	private int y;
	private int width;
	private int height;
		
	public Shape(int x, int y) {
		if(x>=0) {
			this.setWidth(x);
		} else {
			this.setWidth(-x);
		}
		if(y>=0) {
			this.setHeight(y);
		} else {
			this.setHeight(-y);
		}
	}
	
	public double getArea() {
		return (double)this.getWidth()*(double)this.getHeight();
	}
	
	public double getSize() {
		return (double)(this.getWidth()+this.getHeight())*2;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
