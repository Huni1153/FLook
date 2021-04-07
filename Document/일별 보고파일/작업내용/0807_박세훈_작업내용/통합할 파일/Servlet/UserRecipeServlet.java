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
		/*data check*/
		String method=request.getParameter("method");
		String situation = request.getParameter("situation");
		String nation =request.getParameter("nation");
		String ingredient = request.getParameter("ingredient");
		System.out.println(method+"/"+situation+"/"+nation+"/"+ingredient);/*test*/
		LinkedList<SimpleUserRecipeViewVO> userRecipeList = userRecipeManager.searchUserRecipeList(method,situation,nation,ingredient);
		/*System.out.println(userRecipeList.get(0)+"/이건나와야됨");*/
		StringBuilder strbilder = new StringBuilder();
		/*request.setAttribute("userRecipeList", userRecipeList.toArray(new SimpleUserRecipeViewVO[userRecipeList.size()]));*/
		for(int i=0;i<userRecipeList.size();i++) {
			strbilder.
			append("<div id='menu1' class='tab-pane face'><div class='view view-first'><div src='");
			strbilder.append(new String(userRecipeList.get(i).getCompleteImage().getBytes("UTF-8"),"ISO-8859-1"));
			strbilder.append("'/><div class='mask'><h2>");
			strbilder.append(new String(userRecipeList.get(i).getUserName().getBytes("UTF-8"),"ISO-8859-1"));
			strbilder.append("</h2><p>");
			strbilder.append(new String(userRecipeList.get(i).getRecipeDescription().getBytes("UTF-8"),"ISO-8859-1"));
			strbilder.append("</p><jsp:include page='fork.jsp'></jsp:include></div></div></div>");
		}
		System.out.println(strbilder.toString());
		response.getOutputStream().print(strbilder.toString());
		
		
		/*request.setAttribute("userRecipeList", userRecipeList.toArray(new SimpleUserRecipeViewVO[userRecipeList.size()]));*/
		/*ObjectOutputStream oss = new ObjectOutputStream(response.getOutputStream());
		SimpleUserRecipeViewVO[] surv = new SimpleUserRecipeViewVO[userRecipeList.size()];
		for(int i=0;i<surv.length;i++){
			oss.writeObject(surv[i]);
		}*/
		
		/*request.setAttribute("userRecipeList", userRecipeList.toArray(new SimpleUserRecipeViewVO[userRecipeList.size()]));*/
		
		
	}

}
