package Pkg.Boards;

import java.sql.ResultSet;
import java.util.Scanner;

import Pkg.DB.*;

public class Board {

	private String idx;
	private String title;
	private User user; //작성자
	private DBHandle dbHandle;
	private DBUse dbUse;
	
	public Board() {
		dbHandle=new DBHandle(DBInfo.dbUrl,DBInfo.dbID,DBInfo.dbPass);
		dbUse=new DBUse();
	}
	
	private void boardUI() {
		Scanner scan=new Scanner(System.in);
		System.out.print("글제목을 입력하세요:");
	   this.title=scan.nextLine();
		
	}
	
	
	public void boardWrite(User user) { //글쓰는행위(업무)
		boardUI();
		boolean isLogin=user.getIsLogin();
		if(isLogin==true) {
			String strProcName="{call PKG_BOARD.PROC_INS_BOARD(?,?)}";
			String[] strParams=new String[2];
			strParams[0]=this.title;
			strParams[1]=user.getUserID();
			
			int rowCnt=dbHandle.getDBHandle(strProcName,strParams,QueryKind.Procedure);
			System.out.println(rowCnt+"개의 데이터가 입력되었습니다.");
			boardList2();
		}
		else {
			System.out.println("로그인해주세요.");
			user.Login();
		}
	}
	
	private void boardList() {
		String strProcName="{call PKG_BOARD.PROC_SEL_BOARD(?,?)}";
		String[] strParams=new String[1];
		strParams[0]="";
		try {
		ResultSet rs=this.dbHandle.getDBSelect(strProcName, strParams, QueryKind.Procedure, true);
		String strIDX="";
		String strTITLE="";
		String strUSERID="";
		String strUSERNAME="";
		String strREGDATE="";
		while(rs.next()) {
			strIDX=rs.getString("IDX");
			strTITLE=rs.getString("TITLE");
			strUSERID=rs.getString("USERID");
			strUSERNAME=rs.getString("USERNAME");
			strREGDATE=rs.getString("REGDATE");
			System.out.println(strIDX+" - "+strTITLE+" - "+strUSERID+" - "+strUSERNAME+" - "+strREGDATE);
		}
		}catch(Exception e) {
			System.out.println("boardList");
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public void boardList2() {
		String strProcName="{call PKG_BOARD.PROC_SEL_BOARD(?,?)}";
		String[] strParams=new String[1];
		strParams[0]="";
		try {
			dbUse.setQueryKind(QueryKind.Procedure);
			ResultSet rs=this.dbUse.getDBSelect(strProcName, strParams,true);
			String strIDX="";
			String strTITLE="";
			String strUSERID="";
			String strUSERNAME="";
			String strREGDATE="";
			while(rs.next()) {
				strIDX=rs.getString("IDX");
				strTITLE=rs.getString("TITLE");
				strUSERID=rs.getString("USERID");
				strUSERNAME=rs.getString("USERNAME");
				strREGDATE=rs.getString("REGDATE");
				System.out.println(strIDX+" - "+strTITLE+" - "+strUSERID+" - "+strUSERNAME+" - "+strREGDATE);
		}
		}catch(Exception e) {
			System.out.println("boardList2");
			System.out.println(e.getMessage());
		}
	}
}
