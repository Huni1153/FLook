package Servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
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
		FlookRecipeManager flookRecipe=new FlookRecipeManager();
		/*LinkedList<SimpleRecipeViewVO> list;
		list=flookRecipe.requestSimpleRecipeList();
		SimpleRecipeViewVO res;
		Iterator<SimpleRecipeViewVO> iterator = list.iterator();
		while (iterator.hasNext()) {
			res = iterator.next();
			System.out.println(res.toString());
		}*/
		LinkedList<SimpleRecipeViewVO> list = flookRecipe.requestSimpleRecipeList();
		SimpleRecipeViewVO[] simpleRecipeViewVO = list.toArray(new SimpleRecipeViewVO[list.size()]);
		System.out.println(list.size());
		request.setAttribute("simpleRecipeViewList",simpleRecipeViewVO);
		RequestDispatcher rd = request.getRequestDispatcher("FlookRecipe.jsp");
		rd.forward(request, response);
	}

}
