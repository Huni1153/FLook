package Manager;

import java.util.LinkedList;

import DAO.UserDAO;
import VO.UserVO;
import ViewDAO.SimpleRecipeViewDAO;
import ViewDAO.SimpleUserRecipeViewDAO;
import ViewVO.SimpleRecipeViewVO;
import ViewVO.SimpleUserRecipeViewVO;

public class SearchManager {
	private SimpleRecipeViewDAO simpleRecipeViewDAO;
	private SimpleUserRecipeViewDAO simpleUserRecipeViewDAO;
	private UserDAO userDAO;
	public SearchManager() {
		simpleRecipeViewDAO = SimpleRecipeViewDAO.getInstance();
		simpleUserRecipeViewDAO = SimpleUserRecipeViewDAO.getInstance();
		userDAO = UserDAO.getInstance();
	}
	public LinkedList<SimpleRecipeViewVO> searchFlookRecipeListByRecipeName(String keyword) {
		return simpleRecipeViewDAO.searchFlookRecipeListByRecipeName(keyword);
	}
	public LinkedList<SimpleRecipeViewVO> searchFlookRecipeListByHashTag(String keyword) {
		return simpleRecipeViewDAO.searchFlookRecipeListByHashTag(keyword);
	}
	public LinkedList<SimpleUserRecipeViewVO> searchUserRecipeListByRecipeName(String keyword) {
		return simpleUserRecipeViewDAO.searchUserRecipeListByRecipeName(keyword);
	}
	public LinkedList<SimpleUserRecipeViewVO> searchUserRecipeListByHashTag(String keyword) {
		return simpleUserRecipeViewDAO.searchUserRecipeListByHashTag(keyword);
	}
	public LinkedList<UserVO> searchUserListByUserName(String keyword) {
		return userDAO.searchUserListByUserName(keyword);
	}
	public static void main(String []args) {
		System.out.println(new SearchManager().searchFlookRecipeListByRecipeName("±èÄ¡").get(0));
	}
}

