package Pkg.Boards;
import java.util.ArrayList;

public class User {

	private String userID;
	private String userName;
	public String getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}


	
	public User() {
		
	}
	
	public User(String userID, String userName) {
		this.userID=userID;
		this.userName=userName;
	
	}
	
	public void boardWrite(IBoard board,User user, Boards boards) { //글작성메서드
		//Board board=new Board();
		board.insert(user);
		boards.addBoardList(board);
		boards.showBoardList();
	}
}
