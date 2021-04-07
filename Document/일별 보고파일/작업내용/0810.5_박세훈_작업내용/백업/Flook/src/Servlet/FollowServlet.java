package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Manager.FollowManager;

/**
 * Servlet implementation class FollowServlet
 */
public class FollowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FollowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = request.getSession();
		String userCode = (String)session.getAttribute("userCode");
		
		String[] followCodes = request.getQueryString().split("=");
		String[] followCodes2 = request.getQueryString().split(":");
		
		//System.out.println("followCodes2 : "+followCodes2[0]+","+followCodes2[1]);
		
		//System.out.println("followCode : "+followCodes[1]);
		FollowManager manager = new FollowManager();
		
		
		if(followCodes2[1].equals("follow"))
		{
			//System.out.println("ª¿‘");
			//System.out.println(followCodes2[0].split("=")[1]);
			manager.insertFollow(followCodes2[0].split("=")[1], userCode);
		}
		else if(followCodes2[1].equals("following"))
		{
			//System.out.println("ªË¡¶");
			//System.out.println(followCodes2[0].split("=")[1]);
			manager.deleteFollowByFollowCode(followCodes2[0].split("=")[1]);
		}
		
		//FollowManager manager = new FollowManager();
		//manager.deleteFollowByFollowCode(followCodes[1]);
		
		//RequestDispatcher view = request.getRequestDispatcher("FollowingList");
		//view.forward(request, response);
		
		//System.out.println("URL:"+request.getQueryString());
		String query = (request.getQueryString().split("="))[0];
		
		if(query.equals("followerCode"))
			response.sendRedirect("/Flook/FollowerList");
		else if(query.equals("followCode"))
			response.sendRedirect("/Flook/FollowingList");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
