package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import VO.CartViewVO;

/**
 * ����ڰ� �ٶ󺸴� �������� �ۼ��Ǿ���.
 * ������ ������ �ݿ� �ȵ� Ŭ������.
 * @author GHKwon
 *
 */
public class CartViewDAO {
	private DBConnection dbConnection;

	public CartViewDAO() {
		this(new DBConnection());
	}

	public CartViewDAO(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
	}
	/**
	 * īƮ �ϳ��� �ϳ��� �ĺ��ڵ尡 �����Ƿ� �Ѱ��� CartViewVO�� ������.
	 * @param cartCode īƮ �ĺ��ڵ�
	 * @return īƮ �ĺ��ڵ忡 ���� īƮ��ü
	 */
	public CartViewVO searchCartCode(String cartCode) {
		CartViewVO cartViewVO = new CartViewVO();
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from cart_view where cart_code=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, cartCode);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				cartViewVO =new CartViewVO(res.getString("cart_code"),res.getString("ingredient_code"),res.getString("user_code"),res.getString("recipe_code"),res.getString("recipe_name"),res.getString("ingredient_name"),res.getInt("ingredient_number"),res.getString("ingredient_unit"));
			}
			return cartViewVO;
		} catch ( Exception ex ) {
			ex.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch( Exception ex ) {
				ex.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * ���� �������� ���� ��ᰡ �߰��� �� �ֱ� ������ ��ȯ���� CartViewVO[]�̴�.
	 * @param ingredientCode ����ڵ�.
	 * @return ��ٱ��Ͽ� ���������� ���ԵǾ��ִ� ������ �ڵ�.
	 */
	public CartViewVO[] searchIngredientCode(String ingredientCode) {
		ArrayList<CartViewVO> cartViewVO = new ArrayList<CartViewVO>();
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from cart_view where ingredient_code=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, ingredientCode);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				cartViewVO.add(new CartViewVO(res.getString("cart_code"),res.getString("ingredient_code"),res.getString("user_code"),res.getString("recipe_code"),res.getString("recipe_name"),res.getString("ingredient_name"),res.getInt("ingredient_number"),res.getString("ingredient_unit")));
			}
			return cartViewVO.toArray(new CartViewVO[cartViewVO.size()]);
		} catch ( Exception ex ) {
			ex.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch( Exception ex ) {
				ex.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * ���� �Ѹ��� ���� ��ٱ��ϸ� ������ �����Ƿ�, � ��ٱ��� ǰ����� ������ �ִ��� �˾ƺ��� ���� �޼ҵ�.
	 * @param userCode ȸ�� �ĺ��ڵ�.
	 * @return ȸ���� ������ �ִ� īƮ ������.
	 */
	public CartViewVO[] searchUserCode(String userCode) {
		ArrayList<CartViewVO> cartViewVO = new ArrayList<CartViewVO>();
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from cart_view where user_code=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, userCode);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				cartViewVO.add(new CartViewVO(res.getString("cart_code"),res.getString("ingredient_code"),res.getString("user_code"),res.getString("recipe_code"),res.getString("recipe_name"),res.getString("ingredient_name"),res.getInt("ingredient_number"),res.getString("ingredient_unit")));
			}
			return cartViewVO.toArray(new CartViewVO[cartViewVO.size()]);
		} catch ( Exception ex ) {
			ex.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch( Exception ex ) {
				ex.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * �Ѱ����� �����Ǵ� ���������� ��ٱ��� ǰ����� ���� �� �ִ�.
	 * �׷��Ƿ�, �߰��Ǿ��ִ� �Ѱ��Ƿ����� �ĺ��ڵ带 �̿��Ͽ� ��ٱ��Ͽ�
	 * ������ �ĺ��ڵ忡 �ش��ϴ� ��ٱ��� ��ϵ��� ��ȯ���ش�.
	 * @param recipeCode
	 * @return
	 */
	public CartViewVO[] searchRecipeCode(String recipeCode) {
		ArrayList<CartViewVO> cartViewVO = new ArrayList<CartViewVO>();
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from cart_view where recipe_code=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1, recipeCode);
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				cartViewVO.add(new CartViewVO(res.getString("cart_code"),res.getString("ingredient_code"),res.getString("user_code"),res.getString("recipe_code"),res.getString("recipe_name"),res.getString("ingredient_name"),res.getInt("ingredient_number"),res.getString("ingredient_unit")));
			}
			return cartViewVO.toArray(new CartViewVO[cartViewVO.size()]);
		} catch ( Exception ex ) {
			ex.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch( Exception ex ) {
				ex.printStackTrace();
			}
		}
		return null;		
		
	}


	public static void main(String[]args) {
		CartViewDAO cartViewDAO = new CartViewDAO();
		System.out.println(cartViewDAO.searchCartCode("c1"));
		System.out.println(cartViewDAO.searchUserCode("u1")[0]);
		System.out.println(cartViewDAO.searchRecipeCode("r1")[0]);
		System.out.println(cartViewDAO.searchIngredientCode("i1")[0]);
	}
	
}
