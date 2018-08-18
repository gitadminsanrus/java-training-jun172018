package interfacedemo;

public abstract class Player {
	
	private static int count;//class scope
	private String firstName;//object scope
	private String lastName;
	private int score;
	private int level;
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Player(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		count++;
	}
	
	
	public static int getCount() {
		return count;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		int x = 10;
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	

}
