package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Manager.NewsFeedManager;
import ViewVO.FollowLikeRecipeViewVO;
import ViewVO.NewsfeedLatestOrderViewVO;

/**
 * Servlet implementation class NewsFeedServlet
 */
public class NewsFeedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsFeedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*doGet(request, response);*/
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = request.getSession();
		
		/*String userCode = (String) session.getAttribute("userCode");*/
		String userCode="code1";

		
		NewsFeedManager newsFeedManager = new NewsFeedManager();
		ArrayList<NewsfeedLatestOrderViewVO> array = newsFeedManager.requestLatestOrder(userCode);
		request.setAttribute("newsfeedLatestArray", array);
		ArrayList<FollowLikeRecipeViewVO> map = newsFeedManager.requestPopularOrder(userCode);
		request.setAttribute("newsfeedPopularArray",map);
		RequestDispatcher view = request.getRequestDispatcher("newspeed.jsp");
		view.forward(request, response);
	}
}
