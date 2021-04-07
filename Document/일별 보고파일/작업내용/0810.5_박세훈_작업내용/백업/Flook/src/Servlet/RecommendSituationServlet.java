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
    	 * 일단 현재 원래는 flook으로만해야하는데 유저가 작성한 레시피목록으로 확인해본다.*/
    		//현재내가갖고있는건 나라이름3가지,방법별3가지,재료별3가지
    		HttpSession session=request.getSession();
    		String userCode=(String)session.getAttribute("userCode");
    		System.out.println("RecommendServlet안의"+userCode);
    		//재료별1등 ->5개 이하 바로 go
    		//재료별2등 ->5개초과 검색.
    		//방법별1등&방법별2등 -> 5개이하 바로go
    		//나라별1등&나라별 2등 -> 5개이하 바로go
    		String situationName="일상";
    		
    		String firstIngredient="육류";
    		String secondIngredient="재료별";
    		
    		String firstMethod="끓이기";
    		String secondMethod="기타";
    		//LinkedList<String>recommendIngredient(firstIngredient,secondIngredient);
    		RecommendSituationManager manager=new RecommendSituationManager();
    		LinkedList<SimpleUserRecipeViewVO> situationList=manager.searchSituation(situationName);
    		RecommendationModel recommendationModel=new RecommendationModel();
    		LinkedList<SimpleUserRecipeViewVO> filtering=recommendationModel.filteringIngredient(situationList, firstIngredient, secondIngredient);
    		
    		for(int i=0;i<filtering.size();i++){
    			System.out.println("2step,재료별 후"+filtering.get(i));
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
    			System.out.println("3step,방법별 필터링 후"+filtering.get(i));
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
