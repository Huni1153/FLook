package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import VO.IngredientVO;
import Calculate.CalculateCode;
import Connection.DBConnection;

public class IngredientDAO {
	private DBConnection dbConnection;
	private static IngredientDAO dao = new IngredientDAO();
	private static final String codeType = "03";
	private static int mainCodeNum=1;
	private static int subCodeNum=1;
	

	private IngredientDAO() {
		dbConnection = DBConnection.getInstance();
		// TODO Auto-generated constructor stub
	}

	public static IngredientDAO getInstance() {
		return IngredientDAO.dao;

	}

	public IngredientDAO(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public DBConnection getDbConnection() {
		return dbConnection;
	}

	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	public String insertIngredient(IngredientVO ingredientVO)
	{
		String recipeCode=ingredientVO.getRecipeCode();
		String ingredientName=ingredientVO.getIngredientName();
		int ingredientAmount=ingredientVO.getIngredientAmount();
		String ingredientType=ingredientVO.getIngredientType();
		String ingredientUnitCode=ingredientVO.getIngredientUnitCode();
		return insertIngredient(recipeCode, ingredientName, ingredientAmount, ingredientType, ingredientUnitCode);
	}

	public String insertIngredient( String recipeCode,
			String ingredientName, int ingredientAmount,
			String ingredientType, String ingredientUnitCode) {
		int row = 0;
		PreparedStatement pstmt = null;
		String ingredientCode=codeType;
		if(ingredientType.equals("M"))
		{
			ingredientCode=CalculateCode.makeCode(codeType+"01"+ingredientType,mainCodeNum);
			mainCodeNum++;
		}
		else
		{
			ingredientCode=CalculateCode.makeCode(codeType+"02"+ingredientType,subCodeNum);
			subCodeNum++;
		}
		try {

			String sql = "insert into ingredient_tb values(?,?,?,?,?,?) ";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, ingredientCode);
			pstmt.setString(2, recipeCode);
			pstmt.setString(3, ingredientName);
			pstmt.setInt(4, ingredientAmount);
			pstmt.setString(5, ingredientType);
			pstmt.setString(6, ingredientUnitCode);

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
		if(row!=0)
		{
			return ingredientCode;
		}
		return null;

	}
	public String insertIngredient(String ingredientCode, String recipeCode,
			String ingredientName, String ingredientAmount,
			String ingredientType, String ingredientUnitCode) {
		int row = 0;
		PreparedStatement pstmt = null;
		try {

			String sql = "insert into ingredient_tb values(?,?,?,?,?,?) ";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, ingredientCode);
			pstmt.setString(2, recipeCode);
			pstmt.setString(3, ingredientName);
			pstmt.setString(4, ingredientAmount);
			pstmt.setString(5, ingredientType);
			pstmt.setString(6, ingredientUnitCode);

			row= pstmt.executeUpdate();
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

		if(row!=0)
		{
			return ingredientCode;
		}
		return null;

	}

	public static void main(String args[]) {
		System.out.println(new IngredientDAO().insertIngredient(
				"code2", "음식재료1", 1000, "M", "unitCode"));
		System.out.println(new IngredientDAO().insertIngredient(
				"code2", "음식재료1", 1000, "M", "unitCode"));
		System.out.println(new IngredientDAO().insertIngredient(
				"code2", "음식재료1", 1000, "S", "unitCode"));
		System.out.println(new IngredientDAO().insertIngredient(
				"code2", "음식재료1", 1000, "M", "unitCode"));
		System.out.println(new IngredientDAO().insertIngredient(
				"code2", "음식재료1", 1000, "S", "unitCode"));
		// System.out.println(new
		// IngredientDAO().deleteIngrediet("INGRE"));//("INGRE", "RECIPE_001",
		// "음식재료1", "1000", "G", "주"));
		// System.out.println(new IngredientDAO().deleteIngrediet("INGRE",
		// "음식재료1"));
	}

}
