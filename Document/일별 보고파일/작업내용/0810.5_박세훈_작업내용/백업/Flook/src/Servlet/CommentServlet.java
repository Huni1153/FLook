package Servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.CommentManager;
import ViewVO.CommentViewVO;

/**
 * Servlet implementation class CommentServlet
 */
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		System.out.println("¿©±â¿È???/");
		CommentManager commentManager = new CommentManager();
		LinkedList<CommentViewVO> commentList = commentManager.searchComment((String)request.getSession().getAttribute("userCode"));
		request.setAttribute("commentList", commentList);
		
		RequestDispatcher rd = request.getRequestDispatcher("commentForm.jsp");
		rd.forward(request, response);
		
	}

}
