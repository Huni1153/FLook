package Model;

import java.util.LinkedList;

import ViewVO.SimpleUserRecipeViewVO;

public class RecommendationModel {
	//나중에 Flook레시피로 바꿔야한다.
	LinkedList<SimpleUserRecipeViewVO> countryList;
	LinkedList<SimpleUserRecipeViewVO> situationList;
	LinkedList<SimpleUserRecipeViewVO> methodList;
	LinkedList<SimpleUserRecipeViewVO> kindList;
	LinkedList<SimpleUserRecipeViewVO> ingredientList;
	public RecommendationModel() {
		countryList=new LinkedList<SimpleUserRecipeViewVO>();
		situationList=new LinkedList<SimpleUserRecipeViewVO>();
		methodList=new LinkedList<SimpleUserRecipeViewVO>();
		kindList=new LinkedList<SimpleUserRecipeViewVO>();
		ingredientList=new LinkedList<SimpleUserRecipeViewVO>();
	}
	public RecommendationModel(LinkedList<SimpleUserRecipeViewVO> coutryList,
			LinkedList<SimpleUserRecipeViewVO> situationList,
			LinkedList<SimpleUserRecipeViewVO> methodList,
			LinkedList<SimpleUserRecipeViewVO> kindList,
			LinkedList<SimpleUserRecipeViewVO> ingredientList) {
		this.countryList = coutryList;
		this.situationList = situationList;
		this.methodList = methodList;
		this.kindList = kindList;
		this.ingredientList = ingredientList;
	}
	public String toString() {
		return "RecommendationModel [coutryList=" + countryList
				+ ", situationList=" + situationList + ", methodList="
				+ methodList + ", kindList=" + kindList + ", ingredientList="
				+ ingredientList + "]";
	}
	public LinkedList<SimpleUserRecipeViewVO> filteringIngredient(LinkedList<SimpleUserRecipeViewVO> list,String firstIngredient,String secondIngredient){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getResIngredientCategoryName().equals(firstIngredient)|| list.get(i).getResIngredientCategoryName().equals(secondIngredient)){
				ingredientList.add(new SimpleUserRecipeViewVO(list.get(i).getPostCode(), list.get(i).getRecipeCode(),
						list.get(i).getUserCode(), list.get(i).getUserName(),
						list.get(i).getCompleteImage(), 
						list.get(i).getRecipeName(),
						list.get(i).getRecipeDescription(),
						list.get(i).getLikeCount(),
						list.get(i).getPostHits(),
						list.get(i).getResCountryCategoryName(),
						list.get(i).getResIngredientCategoryName(),
						list.get(i).getResKindCategoryName(),
						list.get(i).getResSituationCategoryName(),
						list.get(i).getResMethodCategoryName()));
			}
		}
		return ingredientList;
	}
	public LinkedList<SimpleUserRecipeViewVO> filteringMethod(LinkedList<SimpleUserRecipeViewVO> list,String firstMethod,String secondMethod){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getResMethodCategoryName().equals(firstMethod)|| list.get(i).getResMethodCategoryName().equals(secondMethod)){
				methodList.add(new SimpleUserRecipeViewVO(list.get(i).getPostCode(), list.get(i).getRecipeCode(),
						list.get(i).getUserCode(), list.get(i).getUserName(),
						list.get(i).getCompleteImage(), 
						list.get(i).getRecipeName(),
						list.get(i).getRecipeDescription(),
						list.get(i).getLikeCount(),
						list.get(i).getPostHits(),
						list.get(i).getResCountryCategoryName(),
						list.get(i).getResIngredientCategoryName(),
						list.get(i).getResKindCategoryName(),
						list.get(i).getResSituationCategoryName(),
						list.get(i).getResMethodCategoryName()));
			}
		}
		return methodList;
	}
	public LinkedList<SimpleUserRecipeViewVO> filteringCountry(LinkedList<SimpleUserRecipeViewVO> list,String firstCountry,String secondCountry){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getResCountryCategoryName().equals(firstCountry)|| list.get(i).getResCountryCategoryName().equals(secondCountry)){
				countryList.add(new SimpleUserRecipeViewVO(list.get(i).getPostCode(), list.get(i).getRecipeCode(),
						list.get(i).getUserCode(), list.get(i).getUserName(),
						list.get(i).getCompleteImage(), 
						list.get(i).getRecipeName(),
						list.get(i).getRecipeDescription(),
						list.get(i).getLikeCount(),
						list.get(i).getPostHits(),
						list.get(i).getResCountryCategoryName(),
						list.get(i).getResIngredientCategoryName(),
						list.get(i).getResKindCategoryName(),
						list.get(i).getResSituationCategoryName(),
						list.get(i).getResMethodCategoryName()));
			}
		}
		return countryList;
	}

	
	public LinkedList<SimpleUserRecipeViewVO> filteringKind(LinkedList<SimpleUserRecipeViewVO> list,String firstKind,String secondKind){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getResKindCategoryName().equals(firstKind)|| list.get(i).getResKindCategoryName().equals(secondKind)){
				countryList.add(new SimpleUserRecipeViewVO(list.get(i).getPostCode(), list.get(i).getRecipeCode(),
						list.get(i).getUserCode(), list.get(i).getUserName(),
						list.get(i).getCompleteImage(), 
						list.get(i).getRecipeName(),
						list.get(i).getRecipeDescription(),
						list.get(i).getLikeCount(),
						list.get(i).getPostHits(),
						list.get(i).getResCountryCategoryName(),
						list.get(i).getResIngredientCategoryName(),
						list.get(i).getResKindCategoryName(),
						list.get(i).getResSituationCategoryName(),
						list.get(i).getResMethodCategoryName()));
			}
		}
		return countryList;
	}


}
