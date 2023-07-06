package p08;

public class Aircon extends Remotecon {
// Aircon, Remotecon, Remote, Object
	
	public void on() {
		System.out.println("Aircon Power ON...");
	}
	
	public void off() {
		System.out.println("Aircon Power OFF...");
	}
	
	public void tempUp() {
		System.out.println("Temperature UP...");
	}
	
	public void tempDown() {
		System.out.println("Temperature DOWN...");
	}
}
