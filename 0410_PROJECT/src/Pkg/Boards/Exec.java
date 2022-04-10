package Pkg.Boards;

public class Exec {

	public static void main(String[] args) {
	
		Board board1=new Board();
		Board board2=new Board();
		Board board3=new Board();
		
		User user1=new User("박희은");
	
		Boards freeBoard=new Boards("자유게시판");
		Boards javaBoard=new Boards("자바게시판");
		
		user1.userWrite(board1, freeBoard, user1);
		user1.userWrite(board2, freeBoard, user1);
		user1.userWrite(board3, javaBoard,user1);
	}
}
