package Pkg.Boards;

import java.util.Scanner;

public class Board  implements IBoard{

	//1.작성자 --User
	//2.글제목 --String
	//3.글내용 --String
	//4.작성일 --String
	//5.글번호 --int
	
	private User user;
	private String title;
	private String content;
	private String regdate;
	private int regnum;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getRegnum() {
		return regnum;
	}
	public void setRegnum(int regnum) {
		this.regnum = regnum;
	}
	public User getUser() {
		return user;
	}
	
	
	public Board() {
		
	}
	
	@Override
	public void insert(User user) {
		System.out.println(user.getUserName()+"님 반갑습니다.");
		Scanner scanner=new Scanner(System.in);
		System.out.println("글제목을 입력하세요:");
		this.title=scanner.nextLine();
		
		System.out.println("글내용을 입력하세요.");
		this.content=scanner.nextLine();
		
		System.out.println("날짜를 입력하세요.");
		this.regdate=scanner.nextLine();
		
		this.user=user;
	}
	@Override
	public void delete() {
		System.out.println("게시판글을 삭제하는 업무");
	}
	@Override
	public void update() {
		System.out.println("게시판글을 수정하는업무");
	}
	
	
	
}
