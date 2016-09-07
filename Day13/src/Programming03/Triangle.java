package Programming03;

public class Triangle extends Shape {
	private double size;
	private double hypotenuse;
	
	public Triangle(int x, int y) {
		super(2*x, y);
	}
	
	@Override
	public double getArea() {
		return 0.5*this.getHeight()*this.getWidth();
	}
	
//	@Override
//	public double getSize() {
//		return this.size;
//	}
	
	@Override
	public double getSize() {
		return this.getHypotenuse() + this.getHeight() + this.getWidth();  
	}

//	public double getHypotenuse() {
//		return hypotenuse;
//	}

	public double getHypotenuse() {
		return (double)Math.sqrt((double)this.getHeight()*(double)this.getHeight()+((double)this.getWidth()*0.5)*((double)this.getWidth()*0.5));
	}
}
