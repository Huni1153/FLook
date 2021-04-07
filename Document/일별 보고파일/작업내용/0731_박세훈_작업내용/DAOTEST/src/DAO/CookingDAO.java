package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;

public class CookingDAO {
	private DBConnection dbConnection;

	public CookingDAO() {
		dbConnection=new DBConnection();
		// TODO Auto-generated constructor stub
	}

	public CookingDAO(DBConnection connection) {
		super();
		this.dbConnection = connection;
	}

	public DBConnection getConnection() {
		return dbConnection;
	}

	public void setConnection(DBConnection connection) {
		this.dbConnection = connection;
	}
	
	public int insertCooking(String cookingCode,String recipeCode,int cookingSequence,String cookingImage,String cookingCaption){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="insert into cooking_tb VALUES(?,?,?,?,?)";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,cookingCode);
			pstmt.setString(2,recipeCode);
			pstmt.setString(3,String.valueOf(cookingSequence));
			pstmt.setString(4,cookingImage);
			pstmt.setString(5,cookingCaption);
	
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

	public int deleteCooking(String cookingCode){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="delete from cooking_tb where cooking_code=?";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,cookingCode);
	
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
	public int deleteCooking(String cookingCode,int cookingSequence){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="delete from cooking_tb where cooking_code=? cooking_sequence=?";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,cookingCode);
			pstmt.setString(2, String.valueOf(cookingSequence));
	
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
	
	
	public int updateCooking(String oldRecipeCode,String newRecipeCode,int newCookingSequence,String newCookingImage,String newCookingCaption,String newCookingCode){
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="update cooking_tb set recipe_code=?,cooking_sequence=?,cooking_image=?,cooking_caption=? where recipe_code=? ";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,newRecipeCode);
			pstmt.setString(2,String.valueOf(newCookingSequence));
			pstmt.setString(3,newCookingImage);
			pstmt.setString(4,newCookingCaption);
			pstmt.setString(5,oldRecipeCode);
	
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
	public int updateCooking2(String recipeCode,int cookingSequence,String newRecipeCode,int newCookingSequence,String newCookingImage,String newCookingCaption){
		
		int rowNum=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="update cooking_tb set recipe_code=?,cooking_sequence=?,cooking_image=?,cooking_caption=? where recipe_code=? AND cooking_sequence=?";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,newRecipeCode);
			pstmt.setString(2,String.valueOf(newCookingSequence));
			pstmt.setString(3,newCookingImage);
			pstmt.setString(4,newCookingCaption);
			pstmt.setString(5,recipeCode);
			pstmt.setString(6, String.valueOf(cookingSequence));
	
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
		CookingDAO dao= new CookingDAO();
		//System.out.println(dao.insertCooking("Cooking_001", "RECIPE_001",1, "이미지2", "설명중입니다"));
//		System.out.println(dao.deleteCooking("Cooking_001"));
		System.out.println(dao.updateCooking("RECIPE_002", "RECIPE_002",3, "image333", "newCaption", "cooking_001"));
	}
	
}
