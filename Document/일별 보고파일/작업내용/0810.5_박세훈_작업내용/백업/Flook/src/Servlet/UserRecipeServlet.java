package Servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.UserRecipeManager;
import ViewVO.SimpleUserRecipeViewVO;

/**
 * Servlet implementation class UserRecipeServlet
 */
public class UserRecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		UserRecipeManager userRecipeManager = new UserRecipeManager();
	
		
		System.out.println(request.getParameter("method")+"/"+request.getParameter("situation")+"/"+request.getParameter("nation")+"/"+request.getParameter("ingredient"));
		LinkedList<SimpleUserRecipeViewVO> userRecipeList = userRecipeManager.searchUserRecipeList(request.getParameter("method"),request.getParameter("situation"),request.getParameter("nation"),request.getParameter("ingredient"));
		StringBuilder strbilder = new StringBuilder();
		for(int i=0;i<userRecipeList.size();i++) {
			strbilder.
			append("<div id='menu1' class='tab-pane face'><div class='view view-first'><div src='");
			strbilder.append(new String(userRecipeList.get(i).getCompleteImage().getBytes("UTF-8"),"ISO-8859-1"));
			strbilder.append("'/><div class='mask'><h2><a href='javascript:detailSee("+userRecipeList.get(i).getRecipeCode()+")");
			strbilder.append(new String(userRecipeList.get(i).getUserName().getBytes("UTF-8"),"ISO-8859-1"));
			strbilder.append("</a></h2><p>");
			strbilder.append(new String(userRecipeList.get(i).getRecipeDescription().getBytes("UTF-8"),"ISO-8859-1"));
			strbilder.append("</p><jsp:include page='fork.jsp'></jsp:include></div></div></div>");
		}
		System.out.println(strbilder.toString());
		response.getOutputStream().print(strbilder.toString());
		
		

		
		
	}

}