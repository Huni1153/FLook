package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import VO.CookingVO;
import calculate.CalculateCode;
import connection.DBConnection;

public class CookingDAO {
	private DBConnection dbConnection;
	private static CookingDAO dao=new CookingDAO();
	private static final String codeType="0401CK";
	private static int codeNum=1;

	private CookingDAO() {
		dbConnection = DBConnection.getInstance();
		// TODO Auto-generated constructor stub
	}
	public static CookingDAO getInstance()
	{
		return dao;
	}

	public CookingDAO(DBConnection connection) {
		this.dbConnection = connection;
	}

	public DBConnection getConnection() {
		return dbConnection;
	}

	public void setConnection(DBConnection connection) {
		this.dbConnection = connection;
	}
	public String insertCooking(CookingVO cookingVO)
	{
		String cookingCode=cookingVO.getCookingCode();
		String recipeCode=cookingVO.getRecipeCode();
		int cookingSequence=cookingVO.getCookingSequence();
		String cookingImage=cookingVO.getCookingImage();
		String cookingCaption=cookingVO.getCookingCaption();
		if(cookingCode!=null)
		{
			return insertCooking(cookingCode, recipeCode, cookingSequence, cookingImage, cookingCaption);
		}
		else
		{
			return insertCooking(recipeCode, cookingSequence, cookingImage, cookingCaption);	
		}
		
	}

	public String insertCooking(String recipeCode,int cookingSequence,String cookingImage,String cookingCaption){
		int row=0;
		PreparedStatement pstmt = null;
		String cookingCode=CalculateCode.makeCode(codeType, codeNum);
		try
		{

			String sql="insert into cooking_tb VALUES(?,?,?,?,?)";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,cookingCode);
			pstmt.setString(2,recipeCode);
			pstmt.setInt(3,cookingSequence);
			pstmt.setString(4,cookingImage);
			pstmt.setString(5,cookingCaption);
	
			row=pstmt.executeUpdate();
			if(row!=0)
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
		if(row!=0)
		{
			codeNum++;
			return cookingCode;
		}
		return null;	
	}

	public String insertCooking(String cookingCode,String recipeCode,int cookingSequence,String cookingImage,String cookingCaption){
		int row=0;
		PreparedStatement pstmt = null;
		try
		{

			String sql="insert into cooking_tb VALUES(?,?,?,?,?)";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,cookingCode);
			pstmt.setString(2,recipeCode);
			pstmt.setInt(3,cookingSequence);
			pstmt.setString(4,cookingImage);
			pstmt.setString(5,cookingCaption);
	
			row=pstmt.executeUpdate();
			if(row!=0)
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
		if(row!=0)
		{
			return cookingCode;
		}
		return null;	
	}

	
	public static void main(String args[]){
		CookingDAO dao= CookingDAO.getInstance();
		//System.out.println(dao.insertCooking("Cooking_001", "RECIPE_001",1, "이미지2", "설명중입니다"));
//		System.out.println(dao.deleteCooking("Cooking_001"));
		//System.out.println(dao.updateCooking("RECIPE_002", "RECIPE_002",3, "image333", "newCaption", "cooking_001"));
	}
	
}
