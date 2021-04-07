package ViewDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import Connection.DBConnection;
import ViewVO.FollowLikeRecipeViewVO;
import ViewVO.NewsfeedLatestOrderViewVO;

public class FollowLikeRecipeViewDAO {
	private static final FollowLikeRecipeViewDAO followLikeRecipeViewDAO = new FollowLikeRecipeViewDAO();
	private DBConnection dbConn;
	private Connection conn;
	
	private FollowLikeRecipeViewDAO()
	{
		this.dbConn = DBConnection.getInstance();
		conn = dbConn.getConn();
	}
	
	private static FollowLikeRecipeViewDAO getInstance()
	{
		return followLikeRecipeViewDAO;
	}
	
	public HashMap<String, FollowLikeRecipeViewVO> searchNewsFeedPopularOrder(String likeDate)
	{
		int cnt=1;
		HashMap<String, FollowLikeRecipeViewVO> followLikeMap = null;
		FollowLikeRecipeViewVO postVO = null;
		PreparedStatement pstmt = null;
		try
		{
			followLikeMap = new HashMap<String, FollowLikeRecipeViewVO>();
			String sql = "select * from follow_like_recipe_view order by niceness_date";
			pstmt = conn.prepareStatement(sql);
			/*pstmt.setInt(1, index);
			pstmt.setInt(2, index+2);*/
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				String userCode1 = rs.getString("user_code");
				String followUserCode1 = rs.getString("follow_user_code");
				String followCode1 = rs.getString("follow_code");
				String nicenessCode1 = rs.getString("niceness_code");
				String postCode1 = rs.getString("post_code");
				String nicenessDate1 = rs.getString("niceness_date");
				int likeCount1 = rs.getInt("like_count");
				int postHits1 = rs.getInt("post_hits");
				String completeImage1 = rs.getString("complete_image");
				String recipeName1 = rs.getString("recipe_name");
				String recipeDescription1 = rs.getString("recipe_description");
				
				
				postVO = new FollowLikeRecipeViewVO(userCode1, followUserCode1, followCode1, nicenessCode1,
						postCode1, nicenessDate1, likeCount1, postHits1,
						completeImage1, recipeName1, recipeDescription1);
				followLikeMap.put(cnt+"", postVO);
				cnt++;
			}
		}
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(pstmt != null)
					pstmt.close();
			}
			catch(SQLException se)
			{
				System.out.println(se.getMessage());
			}
		}
		return followLikeMap;
	}
	
	public static void main(String[] args)
	{
		FollowLikeRecipeViewDAO dao = new FollowLikeRecipeViewDAO();
		HashMap<String, FollowLikeRecipeViewVO> map = dao.searchNewsFeedPopularOrder(null);
		for(int i=0; i<map.size(); i++)
		{
			System.out.println(map.get(i+1+"").getNicenessCode());
		}
	}
}
