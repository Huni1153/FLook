package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.RecipeManager;
import Manager.ScrapManager;

/**
 * 
 * @author GHKwon
 *
 */
public class ScrapAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * Scrap 시 Scrap한 게시물을 add해주는 서블릿.
     * 추후 Scrap.do -> ScrapAddServelt으로 분기해주도록 리팩토링.
     * 변경 되야 할 것이 많은 servlet.
     * 구현을 우선시 했음.
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ScrapManager scrapManager = new ScrapManager();
		response.getOutputStream().print(scrapManager.insertScrap((String)request.getSession().getAttribute("userCode"), new RecipeManager().searchPostCodeByRecipeCode(request.getParameter("recipeCode"))));
		
	}

}
