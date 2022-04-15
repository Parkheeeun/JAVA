package Pkg.DB;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.OracleTypes;

import java.sql.CallableStatement;

public class DBHandle {

	private String dbID;
	private String dbPass;
	private String dbUrl;
	private QueryKind queryKind;
	
	public DBHandle(String dbUrl, String dbID, String dbPass) {
		this.dbUrl=dbUrl;
		this.dbID=dbID;
		this.dbPass=dbPass;
	}
	private Connection getConnection() {
		Connection dbConn=null;
		try {
			//0.드라이브연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.연결class를만든다.
			dbConn=DriverManager.getConnection(this.dbUrl, this.dbID, this.dbPass);
		}catch(Exception e) {
			System.out.println("getConnection");
			System.out.println(e.getMessage());
		}
		return dbConn;
	}
	
	private PreparedStatement getPreparedStatement(String strSql, String[] strParams) {
		PreparedStatement psmt=null;
		try {
			Connection dbConn=getConnection();
			psmt=dbConn.prepareStatement(strSql);
			for(int i=0; i<strParams.length; i++) {
				psmt.setString(i+1,strParams[i]);
			}
		}catch(Exception e) {
			System.out.println("getPreparedStatement");
			System.out.println(e.getMessage());
		}
		return psmt;
	}
	
	private CallableStatement getCallableStatement(String strProcName, String[] strParams) {
		CallableStatement csmt=null;
		try {
			Connection dbConn=getConnection();
			csmt=dbConn.prepareCall(strProcName);
			for(int i=0; i<strParams.length; i++) {
				csmt.setString(i+1,strParams[i]);
			}
		}catch(Exception e) {
			System.out.println("getCallableStatement");
			System.out.println(e.getMessage());
		}
		return csmt;
	}
	
	public ResultSet getDBSelect(String strSql, String[] strParams, QueryKind queryKind,boolean isExistOutput) {
		//inline
		ResultSet rs=null;
		try {
			if(queryKind==QueryKind.Inline) {
				PreparedStatement psmt=getPreparedStatement(strSql,strParams);
				rs=psmt.executeQuery();
			}
			if(queryKind==QueryKind.Procedure){
				CallableStatement csmt=getCallableStatement(strSql,strParams);
				
				//단 프로시저에 output cursor가있을때만
				if(isExistOutput) {
					csmt.registerOutParameter(strParams.length+1,OracleTypes.CURSOR);
					csmt.executeQuery();
					rs=(ResultSet)csmt.getObject(strParams.length+1);
				}
				else {
					rs=csmt.executeQuery();
				}
			}
		}catch(Exception e) {
			System.out.println("getDBSelect");
			System.out.println(e.getMessage());
		}
		return rs;
	}
	
	
	public int getDBHandle(String strSql, String[] strParams, QueryKind queryKind) {
		int rowCnt=0;
		try {
			if(queryKind==QueryKind.Inline) {
				PreparedStatement psmt=getPreparedStatement(strSql,strParams);
				rowCnt=psmt.executeUpdate();
			}
			if(queryKind==QueryKind.Procedure){
				CallableStatement csmt=getCallableStatement(strSql,strParams);
				rowCnt=csmt.executeUpdate();
			}
		}catch(Exception e){
			System.out.println("getDBHandle");
			System.out.println(e.getMessage());
		}
		return rowCnt;
	}
}
