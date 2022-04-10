package Pkg.Boards;

import java.util.ArrayList;
public class Boards {

	private ArrayList<IBoard> boardList;
	private String boardName;
	
	public Boards(String boardName) {
		this.boardName=boardName;
		boardList=new ArrayList();
	}
	
	public void addBoard(IBoard board) {
		boardList.add(board);
	}
	
	public void showBoardList() {
		System.out.println("----------------------");
		System.out.println("---"+this.boardName+"---");
		for(IBoard board:this.boardList) {
			System.out.println("----------------------");
			System.out.print(((Board)board).getRegNum()+"  ");
			System.out.print(((Board)board).getTitle()+"  ");
			System.out.println(((Board)board).getContent()+"  ");
			System.out.println("----------------------");
		}
	}
}
