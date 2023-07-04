package p07;

public class GameExec {
	
	public static void runGame(Game game) {
		game.start();
		game.playing();
		game.stop();
	}
	public static void main(String[] args) {
		
		Mario mario = new Mario();
		mario.name = "마리오";
		
		LostArk la = new LostArk();
		la.name = "로스트 아크";
		
		runGame(mario);
		runGame(la);
	}
}
