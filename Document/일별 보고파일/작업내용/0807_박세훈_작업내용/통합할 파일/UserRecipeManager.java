package Manager;

import java.util.LinkedList;

import DAO.SimpleUserRecipeViewDAO;
import ViewVO.SimpleUserRecipeViewVO;

public class UserRecipeManager {
	private SimpleUserRecipeViewDAO simpleUserRecipeViewDAO;
	public UserRecipeManager() {
		simpleUserRecipeViewDAO = SimpleUserRecipeViewDAO.getInstance();
	}
	public LinkedList<SimpleUserRecipeViewVO> searchUserRecipeList(String method,String situation,String nation,String ingredient) {
		return simpleUserRecipeViewDAO.searchUserRecipeList(method,situation,nation,ingredient);
	}
	/*public UserRecipeManager() {
		simpleUserRecipeViewDAO = SimpleUserRecipeViewDAO.getInstance();
	}
	public LinkedList<SimpleUserRecipeViewVO> requestSimpleUserRecipeList(String userCode) {
		return simpleUserRecipeViewDAO.requestSimpleUserRecipeList(userCode);
	}*/
}
