package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;

public class PreferenceDAO {
	private DBConnection dbConnection;

	public PreferenceDAO() {
		// TODO Auto-generated constructor stub
		dbConnection=new DBConnection();
	}

	public PreferenceDAO(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public DBConnection getDbConnection() {
		return dbConnection;
	}

	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	
	public int insertPreference(String preferenceCode,int preferenceScore,String userCode,String recipeCode){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="insert into preference_tb values(?,?,?,?)";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,preferenceCode);
			pstmt.setString(2,String.valueOf(preferenceScore));
			pstmt.setString(3, userCode);
			pstmt.setString(4, recipeCode);
	
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

	public int deletePreference(String preferenceCode){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="delete from preference_tb where preference_code=?";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,preferenceCode);
	
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
    
	public int modifyPreferenceScore(String preferenceCode,int preferenceScore){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="update preference_tb set preference_score=? where preference_code=?";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,String.valueOf(preferenceScore));
			pstmt.setString(2,preferenceCode);
		
	
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
		PreferenceDAO dao= new PreferenceDAO();
		System.out.println(dao.insertPreference("PREFER_001", 3, "USER_001", "RECIPE_001"));
		//System.out.println(dao.deletePreference("USER_001"));
	}


}
