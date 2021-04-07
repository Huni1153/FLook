package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.DBConnection;
import ViewVO.UserRecipeViewVO;

public class UserRecipeViewDAO {
	private static UserRecipeViewDAO dao=new UserRecipeViewDAO();
	private DBConnection dbConnection;
	private UserRecipeViewDAO()
	{
		dbConnection=DBConnection.getInstance();
	}
	public UserRecipeViewDAO getInstance()
	{
		return dao;
	}
	public UserRecipeViewVO searchUserRecipe(String postCode) 
	{
		PreparedStatement pstmt = null;
		UserRecipeViewVO userRecipeViewVO=null;
		try {
			String sql = "SELECT * FROM user_recipe_view WHERE post_code=?";
			Connection conn = dbConnection.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, postCode); 

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String recipeCode=rs.getString("recipe_code");
				String userCode=rs.getString("user_code");
				String completeImage=rs.getString("complete_image");
				String recipeName=rs.getString("recipe_name");
				String recipeDescription=rs.getString("recipe_description");
				int personNumber=rs.getInt("person_number");
				String cookingTime=rs.getString("cooking_time");
				String cookingLevel=rs.getString("cooking_level");
				int likeCount=rs.getInt("like_count");
				int postHits=rs.getInt("post_hits");
				String postHashTag=rs.getString("post_hash_tag");
				String userName=rs.getString("user_name");
				String userImage=rs.getString("user_image");
				userRecipeViewVO=new UserRecipeViewVO(postCode, recipeCode, userCode, completeImage, recipeName, recipeDescription, personNumber, cookingTime, cookingLevel, likeCount, postHits, postHashTag, userName, userImage);				
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return userRecipeViewVO;
		
	}
	
	
}
