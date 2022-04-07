package Pkg.Team.Users;

public abstract class User {
	//1.속성
	private String userName;
	private int userAge;
	private double experience;
	
	//2.생성자
	public User() {
		this.experience=50;
	}
	
	public User(String userName, int userAge) {
		this.userName=userName;
		this.userAge=userAge;
		this.experience=50;
	}
	
	//메서드(행위)
	public abstract void greeting(); //인사하는메서드(추상)
	
	
	
}
