package test02;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV on");
	}

	@Override
	public void turnoff() {
		System.out.println("TV off");
	}

}
