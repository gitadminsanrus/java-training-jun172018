
public class UserLogin {
	
	private String username;
	private String password;
	
	public UserLogin(String username,
					String password) throws Exception {
		
		if (username == null 
				|| "".equals(username) 
				|| username.matches("\\s+")) {
			throw new Exception("Invalid username");
		} else if (password == null 
				|| "".equals(password) 
				|| password.matches("\\s+")) {
			throw (new Exception("Invalid password"));
		}
		this.username = username;
		this.password = password;
	}
	
	
	public void signIn() throws SignInFailedException {
		//talk to server and then get JSON response
		int responseCode = 500;
		
		//server issues
		if (responseCode >= 500 && responseCode < 599) {
			SignInFailedException exception = new SignInFailedException("Server responded with 5xx series http code.");
			throw exception;
		}
	}
	

}
