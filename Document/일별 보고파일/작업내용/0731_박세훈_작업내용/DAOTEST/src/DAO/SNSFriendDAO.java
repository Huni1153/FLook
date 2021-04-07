package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;

public class SNSFriendDAO {
	private DBConnection dbConnection;

	public SNSFriendDAO() {
		this.dbConnection=new DBConnection();
		// TODO Auto-generated constructor stub
	}

	public SNSFriendDAO(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public DBConnection getDbConnection() {
		return dbConnection;
	}

	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	
	public int insertSNSfriend(String snsFriendCode,String userCode,String friendUserCode){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="INSERT INTO SNS_friend_tb(sns_friend_code,user_code,friend_user_code) "
					+ "VALUES(?,?,?)";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,snsFriendCode);
			pstmt.setString(2,userCode);
			pstmt.setString(3,friendUserCode);
	
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


    public int deleteSNSfriend(String userCode,String friendUserCode){
    	int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="delete from SNS_friend_tb where user_code=? and friend_user_code=?";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,userCode);
			pstmt.setString(2,friendUserCode);
	
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
    public int modifySNSfriend(String newfriendUserCode,String userCode){
    	int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="update SNS_friend_tb Set friend_user_code=? where user_code=?";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,newfriendUserCode);
			pstmt.setString(2,userCode);
	
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
    
    public static void main(String args []){
    	//System.out.println(new SNSFriendDAO().insertSNSfriend("SNS_001", "USER_001", "USER_002"));
    	System.out.println(new SNSFriendDAO().insertSNSfriend("SNS_002", "USER_002", "USER_003"));
    	//System.out.println(new SNSFriendDAO().deleteSNSfriend("USER_001", "USER_002"));
    	System.out.println(new SNSFriendDAO().modifySNSfriend("USER_003", "USER_001"));
    	
    }
    




}
