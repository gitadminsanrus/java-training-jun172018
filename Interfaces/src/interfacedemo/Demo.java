package interfacedemo;
import static constant.MathConstant.PI;
public class Demo {

	public static void main(String[] args) {
		
//		Player1 player1 = new Player1("ABC", "DEF");
//		player1.bat();
//		player1.doTennisService();
//		
//		Player2 player2 = new Player2("XYZ", "PQR");
//		player2.doTennisService();
//		player2.hitTennisBall();
		
		Player1 sachinTendulkar = new Player1("Sachin", "Tendulkar");
		Player2 serenaWilliams = new Player2("Serena", "Williams");
		Player3 volleyBallPlayer = new Player3("AB", "CD");
		
		CricketPlayer[] cricketPlayers = new CricketPlayer[11];
		TennisPlayer[] tennisPlayers = new TennisPlayer[2];
		VolleyBallPlayer[] volleyBallPlayers = new VolleyBallPlayer[6];
		
		cricketPlayers[0] = sachinTendulkar;
		cricketPlayers[1] = sachinTendulkar;
		cricketPlayers[2] = sachinTendulkar;
		cricketPlayers[3] = sachinTendulkar;
		cricketPlayers[4] = sachinTendulkar;
		cricketPlayers[5] = sachinTendulkar;
		cricketPlayers[6] = sachinTendulkar;
		cricketPlayers[7] = sachinTendulkar;
		
		tennisPlayers[0] = sachinTendulkar;
		tennisPlayers[1] = volleyBallPlayer;
		
		volleyBallPlayers[0] = volleyBallPlayer;
		
		for (int index = 0; index < cricketPlayers.length; index++) {
			CricketPlayer eachCricketPlayer = cricketPlayers[index];
			if (eachCricketPlayer != null) {
				eachCricketPlayer.bat();
			}
		}
		
		
		System.out.println(PI);
		
		
		

	}

}

















