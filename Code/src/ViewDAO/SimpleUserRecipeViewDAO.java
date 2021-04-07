package ViewDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import Connection.DBConnection;
import ViewVO.SimpleUserRecipeViewVO;

public class SimpleUserRecipeViewDAO {
	final static SimpleUserRecipeViewDAO simpleUserRecipeViewDAO;
	private DBConnection conn;
	static {
		simpleUserRecipeViewDAO = new SimpleUserRecipeViewDAO();
	}
	private SimpleUserRecipeViewDAO() {
		conn = DBConnection.getInstance();
	}
	public static SimpleUserRecipeViewDAO getInstance() {
		return simpleUserRecipeViewDAO;
	}
	public LinkedList<SimpleUserRecipeViewVO> searchUserRecipeListByRecipeName(String keyword)
	{
		LinkedList<SimpleUserRecipeViewVO> simpleUserRecipeVOList = new LinkedList<SimpleUserRecipeViewVO>();
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from user_recipe_view where recipe_name Like ?";
			pstmt = conn.getConn().prepareStatement(sql);
			pstmt.setString(1, "%"+keyword+"%");
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				simpleUserRecipeVOList.add(new SimpleUserRecipeViewVO(res.getString("post_Code"), res.getString("recipe_Code"), res.getString("user_Code"), res.getString("complete_Image"), res.getString("recipe_Description"), res.getInt("like_Count"), res.getInt("post_Hits"), res.getString("user_Name")));
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return simpleUserRecipeVOList;
		
	}
	public LinkedList<SimpleUserRecipeViewVO> searchUserRecipeListByHashTag(String keyword)
	{
		LinkedList<SimpleUserRecipeViewVO> simpleUserRecipeVOList = new LinkedList<SimpleUserRecipeViewVO>();
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from user_recipe_view where post_hash_tag Like ?";
			pstmt = conn.getConn().prepareStatement(sql);
			pstmt.setString(1, "%"+keyword+"%");
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				simpleUserRecipeVOList.add(new SimpleUserRecipeViewVO(res.getString("post_Code"), res.getString("recipe_Code"), res.getString("user_Code"), res.getString("complete_Image"), res.getString("RECIPE_DESCRIPTION"), res.getInt("like_Count"), res.getInt("post_Hits"), res.getString("user_Name")));
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return simpleUserRecipeVOList;
		
	}
	
	public static void main(String[]args) {
		System.out.println(SimpleUserRecipeViewDAO.getInstance().searchUserRecipeListByHashTag("½ºÆÔ"));
	}
	
}
