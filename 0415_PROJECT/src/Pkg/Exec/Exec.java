package Pkg.Exec;

import Pkg.Boards.*;
import java.util.Scanner;
public class Exec {

	public static void main(String[] args) {
		User user=new User();
		user.Login();
		
		Board board=new Board();
		board.boardWrite(user);
		
	}

}
