package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facebook4j.Facebook;
import facebook4j.FacebookException;

/**
 * Servlet implementation class CallbackServlet
 */
public class CallbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook"); // facebook 인스턴스를 가져오고
        String oauthCode = request.getParameter("code");
 // GET 메소드의 code로 넘어온 인증코드를 받구요
        try {
            facebook.getOAuthAccessToken(oauthCode);
            System.out.println(oauthCode);
 // 이 인증코드를 이용해 Access Token을 얻어냅니다.
        } catch (FacebookException e) {
            response.getWriter().print(e);
            return;
            //throw new ServletException(e);
        }
        response.sendRedirect(request.getContextPath() + "/Login.html");
 // 처리가 끝나면 적절한 페이지로 리다이렉트!
    }
	

}
