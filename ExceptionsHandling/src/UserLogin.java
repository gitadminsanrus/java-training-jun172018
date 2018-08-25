
public class UserLogin {
	
	private String username;
	private String password;
	
	public UserLogin(String username,
					String password) {
		
		if (username == null 
				|| "".equals(username) 
				|| username.matches("\\s+")) {
			throw new RuntimeException("Invalid username");
		} else if (password == null 
				|| "".equals(password) 
				|| password.matches("\\s+")) {
			throw new RuntimeException("Invalid password");
		}
		this.username = username;
		this.password = password;
	}

}
