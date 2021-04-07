package ViewDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;

import Connection.DBConnection;
import ViewVO.SimpleRecipeViewVO;

public class SimpleFlookRecipeViewDAO {

	final static SimpleFlookRecipeViewDAO obj;
	private DBConnection conn;
	static {
		obj = new SimpleFlookRecipeViewDAO();
	}

	private SimpleFlookRecipeViewDAO() {
		conn = DBConnection.getInstance();
	}

	public static SimpleFlookRecipeViewDAO getInstance() {
		return obj;
	}

	public LinkedList<SimpleRecipeViewVO> selectSimpleRecipe() {
		PreparedStatement pstmt = null;
		LinkedList<SimpleRecipeViewVO> list = null;
		try {
			String sql = "select * from simple_recipe_view";
			pstmt = this.conn.getConn().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			list = new LinkedList<SimpleRecipeViewVO>();
			while (rs.next()) {
				list.add(new SimpleRecipeViewVO(rs
						.getString("recipe_code"), rs
						.getString("post_code"), rs.getString("complete_image"),rs
						.getString("recipe_name"), rs
						.getString("recipe_description"), rs
						.getInt("like_count"), rs.getInt("post_hits"),rs
						.getString("country_category_name"), rs
						.getString("ingredient_category_name"), rs
						.getString("kind_category_name"), rs
						.getString("situation_category_name"), rs
						.getString("method_category_name")));
			}
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
		return list;
	}

}
