package Servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.SearchManager;
import VO.UserVO;
import ViewVO.SimpleRecipeViewVO;
import ViewVO.SimpleUserRecipeViewVO;

/**
 * Servlet implementation class SearchingServlet
 */
public class SearchingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String keyword = request.getParameter("search_input_keyword");/*이 이름은 추후에 변경됨.*/
		/*System.out.println(keyword);*/
		SearchManager searchManager = new SearchManager();
		LinkedList<SimpleRecipeViewVO> simpleRecipeViewVOByName = searchManager.searchFlookRecipeListByRecipeName(keyword);
		/*System.out.println(searchManager.searchFlookRecipeListByRecipeName(keyword).get(0));*/
		LinkedList<SimpleRecipeViewVO> simpleRecipeViewVOByHashTag = searchManager.searchFlookRecipeListByHashTag(keyword);
		LinkedList<SimpleUserRecipeViewVO> simpleUserRecipeViewVOByName = searchManager.searchUserRecipeListByRecipeName(keyword);
		LinkedList<SimpleUserRecipeViewVO> simpleUserRecipeViewVOByHashTag = searchManager.searchUserRecipeListByHashTag(keyword);
		LinkedList<UserVO> userVOList = searchManager.searchUserListByUserName(keyword);
		/*치햄이 배열로 넘겨서 넘긴다고 함.*/
		request.setAttribute("simpleRecipeByName", simpleRecipeViewVOByName.toArray(new SimpleRecipeViewVO[simpleRecipeViewVOByName.size()]));
		request.setAttribute("simpleRecipeByHashTag",simpleRecipeViewVOByHashTag.toArray(new SimpleRecipeViewVO[simpleRecipeViewVOByHashTag.size()]));
		request.setAttribute("simpleUserRecipeByName", simpleUserRecipeViewVOByName.toArray(new SimpleUserRecipeViewVO[simpleUserRecipeViewVOByName.size()]));
		request.setAttribute("simpleUserRecipeByHashTag",simpleUserRecipeViewVOByHashTag.toArray(new SimpleUserRecipeViewVO[simpleUserRecipeViewVOByHashTag.size()]));
		request.setAttribute("UserList",userVOList.toArray(new UserVO[userVOList.size()]));
		
		/*String[] searchResult = new String[]{"전체보기","레시피명","사용자명","해시태그"};
		request.setAttribute("searchResultMenu",searchResult);*/
		
		RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
		rd.forward(request, response);
	}

}
