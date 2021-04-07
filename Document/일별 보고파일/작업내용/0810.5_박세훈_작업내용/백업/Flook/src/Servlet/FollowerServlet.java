package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Manager.FollowManager;
import ViewVO.FollowerViewWithFollowingOrNotVO;

/**
 * Servlet implementation class FollowServlet
 */
public class FollowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FollowerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*doGet(request, response);*/
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = request.getSession();
		String userCode = (String)session.getAttribute("userCode");
		//System.out.println("�α��� ���� Ȯ�� in servlet:"+userCode);
		
		FollowManager manager = new FollowManager();
		ArrayList<FollowerViewWithFollowingOrNotVO> followerArray = manager.requestFollowerListWithFollowingOrNot(userCode);
		request.setAttribute("followerArray", followerArray);
		RequestDispatcher view = request.getRequestDispatcher("follower.jsp");
		view.forward(request, response);
	}

}
