package Pkg.Boards;

import java.sql.ResultSet;
import java.util.Scanner;

import Pkg.DB.DBHandle;
import Pkg.DB.DBInfo;
import Pkg.DB.QueryKind;

public class User {

	private String userID;
	private String userName;
	private DBHandle dbHandle;
	private String userLoginID;
	private String userLoginPass;
	private boolean isLogin;
	
	public String getUserID() {
		return userID;
	}
	public String getUserName() {
		return userName;
	}
	
	public boolean getIsLogin() {
		return isLogin;
	}
	
	
	
	public User() {

		this.isLogin=false;
		dbHandle=new DBHandle(DBInfo.dbUrl,DBInfo.dbID,DBInfo.dbPass);
	}
	
	
	
	private void loginUI() {
		Scanner scan=new Scanner(System.in);
		System.out.println("사용자아이디: ");
		userLoginID=scan.nextLine();
		System.out.println("사용자패스워드: ");
		userLoginPass=scan.nextLine();
	}
	
	public boolean Login() {
		loginUI();
		boolean isLogin=false;
		String strSql="";
		
		strSql+="SELECT DECODE(MAX(USERID),NULL,'FAIL','SUCCESS')AS ISLOGIN";
		strSql+=",MAX(USERID)AS USERID";
		strSql+=",MAX(USERNAME)AS USERNAME ";
		strSql+= "FROM USERS"; 
		strSql+=" WHERE USERID=?";
		strSql+=" AND USERPASS=?";
		
		try {
			String[] strParams=new String[2];
			strParams[0]=userLoginID;
			strParams[1]=userLoginPass;
			
			ResultSet rs=dbHandle.getDBSelect(strSql, strParams, QueryKind.Inline,false);
			String strISLogin="";
			String strUSERID="";
			String strUSERNAME="";
			
			
			while(rs.next()) {
				strISLogin=rs.getString("ISLOGIN");
				strUSERID=rs.getString("USERID");
				strUSERNAME=rs.getString("USERNAME");
				System.out.println(strISLogin+"- "+strUSERID+" - "+strUSERNAME);
				}
			
			if(strISLogin.equals("SUCCESS")) {
				System.out.println("로그인성공");
				this.userID=strUSERID;
				this.userName=strUSERNAME;
				this.isLogin=true;
			}
			else {
				System.out.println("로그인실패");
				Login();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

		return isLogin;
	}
	
	
	
	
	
}

	