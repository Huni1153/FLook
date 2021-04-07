package Manager;

import java.util.LinkedList;

import DAO.CartViewDAO;
import VO.CartViewVO;

public class CartManager {
	private CartViewDAO cartViewDAO;
	public CartManager(){
		cartViewDAO = CartViewDAO.getInstance();
	}
	public LinkedList<CartViewVO> searchUserCode(String userCode) {
		return cartViewDAO.searchUserCode(userCode);
	}
}
