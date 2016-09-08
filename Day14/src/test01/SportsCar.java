package test01;

public class SportsCar extends Car {
	private boolean turbo;
	
	public SportsCar() {
		super(0, "Citroen", "WHITE");
		turbo = false;
	}
	
	public SportsCar(int speed, String model, String color, boolean turbo) {
		super(speed, model, color);
		this.turbo = turbo;
	}
	
	public void childMethod() {
		System.out.println("자식클래스가 추가한 메소드");
	}
	
	@Override
	public void printCar() {
		super.printCar();
		System.out.println("터보모드: "+turbo);
	}

}
