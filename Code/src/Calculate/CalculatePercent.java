package Calculate;

import java.util.LinkedList;

import ViewVO.MyCountryPreferenceViewVO;
import ViewVO.MyIngredientPreferenceViewVO;
import ViewVO.MyMethodPreferenceViewVO;

public class CalculatePercent {
	private String percent;
	
	public CalculatePercent(){
		
	}
	public LinkedList<String> calculateCountryPercent(LinkedList<MyCountryPreferenceViewVO> countryList)
	{
		int totalScore=0;
		LinkedList<String> stringArr=new LinkedList<String>();
		for(int i=0;i<countryList.size();i++){
			totalScore+=countryList.get(i).getScoreTotal();
		}
		//int percent=0;
		for(int i=0;i<countryList.size();i++){
			stringArr.add(totalScore/countryList.get(i).getScoreTotal()+"%");
		}
		return stringArr;

	}
	public LinkedList<String> calculateIngredientPercent(LinkedList<MyIngredientPreferenceViewVO> ingredientList)
	{
		int totalScore=0;
		LinkedList<String> stringArr=new LinkedList<String>();
		for(int i=0;i<ingredientList.size();i++){
			totalScore+=ingredientList.get(i).getScoreTotal();
		}
		//int percent=0;
		for(int i=0;i<ingredientList.size();i++){
			stringArr.add(totalScore/ingredientList.get(i).getScoreTotal()+"%");
		}
		return stringArr;

	}
	public LinkedList<String> calculateMethodPercent(LinkedList<MyMethodPreferenceViewVO> methodList)
	{
		int totalScore=0;
		LinkedList<String> stringArr=new LinkedList<String>();
		for(int i=0;i<methodList.size();i++){
			totalScore+=methodList.get(i).getScoreTotal();
		}
		//int percent=0;
		for(int i=0;i<methodList.size();i++){
			stringArr.add(totalScore/methodList.get(i).getScoreTotal()+"%");
		}
		return stringArr;

	}
	public static void main(String args[]){
		
	}

}
