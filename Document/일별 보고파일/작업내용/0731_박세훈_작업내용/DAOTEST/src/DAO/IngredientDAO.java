package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;

public class IngredientDAO {
	private DBConnection dbConnection;

	public IngredientDAO() {
		this.dbConnection=new DBConnection();
		// TODO Auto-generated constructor stub
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

	public int insertIngredient(String ingredientCode,String recipeCode,String ingredientName, String ingredientAmount,String ingredientUnit,String ingredientType)
 {
		int rowNum = 0;
		PreparedStatement pstmt = null;
		try {

			String sql = "insert into ingredient_tb values(?,?,?,?,?,?) ";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, ingredientCode);
			pstmt.setString(2, recipeCode);
			pstmt.setString(3, ingredientName);
			pstmt.setString(4, ingredientAmount);
			pstmt.setString(5, ingredientUnit);
			pstmt.setString(6, ingredientType);

			rowNum = pstmt.executeUpdate();
			if (rowNum != 0)
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
		return rowNum;

	}
	public int modifyIngredient(String ingredientCode,String ingredientName,String ingredientAmount,String ingredientUnit,String ingredientType,int rowNumber ){
		int rowNum = 0;
		PreparedStatement pstmt = null;
		try {

			String sql = "update ingredient_tb set recipe_code=?, ingrediet_name=?,ingredient_amount=?,ingredient_unit=?, ingredient_type=?"+
					" where ingredientCode=?AND rowNumber=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, ingredientCode);
			pstmt.setString(2, ingredientName);
			pstmt.setString(3, ingredientAmount);
			pstmt.setString(4, ingredientUnit);
			pstmt.setString(5, ingredientType);
			pstmt.setString(6, ingredientCode);
			pstmt.setString(7, String.valueOf(rowNumber));

			rowNum = pstmt.executeUpdate();
			if (rowNum != 0)
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
		return rowNum;

	}
	public int modifyIngredient(String ingredientCode,String ingredientName,String ingredientAmount,String ingredientUnit,String ingredientType ){
		int rowNum = 0;
		PreparedStatement pstmt = null;
		try {

			String sql = "update ingredient_tb set recipe_code=?, ingrediet_name=?,ingredient_amount=?,ingredient_unit=?, ingredient_type=?"+
					" where ingredientCode=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, ingredientCode);
			pstmt.setString(2, ingredientName);
			pstmt.setString(3, ingredientAmount);
			pstmt.setString(4, ingredientUnit);
			pstmt.setString(5, ingredientType);
			pstmt.setString(6, ingredientCode);

			rowNum = pstmt.executeUpdate();
			if (rowNum != 0)
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
		return rowNum;

	}

	
	public int deleteIngrediet(String ingredientCode){
		int rowNum = 0;
		PreparedStatement pstmt = null;
		try {

			String sql = "delete from ingredient_tb where ingredient_code=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, ingredientCode);

			rowNum = pstmt.executeUpdate();
			if (rowNum != 0)
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
		return rowNum;

		
	}
	public int deleteIngrediet(String ingredientCode,String ingredientName){
		int rowNum = 0;
		PreparedStatement pstmt = null;
		try {

			String sql = "delete from ingredient_tb where ingredient_code=? AND ingredient_name=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, ingredientCode);
			pstmt.setString(2, ingredientName);

			rowNum = pstmt.executeUpdate();
			if (rowNum != 0)
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
		return rowNum;
		
	}

	
	public static void main(String args[]){
		System.out.println(new IngredientDAO().insertIngredient("INGRE", "RECIPE_001", "음식재료1", "1000", "G", "주"));
		//System.out.println(new IngredientDAO().deleteIngrediet("INGRE"));//("INGRE", "RECIPE_001", "음식재료1", "1000", "G", "주"));
		//System.out.println(new IngredientDAO().deleteIngrediet("INGRE", "음식재료1"));
	}
	

}
