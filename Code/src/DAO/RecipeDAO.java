package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Calculate.CalculateCode;
import VO.RecipeVO;
import Connection.DBConnection;

public class RecipeDAO {
	private DBConnection dbConnection; 
	private static RecipeDAO dao;
	private static int codeNum=1;
	private static final String codeType="0101UR";
	static{
		dao=new RecipeDAO();
	}
	public static RecipeDAO getInstance()
	{
		return dao;
	}
	private RecipeDAO() { 
		dbConnection = DBConnection.getInstance();
	} 
	public DBConnection getDbConnection() {
		return dbConnection;
	}
	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	} 
	public String insertRecipe(RecipeVO recipeVO)
	{
		String recipeCode=recipeVO.getRecipeCode();
		String completeImage=recipeVO.getCompleteImage();
		String recipeName=recipeVO.getRecipeName();
		String recipeDescription=recipeVO.getRecipeDescription();
		int personNumber=recipeVO.getPersonNumber();
		String cookingTime=recipeVO.getCookingTime();
		String cookingLevel=recipeVO.getCookingLevel();
		if(recipeCode!=null)
		{
			return this.insertRecipe(recipeCode, completeImage, recipeName, recipeDescription, personNumber, cookingTime, cookingLevel);
		}
		else
		{
			return this.insertRecipe(completeImage, recipeName, recipeDescription, personNumber, cookingTime, cookingLevel);
		}
	}
	public String insertRecipe(String completeImage,String recipeName,String recipeDescription,int personNumber,String cookingTime,String cookingLevel)
	{
		PreparedStatement pstmt=null;
		String recipeCode=CalculateCode.makeCode(codeType, codeNum);
		
		int row = 0; 
		try
		{
			String sql = "INSERT INTO recipe_tb VALUES(?,?,?,?,?,?,?)";
			Connection conn = dbConnection.getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,recipeCode);
			pstmt.setString(2,completeImage);
			pstmt.setString(3,recipeName);
			pstmt.setString(4,recipeDescription);
			pstmt.setInt(5,personNumber);
			pstmt.setString(6,cookingTime);
			pstmt.setString(7,cookingLevel);
			
			row=pstmt.executeUpdate();
			if(row!=0)
			{
				conn.commit(); 
			}

		}
		catch(SQLException se){
			System.out.println(se.getMessage());
		}finally{
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}   
		if(row!=0)
		{ 
			codeNum++;
			return recipeCode;
		}			
		return null; 	
	}
	public String insertRecipe(String recipeCode,String completeImage,String recipeName,String recipeDescription,int personNumber,String cookingTime,String cookingLevel)
	{
		PreparedStatement pstmt=null;
		int row = 0; 
		try
		{
			String sql = "INSERT INTO recipe_tb VALUES(?,?,?,?,?,?,?)";
			Connection conn = dbConnection.getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,recipeCode);
			pstmt.setString(2,completeImage);
			pstmt.setString(3,recipeName);
			pstmt.setString(4,recipeDescription);
			pstmt.setInt(5,personNumber);
			pstmt.setString(6,cookingTime);
			pstmt.setString(7,cookingLevel);
			
			row=pstmt.executeUpdate();
			if(row!=0)
			{
				conn.commit(); 
			}

		}
		catch(SQLException se){
			System.out.println(se.getMessage());
		}finally{
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}   
		if(row!=0)
		{ 
			return recipeCode;
		}			
		return null; 	
	}
	public static void main(String[] args)
	{
		RecipeDAO dao=RecipeDAO.getInstance();
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		System.out.println(dao.insertRecipe( "bbb", "ccc", "ddd", 5, "eee", "fff")); 
		
		int b=100;
		System.out.println(Integer.toString(b));
	}
}
