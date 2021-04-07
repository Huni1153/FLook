package Servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Manager.RecommendSituationManager;
import Model.RecommendationModel;
import ViewVO.SimpleUserRecipeViewVO;

/**
 * Servlet implementation class RecommendSituationServlet
 */
public class RecommendSituationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecommendSituationServlet() {
        // TODO Auto-generated constructor stub
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
    	// TODO Auto-generated method stub
    	/*	LinkedList<SimpleUserRecipeViewVO>searhSituationName(String situationName)
    	 * �ϴ� ���� ������ flook���θ��ؾ��ϴµ� ������ �ۼ��� �����Ǹ������ Ȯ���غ���.*/
    		//���系�������ִ°� �����̸�3����,�����3����,��Ằ3����
    		HttpSession session=request.getSession();
    		String userCode=(String)session.getAttribute("userCode");
    		System.out.println("RecommendServlet����"+userCode);
    		//��Ằ1�� ->5�� ���� �ٷ� go
    		//��Ằ2�� ->5���ʰ� �˻�.
    		//�����1��&�����2�� -> 5������ �ٷ�go
    		//����1��&���� 2�� -> 5������ �ٷ�go
    		String situationName="�ϻ�";
    		
    		String firstIngredient="����";
    		String secondIngredient="��Ằ";
    		
    		String firstMethod="���̱�";
    		String secondMethod="��Ÿ";
    		//LinkedList<String>recommendIngredient(firstIngredient,secondIngredient);
    		RecommendSituationManager manager=new RecommendSituationManager();
    		LinkedList<SimpleUserRecipeViewVO> situationList=manager.searchSituation(situationName);
    		RecommendationModel recommendationModel=new RecommendationModel();
    		LinkedList<SimpleUserRecipeViewVO> filtering=recommendationModel.filteringIngredient(situationList, firstIngredient, secondIngredient);
    		
    		for(int i=0;i<filtering.size();i++){
    			System.out.println("2step,��Ằ ��"+filtering.get(i));
    		}
    		 
    		if(filtering.size()<=6){
    			//situationList.
    			for(int i=0;i<filtering.size();i++){
    				request.setAttribute(i+"Recommend",filtering.get(i));
    			}
    			
    			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
    			
    			rd.forward(request, response);
    			return;
    		}
    		filtering=recommendationModel.filteringMethod(filtering, firstMethod, secondMethod);
    		
    		for(int i=0;i<filtering.size();i++){
    			System.out.println("3step,����� ���͸� ��"+filtering.get(i));
    		}
    		
    		if(filtering.size()<=6){
    			//situationList.
    			for(int i=0;i<filtering.size();i++){
    				request.setAttribute(i+"Recommend",filtering.get(i));
    			}
    			
    			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
    			
    			rd.forward(request, response);
    			return;
    		}
    		
    		
    		
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
