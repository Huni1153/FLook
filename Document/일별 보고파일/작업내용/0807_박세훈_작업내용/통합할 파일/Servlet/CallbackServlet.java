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
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook"); // facebook �ν��Ͻ��� ��������
        String oauthCode = request.getParameter("code");
 // GET �޼ҵ��� code�� �Ѿ�� �����ڵ带 �ޱ���
        try {
            facebook.getOAuthAccessToken(oauthCode);
            System.out.println(oauthCode);
 // �� �����ڵ带 �̿��� Access Token�� �����ϴ�.
        } catch (FacebookException e) {
            response.getWriter().print(e);
            return;
            //throw new ServletException(e);
        }
        response.sendRedirect(request.getContextPath() + "/Login.html");
 // ó���� ������ ������ �������� �����̷�Ʈ!
    }
	

}
