package p08;

public class RemoteconExec {

	public static void main(String[] args) {

		Remote[] remotes = new Remote[2];
		remotes[0] = new Aircon();
		remotes[1] = new TVRemotecon();
		
		for(int i = 0; i < remotes.length; i++) {
			remotes[i].on();
			if(remotes[i] instanceof Aircon) {
				((Aircon)remotes[i]).tempUp();
				((Aircon)remotes[i]).tempDown();
			}
			else if(remotes[i] instanceof TVRemotecon) {
				((TVRemotecon)remotes[i]).chUp();
				((TVRemotecon)remotes[i]).chDown();
			}
			remotes[i].off();
		}
		
	}
}
