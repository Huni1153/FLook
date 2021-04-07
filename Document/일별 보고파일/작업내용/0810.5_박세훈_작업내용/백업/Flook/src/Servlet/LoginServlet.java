package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Manager.LoginManager;
import VO.UserVO;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("utf-8");
		LoginManager loginManager = new LoginManager();
		UserVO userVO = loginManager.login(request.getParameter("Login_email_name"), request.getParameter("Login_input_password"));
		
		try {
			HttpSession session = request.getSession();
			session.setAttribute("userCode", userVO.getUserCode());
			session.setAttribute("userEmail",userVO.getUserEmail());
			session.setAttribute("userName",userVO.getUserName());
			session.setAttribute("userImage", userVO.getUserImage());
			request.setAttribute("loginOk", "success");
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		} catch(Exception ex) {
			request.setAttribute("loginError", "fail");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}
}
