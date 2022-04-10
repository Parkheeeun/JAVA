package Pkg.Boards;

public class User {

	private String userName;
	
	public String getUserName() {
		return userName;
	}
	
	public User(String userName) {
		this.userName=userName;
	}
	
	public void userWrite(IBoard board, Boards boards, User user) {
		board.insert(user);
		boards.addBoard(board);
		boards.showBoardList();
	}
}
