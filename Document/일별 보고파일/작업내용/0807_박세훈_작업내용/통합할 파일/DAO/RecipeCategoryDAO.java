package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import Connection.DBConnection;

public class RecipeCategoryDAO {
	private DBConnection dbConnection;
	private static RecipeCategoryDAO dao = new RecipeCategoryDAO();
	
	private RecipeCategoryDAO()
	{
		dbConnection=DBConnection.getInstance();
	}
	public static RecipeCategoryDAO getInstance()
	{
		return dao;
	}

	public DBConnection getDbConnection() {
		return dbConnection;
	}

	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	public String insertCategory(String recipeCode,String[] recipeCategory)
	{
		PreparedStatement pstmt=null;
		String recipeCategoryCode=codeGenerator2();
		System.out.println("insertCaCh1");
		int row = 0; 
		try
		{
			String sql = "INSERT INTO recipe_category_tb VALUES(?,?,?,?,?,?,?)";
			Connection conn = dbConnection.getConn();
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,recipeCategoryCode);
			pstmt.setString(2,recipeCode);
			pstmt.setString(3,recipeCategory[0]);
			pstmt.setString(4,recipeCategory[1]);
			pstmt.setString(5,recipeCategory[2]);
			pstmt.setString(6,recipeCategory[3]); 
			pstmt.setString(7,recipeCategory[4]); 
			
			System.out.println(recipeCategoryCode);
			System.out.println(recipeCode);
			for(String code:recipeCategory)
			{
				System.out.println("codeCheck : "+code+"\n");
				
			}
			System.out.println("insertCaCh2");
			row=pstmt.executeUpdate();
			System.out.println("rowCheck");
			if(row!=0)
			{
				System.out.println("insertCaCh3");
				conn.commit(); 
			}

		}
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}   
		if(row!=0)
		{ 
			System.out.println("insertCaCh4");
			return recipeCategoryCode;
		}			
		System.out.println("insertCaCh5");
		return null; 	
	}
	public int deleteCategory(String recipeCode)
	{
		int row = 0;
		PreparedStatement pstmt = null;
		try {

			String sql = "DELETE FROM recipe_category_tb WHERE recipe_code='?'";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			
			pstmt.setString(1, recipeCode);
			
			row = pstmt.executeUpdate();
			if (row != 0)
				dbConnection.getConn().commit();
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		return row;
		
	}public String codeGenerator2(){
		SimpleDateFormat formatter = new SimpleDateFormat ( "yyyyMMdd", Locale.KOREA );
		Date currentTime = new Date ( );
		String dTime = formatter.format ( currentTime );
		System.out.println ( dTime );
		
		return dTime+"RCT"+System.currentTimeMillis();
	}

}
