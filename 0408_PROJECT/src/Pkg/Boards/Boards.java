package Pkg.Boards;

import java.util.ArrayList;

public class Boards {

	private ArrayList<IBoard> boardList;
	private String boardName;
	
	public Boards(String boardName) {
		this.boardName=boardName;
		boardList=new ArrayList();
	}
	
	public void addBoardList(IBoard board) {
		boardList.add(board);
	}
	
	public void showBoardList() { //게시판리스트
		System.out.println("---------------------------------");
		System.out.println("--------"+this.boardName+"--------");
		System.out.println("---------------------------------");
		for(IBoard board: this.boardList) {
			System.out.print(((NewBoard)board).getRegnum()+"     "); //downcasting
			System.out.print(((NewBoard)board).getTitle()+"     ");
			System.out.println(((NewBoard)board).getRegdate()+"     ");
			System.out.println("---------------------------------");

			
		}
	}
}
