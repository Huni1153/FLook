package Servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.RecommendTodayManager;
import ViewVO.SimpleUserRecipeViewVO;

/**
 * Servlet implementation class RecommendTodayServlet
 */
public class RecommendTodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RecommendTodayManager recommendTodayManager = new RecommendTodayManager();
		LinkedList<String> stringList=recommendTodayManager.searchUserRecipeList("15/08/09");
		LinkedList<SimpleUserRecipeViewVO> simpleUserList = new LinkedList<SimpleUserRecipeViewVO>();
		for(int i=0;i<stringList.size();i++){
			System.out.println(stringList.get(i));
		}
		
		for(int i=0;i<stringList.size();i++){
			simpleUserList.add(recommendTodayManager.searchPostCodeRecipeList(stringList.get(i)));
		}
		
		for(int i=0;i<stringList.size();i++){
			System.out.println(simpleUserList.get(i));
		}
	}
	

}
