package test02;

public class Test {
	public static void main(String[] args) {
//		Television tv = new Television();
//		tv.turnOn();
//		
//		AirCon aircon = new AirCon();
//		aircon.turnOn();
		
		RemoteControl remocon = new Television();
		remocon.turnOn();
		remocon.turnoff();
		
		remocon = new AirCon();
		remocon.turnOn();
	}
}
