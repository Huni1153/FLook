package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import VO.CartViewVO;

/**
 * 사용자가 바라보는 기준으로 작성되었음.
 * 관리자 기준은 반영 안된 클래스임.
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
	 * 카트 하나당 하나의 식별코드가 있으므로 한개의 CartViewVO를 리턴함.
	 * @param cartCode 카트 식별코드
	 * @return 카트 식별코드에 대한 카트객체
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
	 * 여러 레시피의 같은 재료가 추가될 수 있기 때문에 반환값은 CartViewVO[]이다.
	 * @param ingredientCode 재료코드.
	 * @return 장바구니에 공통적으로 포함되어있는 재료들의 코드.
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
	 * 유저 한명은 여러 장바구니를 가지고 있으므로, 어떤 장바구니 품목들을 가지고 있는지 알아보기 위한 메소드.
	 * @param userCode 회원 식별코드.
	 * @return 회원이 가지고 있는 카트 정보들.
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
	 * 한가지의 레시피는 여러가지의 장바구니 품목들을 가질 수 있다.
	 * 그러므로, 추가되어있는 한개의레시피 식별코드를 이용하여 장바구니에
	 * 레시피 식별코드에 해당하는 장바구니 목록들을 반환해준다.
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
