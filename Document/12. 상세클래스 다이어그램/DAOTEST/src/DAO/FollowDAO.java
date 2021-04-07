package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;

public class FollowDAO {
	
	private DBConnection dbConnection;

	public FollowDAO() {
		// TODO Auto-generated constructor stub
		this.dbConnection = new DBConnection();
	}

	public FollowDAO(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
	}

	public DBConnection getDbConnection() {
		return dbConnection;
	}

	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	
	public int insertFollow(String followCode,String userCode,String followUserCode){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="insert into follow_tb(follow_code,user_code,follow_user_code)"+
			"VALUES(?,?,?)";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,followCode);
			pstmt.setString(2,userCode);
			pstmt.setString(3,followUserCode);
	
			rowNum=pstmt.executeUpdate();
			if(rowNum!=0)
				dbConnection.getConn().commit();
		}
		catch (SQLException se)
		{
			System.out.println(se.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			try
			{
				if(pstmt != null) pstmt.close();
			}
			catch (SQLException se)
			{
				System.out.println(se.getMessage());
			}
		}
		return rowNum;
	}
	
	public int deleteFollow(String userCode,String followUserCode){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="delete from follow_tb where user_code=? AND follow_user_code=?";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,userCode);
			pstmt.setString(2,followUserCode);
	
			rowNum=pstmt.executeUpdate();
			if(rowNum!=0)
				dbConnection.getConn().commit();
		}
		catch (SQLException se)
		{
			System.out.println(se.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			try
			{
				if(pstmt != null) pstmt.close();
			}
			catch (SQLException se)
			{
				System.out.println(se.getMessage());
			}
		}
		return rowNum;
		
	}

	
	public static void main(String args[]){
		System.out.println(new FollowDAO().insertFollow("FOLLOW002", "USER_002", "USER_001"));
	}
	

}
