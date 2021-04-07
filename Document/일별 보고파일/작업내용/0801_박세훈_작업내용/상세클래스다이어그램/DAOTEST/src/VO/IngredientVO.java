package VO;

import java.io.Serializable;

public class IngredientVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 394170279591866306L;
	private String ingredientCode;
	private String recipeCode;
	private String ingredientName;
	private String ingredientAmount;
	private String ingredientUnit;
	private String ingredientType;
	public IngredientVO() {
		// TODO Auto-generated constructor stub
	}
	public IngredientVO(String ingredientCode, String recipeCode,
			String ingredientName, String ingredientAmount,
			String ingredientUnit, String ingredientType) {
		this.ingredientCode = ingredientCode;
		this.recipeCode = recipeCode;
		this.ingredientName = ingredientName;
		this.ingredientAmount = ingredientAmount;
		this.ingredientUnit = ingredientUnit;
		this.ingredientType = ingredientType;
	}
	public String getIngredientCode() {
		return ingredientCode;
	}
	public void setIngredientCode(String ingredientCode) {
		this.ingredientCode = ingredientCode;
	}
	public String getRecipeCode() {
		return recipeCode;
	}
	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public String getIngredientAmount() {
		return ingredientAmount;
	}
	public void setIngredientAmount(String ingredientAmount) {
		this.ingredientAmount = ingredientAmount;
	}
	public String getIngredientUnit() {
		return ingredientUnit;
	}
	public void setIngredientUnit(String ingredientUnit) {
		this.ingredientUnit = ingredientUnit;
	}
	public String getIngredientType() {
		return ingredientType;
	}
	public void setIngredientType(String ingredientType) {
		this.ingredientType = ingredientType;
	}
	@Override
	public String toString() {
		return "IngredientVO [ingredientCode=" + ingredientCode
				+ ", recipeCode=" + recipeCode + ", ingredientName="
				+ ingredientName + ", ingredientAmount=" + ingredientAmount
				+ ", ingredientUnit=" + ingredientUnit + ", ingredientType="
				+ ingredientType + "]";
	}
	
	
	

}
