package p08;

public class TVRemotecon extends Remotecon {
// TVRemotecon, Remotecon, Remote, Object
	public void on() {
		System.out.println("TV Power ON...");
	}
	
	public void off() {
		System.out.println("TV Power OFF...");
	}
	
	public void chUp() {
		System.out.println("Channel UP...");
	}
	
	public void chDown() {
		System.out.println("Channel DOWN...");
	}
}
