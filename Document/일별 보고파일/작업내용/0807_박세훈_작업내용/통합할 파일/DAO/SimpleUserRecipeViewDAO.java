package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;

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
				simpleUserRecipeVOList.add(new SimpleUserRecipeViewVO(res.getString("post_Code"), res.getString("recipe_Code"), res.getString("user_Code"), res.getString("complete_Image"),res.getString("recipe_name"), res.getString("RECIPE_DESCRIPTION"), res.getInt("like_Count"), res.getInt("post_Hits"),res.getString("POST_HASH_TAG"), res.getString("user_Name"),res.getString("user_image")));
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
				simpleUserRecipeVOList.add(new SimpleUserRecipeViewVO(res.getString("post_Code"), res.getString("recipe_Code"), res.getString("user_Code"), res.getString("complete_Image"),res.getString("recipe_name"), res.getString("RECIPE_DESCRIPTION"), res.getInt("like_Count"), res.getInt("post_Hits"),res.getString("POST_HASH_TAG"), res.getString("user_Name"),res.getString("user_image")));
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
	/**
	 * 
	 * @param userCode
	 * @return
	 */
	public LinkedList<SimpleUserRecipeViewVO> requestSimpleUserRecipeList(String userCode) {
		/*시퀀스에는 전달인자로 userCode받는게 없어서 코드에 추가함.*/
		/*return type 사용자가 작성한것들들에는 simpleRecipeViewVO가 없어서 SimpleUserRecipeViewVO로 변경*/
		LinkedList<SimpleUserRecipeViewVO> simpleUserRecipeVOList = new LinkedList<SimpleUserRecipeViewVO>();
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from user_recipe_view where user_code=?";
			pstmt = conn.getConn().prepareStatement(sql);
			pstmt.setString(1, userCode);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				simpleUserRecipeVOList.add(new SimpleUserRecipeViewVO(res.getString("post_Code"), res.getString("recipe_Code"), res.getString("user_Code"), res.getString("complete_Image"),res.getString("recipe_name"), res.getString("RECIPE_DESCRIPTION"), res.getInt("like_Count"), res.getInt("post_Hits"),res.getString("POST_HASH_TAG"), res.getString("user_Name"),res.getString("user_image")));
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
	/**
	 * 음..확장한다면 재사용이 가능할까?
	 * 메소드를 두개로 나누어 놨지만 서로 의존관계에 있는 두개의 메소드가 있다면
	 * 이게 바로 oop적인게 맞나 모르겠다 ㅠㅠ
	 * @param method
	 * @param situation
	 * @param nation
	 * @param ingredient
	 * @return
	 */
	public LinkedList<SimpleUserRecipeViewVO> searchUserRecipeList(String method,String situation,String nation,String ingredient) {
		/*LinkedList<SimpleUserRecipeViewVO> simpleUserRecipeVOList = new LinkedList<SimpleUserRecipeViewVO>();*/
		ArrayList<String> speedArray = new ArrayList<String>();
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from recipe_category_tb where method_category_code like ? and situation_category_code like ? and country_category_code like ? and ingredient_category_code like ?";
			pstmt = conn.getConn().prepareStatement(sql);
			pstmt.setString(1, "%"+method);
			pstmt.setString(2, "%"+situation);
			pstmt.setString(3, "%"+nation);
			pstmt.setString(4, "%"+ingredient);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				speedArray.add(res.getString("recipe_code"));
				System.out.println(res.getString("recipe_code")+"/여기");
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
		return searchUserRecipeList(speedArray.toArray(new String[speedArray.size()]));
		
	}
	public LinkedList<SimpleUserRecipeViewVO> searchUserRecipeList(String[] recipeCodeList) {
		LinkedList<SimpleUserRecipeViewVO> userRecipeViewVOList =new LinkedList<SimpleUserRecipeViewVO>();
		PreparedStatement pstmt = null;
		try {
			String sql = null;
			/*System.out.println(recipeCodeList.length);*/
			for(int i=0;i<recipeCodeList.length;i++) {
				sql ="select * from simple_user_recipe_view where recipe_code = ?";
				pstmt = conn.getConn().prepareStatement(sql);
				System.out.println(recipeCodeList[i]);
				pstmt.setString(1, recipeCodeList[i]);
				
				ResultSet res = pstmt.executeQuery();
				while(res.next()) {
					System.out.println(res.getString("post_Code")+ res.getString("recipe_Code")+ res.getString("user_Code")+ res.getString("complete_Image")+res.getString("recipe_name")+ res.getString("RECIPE_DESCRIPTION")+ res.getInt("like_Count")+ res.getInt("post_Hits")+res.getString("POST_HASH_TAG")+ res.getString("user_Name")+res.getString("user_image"));
					userRecipeViewVOList.add(new SimpleUserRecipeViewVO(res.getString("post_Code"), res.getString("recipe_Code"), res.getString("user_Code"), res.getString("complete_Image"),res.getString("recipe_name"), res.getString("RECIPE_DESCRIPTION"), res.getInt("like_Count"), res.getInt("post_Hits"),res.getString("POST_HASH_TAG"), res.getString("user_Name"),res.getString("user_image")));
				}
				pstmt.close();
				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				//pstmt.close();/*data들어간 후 여기에서 null pointer 안뜨길 기원합니다..*/
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return userRecipeViewVOList;
	}
	public static void main(String[]args) {
		/*System.out.println(SimpleUserRecipeViewDAO.getInstance().searchUserRecipeListByHashTag("스팸"));*/
		/*SimpleUserRecipeViewDAO.getInstance().searchUserRecipeList("u1","u1","u1","u1");*/
		System.out.println(SimpleUserRecipeViewDAO.getInstance().searchUserRecipeList(new String[]{"UR001","UR002","UR003"}));;
	}
	
}
