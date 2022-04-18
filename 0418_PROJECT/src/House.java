import java.util.ArrayList;

public class House {

	private ArrayList<User> users;
	
	
	
	
	public House() {
		this.users=new ArrayList<User>();
	}

	
	
	public void setHouse(User user) {
		this.users.add(user);
	}
	
	public ArrayList<User> getUserList() {
		return users;
	}
	
}
