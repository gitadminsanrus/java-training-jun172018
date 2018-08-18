package interfacedemo;
//Tennis + Volley Ball player
public class Player3 extends Player implements TennisPlayer, VolleyBallPlayer {

	public Player3(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public void doVolleyBallService() {
		System.out.println("[VOLLEYBALL]Player3 can do volley ball service...");
		
	}

	public void hitVolleyBall() {
		System.out.println("[VOLLEYBALL]Player3 can hit volley ball...");
	}

	public void hitTennisBall() {
		System.out.println("[TENNIS]Player3 can hit tennis ball...");
	}

	public void doTennisService() {
		System.out.println("[TENNIS]Player3 can doService()...");
	}

}
