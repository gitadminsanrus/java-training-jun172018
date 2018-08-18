package interfacedemo;
//Player2 IS-A TennisPlayer
public class Player2 extends Player implements TennisPlayer {

	public Player2(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public void hitTennisBall() {
		System.out.println("Player2 can hitBall()...");
	}

	public void doTennisService() {
		System.out.println("Player2 can doService()...");
	}
	
}
