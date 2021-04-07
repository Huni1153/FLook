package Servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Manager.CartManager;
import VO.CartViewVO;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		LinkedList<CartViewVO> cartViewVOList = new CartManager().searchUserCode((String)session.getAttribute("userCode"));
		CartViewVO[] cartList = cartViewVOList.toArray(new CartViewVO[cartViewVOList.size()]);
		request.setAttribute("cartList", cartList);
		for(int i=0;i<cartList.length;i++) {
			System.out.println(cartList[i]);
		}
		/*String[] url = request.getHeader("referer").split("/");
		RequestDispatcher rd =null;
		if(url[url.length-1]!="http://localhost:8089/Login.html") {
			 rd = request.getRequestDispatcher(url[url.length-1]);
		} else {
			 rd = request.getRequestDispatcher("main.jsp");
		}
		rd.forward(request, response);*/
		
	}

}
