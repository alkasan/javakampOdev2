package javakampOdev2;

public class Login {
	
	public Login () {
		System.out.println("Login class'� �al��t�");
	}
	
	public Login (int userId, String userName) {
		
		this();
		this.userId=userId;
		this.userName=userName;
		
	}
	int userId;
	String userName;
}
