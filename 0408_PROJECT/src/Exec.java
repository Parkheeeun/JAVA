
import java.util.Scanner;
import Pkg.Boards.*;
public class Exec {

	public static void main(String[] args) {
		
		Boards freeBoardList=new Boards("자유게시판");
		Boards javaBoardList=new Boards("자바게시판");
		User user1=new User("User001","홍길동");
		NewBoard board1=new NewBoard();
		NewBoard board2=new NewBoard();
		NewBoard board3=new NewBoard();
		user1.boardWrite(board1,user1,freeBoardList);
		user1.boardWrite(board2,user1,freeBoardList);
		user1.boardWrite(board3,user1,javaBoardList);

		
		
		

	}

}

