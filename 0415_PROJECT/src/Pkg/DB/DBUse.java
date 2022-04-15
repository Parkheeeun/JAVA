package Pkg.DB;

import java.sql.*;

import oracle.jdbc.OracleTypes;

public class DBUse {

	private Connection dbCon;
	private PreparedStatement psmt;
	private CallableStatement csmt;
	
	private QueryKind queryKind;
	
	public QueryKind getQueryKind() {
		return queryKind;
	}
	
	public void setQueryKind(QueryKind queryKind) {
		this.queryKind=queryKind;
	}
	
	public DBUse() {
		
	}
	
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			dbCon=DriverManager.getConnection(DBInfo.dbUrl,DBInfo.dbID,DBInfo.dbPass);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private void setPreparedStatement(String strSql, String[] strParams) { //inline 그릇
		try {
			getConnection();
			psmt=dbCon.prepareStatement(strSql);
			for(int i=0; i<strParams.length; i++) {
				psmt.setString(i+1, strParams[i]);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private void setCallableStatement(String strSql, String[] strParams) {
		try {
			getConnection();
			csmt=dbCon.prepareCall(strSql);
			for(int i=0; i<strParams.length; i++) {
				csmt.setString(i+1, strParams[i]);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public int dbHandle(String strSql, String[] strParams) {
		int dbCnt=0;
		try {
			if(queryKind==QueryKind.Inline) {
				setPreparedStatement(strSql,strParams);
				dbCnt=psmt.executeUpdate();
			}
			if(queryKind==QueryKind.Procedure) {
				setCallableStatement(strSql,strParams);
				dbCnt=csmt.executeUpdate();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dbCnt;
	}
	
	public ResultSet/*ArrayList<Board>*/ getDBSelect(String strSql, String[] strParams,boolean isCursor) {
		ResultSet rs=null;
		try {
			if(queryKind==QueryKind.Inline) {
				setPreparedStatement(strSql,strParams);
				rs=psmt.executeQuery();
				
				
			}
			if(queryKind==QueryKind.Procedure) {
				setCallableStatement(strSql,strParams);
				if(isCursor) {
					csmt.registerOutParameter(strParams.length+1,OracleTypes.CURSOR);
					csmt.executeQuery();
					rs=(ResultSet)csmt.getObject(strParams.length+1); //결과에대한 다운캐스팅
				
				}
				else {
					rs=csmt.executeQuery();
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
	
	
}
