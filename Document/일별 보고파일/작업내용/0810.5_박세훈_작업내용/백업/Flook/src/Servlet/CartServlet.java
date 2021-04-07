package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Manager.CartManager;
import ViewVO.CartViewVO;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String cartKindOf = request.getParameter("cartKindOf");
		if(cartKindOf.equals("readOnly")) {/*네비바 상단 버튼 클릭 시.*/
			ArrayList<CartViewVO> cartList = new CartManager().searchUserCode((String)request.getSession().getAttribute("userCode"));
			System.out.println((String)request.getSession().getAttribute("userCode"));
			request.setAttribute("cartList", cartList.toArray(new CartViewVO[cartList.size()]));
			request.getRequestDispatcher("cartFactory.jsp").forward(request,response);
		} else if ( cartKindOf.equals("addCart")) { /*추가시*/
			
			String gg[] = request.getParameterValues("recipe_ingredientM");
			for(int i=0;i<gg.length;i++){
				System.out.println(gg[i]);
			}
				
			
		} else if ( cartKindOf.equals("deleteCart")) { /*삭제시*/
			
		}
	}

}
