package javakampOdev2;

public class Login {
	
	public Login () {
		System.out.println("Login class'ý çalýþtý");
	}
	
	public Login (int userId, String userName) {
		
		this();
		this.userId=userId;
		this.userName=userName;
		
	}
	int userId;
	String userName;
}
