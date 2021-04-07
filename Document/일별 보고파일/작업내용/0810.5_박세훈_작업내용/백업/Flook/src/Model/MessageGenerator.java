package Model;

import java.util.GregorianCalendar;

import ViewVO.MyCountryPreferenceViewVO;
import ViewVO.MyIngredientPreferenceViewVO;
import ViewVO.MyMethodPreferenceViewVO;

public class MessageGenerator {
	private String message;

	public MessageGenerator() {
		// TODO Auto-generated constructor stub
	}

	public MessageGenerator(String message) {
		this.message = message;
	}
	public String methodMessage(MyMethodPreferenceViewVO[] methodVOs){
		String methodName=null;
		int tempScore=0;
		for(int i=0;i<methodVOs.length;i++){
			if(tempScore<methodVOs[i].getScoreTotal()){
				tempScore=methodVOs[i].getScoreTotal();
				methodName=methodVOs[i].getMethodCategoryName();
			}
			
		}
		if(methodName.equals("튀김")){
			 message="너무 튀김요리만 좋아하시는거아니에요??";
		}
		else{
			 message="당신은 "+methodName+"매니아!!!!";
		}
		return message;
	}
	public String ingredientMessage(MyIngredientPreferenceViewVO[] ingredientVOs){
		String ingredientName=null;
		int tempScore=0;
		for(int i=0;i<ingredientVOs.length;i++){
			if(tempScore<ingredientVOs[i].getScoreTotal()){
				tempScore=ingredientVOs[i].getScoreTotal();
				ingredientName=ingredientVOs[i].getIngredientCategoryName();
			}
			
		}
		if(ingredientName.equals("채소류")){
			 message="당신은 흔치않은 채식음식매니아! '채소파'";
		}
		else if(ingredientName.equals("육류")) {
			 message="역시 고기가 최고죠?! 당신은 '고기파'";
		}
		else if(ingredientName.equals("해물류")) {
			 message="당신은 해물을 좋아하시네요! 당신은 '해물파'";
		}
		else if(ingredientName.equals("콩/견과류")) {
			 message="당신은 콩/견과류을 좋아하시네요! 당신은 '콩/견류파'";
		}
		else if(ingredientName.equals("곡류")) {
			 message="당신은 곡류을 좋아하시네요! 당신은 '곡류파'";
		}
		else{
			message="당신은 누구야?";
		}
		
		return message;
		
		
	}
	public String countryMessage(MyCountryPreferenceViewVO[] countryVOs){
		String countryName=null;
		int tempScore=0;
		for(int i=0;i<countryVOs.length;i++){
			if(tempScore<countryVOs[i].getScoreTotal()){
				tempScore=countryVOs[i].getScoreTotal();
				countryName=countryVOs[i].getCountryCategoryName();
			}
			
		}
		if(countryName.equals("한식")){
			 message="먹거리중에는 한국음식이 최고죠!";
		}
		else if(countryName.equals("양식")) {
			 message="저도 양식음식좋아합니다!!";
		}
		else if(countryName.equals("일식")) {
			 message="저도 일본음식좋아합니다!!";
		}
		else if(countryName.equals("중식")) {
			 message="저도 중식음식좋아합니다!!";
		}
		else{
			message="당신은 무슨나라좋아해?";
		}
		
		return message;
		
	}
	public static void main(String args[]){
		GregorianCalendar obj = new GregorianCalendar();
	      String date = Integer.toString(obj.getWeekYear())+(GregorianCalendar.DAY_OF_WEEK+1)+GregorianCalendar.DATE;
	      System.out.println(date);
	}
	

}
