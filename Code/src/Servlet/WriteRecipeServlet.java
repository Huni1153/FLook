package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.RecipeManager;

/**
 * Servlet implementation class WriteRecipeServlet
 */
public class WriteRecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		RecipeManager manager=new RecipeManager();
		
		String recipeName=request.getParameter("recipeName");
		String recipeDescription=request.getParameter("recipeDescription");
		String[] category=request.getParameterValues("category");
		int personNumber=Integer.parseInt(request.getParameter("personNumber"));
		String cookingTime=request.getParameter("cookingTime");
		String cookingLevel=request.getParameter("cookingLevel");
		String hashTags=request.getParameter("hashTags");
		String completeImage=request.getParameter("completeImage");
		System.out.println(personNumber+cookingTime+cookingLevel);
		System.out.println(hashTags);
		System.out.println(completeImage);
	}

}
