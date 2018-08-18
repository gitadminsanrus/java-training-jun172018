package interfacedemo;

//Player1 IS-A CricketPlayer & TennisPlayer
public class Player1 extends Player implements CricketPlayer, TennisPlayer {

	public Player1(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public void bat() {
		System.out.println("[CRICKET]Player1 can bat...");
	}

	public void bowl() {
		System.out.println("Player1 can bowl...");
	}

	public void field() {
		System.out.println("[CRICKET]Player1 can field...");
	}

	public void wicketKeeping() {
		System.out.println("[CRICKET]Player1 can wicket keeping...");
	}

	public void hitTennisBall() {
		System.out.println("[TENNIS]Player1 can hit tennis ball...");
	}

	public void doTennisService() {
		System.out.println("[TENNIS]Player1 can doService()...");
	}

}
