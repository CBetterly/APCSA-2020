package finalProject;

public class User {
	private String userName;
	private String password;
	//private String[] types = {"Scout", "DE", "Viewer"};
	public User() {
		userName = "Guest User";
		password = null;
	}
	
	public User(String name, String pword) {
		userName = name.trim();
		password = pword;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
