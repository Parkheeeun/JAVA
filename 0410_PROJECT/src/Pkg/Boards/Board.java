package Pkg.Boards;

import java.util.Scanner;
public class Board implements IBoard{

	//글번호,글제목,글내용,작성날짜,작성자
	private User user;
	private String	title;
	private String content;
	private String regDate;
	private int regNum;
	
	public User getUser() {
		return user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public String getRegDate() {
		return regDate;
	}
	public int getRegNum() {
		return regNum;
	}
	
	
	@Override
	public void insert(User user) {
		System.out.println(user.getUserName()+"님 반갑습니다.");
		Scanner scanner=new Scanner(System.in);
		System.out.print("글제목을 입력하세요:");
		this.title=scanner.nextLine();
		System.out.print("글내용을 입력하세요:");
		this.content=scanner.nextLine();
		System.out.print("날짜를 입력하세요:");
		this.regDate=scanner.nextLine();
		this.user=user;
		
	}
	@Override
	public void delete() {
		System.out.println("게시판 삭제");
	}
	@Override
	public void update() {
		System.out.println("게시판 수정");
	}
	

}
