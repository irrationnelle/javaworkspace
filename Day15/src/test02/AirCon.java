package test02;

public class AirCon implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Aircon on");
	}

	@Override
	public void turnoff() {
		System.out.println("Aircon off");
	}
	
}
