package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.JoinManager;
import Manager.LoginManager;

/**
 * Servlet implementation class JoinServlet
 */
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("join_name_name");
		String userEmail = request.getParameter("join_email_name");
		String userPassword= request.getParameter("join_password_name");
		String userGender= request.getParameter("sex");
		String userBirthday= request.getParameter("join_birthday_year")+"/"+request.getParameter("join_birthday_month")+"/"+request.getParameter("join_birthday_day");
		LoginManager loginManager = new LoginManager();/*기호 0805추가*/
		if(new LoginManager().registerCheck(userEmail)==null) {
			JoinManager joinManager =new JoinManager();
			joinManager.joinMember(userName, "", userEmail, userPassword, userGender, userBirthday);			
			response.sendRedirect("Login.html");
		} else {
			/*request.setAttribute("userName",userName);
			request.setAttribute("userPassword",userPassword);
			request.setAttribute("userPassword",userPassword);*/
			
			RequestDispatcher rd = request.getRequestDispatcher("join.jsp");
			rd.forward(request, response);
		}
		
	}

}
