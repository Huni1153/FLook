package Servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.FlookRecipeManager;
import ViewVO.SimpleRecipeViewVO;

/**
 * Servlet implementation class FlookRecipe
 */
public class FlookRecipe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html); charset=utf-8");
		request.setCharacterEncoding("utf-8");
		FlookRecipeManager flookRecipeManager = new FlookRecipeManager();
		LinkedList<SimpleRecipeViewVO> frecipeList=flookRecipeManager.searchFlookRecipeList(request.getParameter("method"),request.getParameter("situation"),request.getParameter("nation"),request.getParameter("ingredient"));
		StringBuilder strbilder = new StringBuilder();
		for(int i=0;i<frecipeList.size();i++) {
			strbilder.
			append("<div id='menu+i+' class='tab-pane fade in active'><div class='view view-first'><img src='");
			strbilder.append(new String(frecipeList.get(i).getCompleteImage().getBytes("UTF-8"),"ISO-8859-1"));
			strbilder.append("'/><div class='mask'><h2>");
			strbilder.append(new String(frecipeList.get(i).getRecipeName().getBytes("UTF-8"),"ISO-8859-1"));
			strbilder.append("</h2><p>");
			strbilder.append(new String(frecipeList.get(i).getRecipeDescription().getBytes("UTF-8"),"ISO-8859-1"));
			strbilder.append("</p><jsp:include page='fork.jsp'></jsp:include></div></div></div>");
		}		
	}
}
