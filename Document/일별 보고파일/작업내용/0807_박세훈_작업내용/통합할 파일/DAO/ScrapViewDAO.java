package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import VO.ScrapViewVO;


public class ScrapViewDAO {
	private DBConnection dbConnection;

	
	public ScrapViewDAO() {
		/*this(new DBConnection());*/
	}
	public ScrapViewDAO(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
	}
	public ScrapViewVO searchScrap(String scrapCode) {
		PreparedStatement pstmt = null;
		ScrapViewVO scrapViewVO=null;
		try {
			String sql="select * from scrap_view where scrap_code=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, scrapCode);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				scrapViewVO = new ScrapViewVO(res.getString("scrap_code"),res.getString("post_code"),res.getString("recipe_code"),res.getString("user_code"),res.getString("user_name"),res.getString("user_email"),res.getString("complete_image"),res.getString("recipe_name"),res.getString("recipe_description"),res.getInt("like_count"),res.getInt("post_hits"));
			}
			return scrapViewVO;
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch( Exception ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}
	public static void main(String[] args) {
		ScrapViewDAO dao = new ScrapViewDAO();
		System.out.println(dao.searchScrap("s1"));
	}
	
}
