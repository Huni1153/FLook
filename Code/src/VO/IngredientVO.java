package VO;

import java.io.Serializable;

public class IngredientVO implements Serializable{
	private String ingredientCode;
	private String recipeCode;
	private String ingredientName;
	private int ingredientAmount;
	private String ingredientUnit;
	private String ingredientType;
	private String ingredientUnitCode;
	public IngredientVO() { 
	}
	public IngredientVO(String ingredientCode, String recipeCode,
			String ingredientName, int ingredientAmount, String ingredientUnit,
			String ingredientType, String ingredientUnitCode) { 
		this.ingredientCode = ingredientCode;
		this.recipeCode = recipeCode;
		this.ingredientName = ingredientName;
		this.ingredientAmount = ingredientAmount;
		this.ingredientUnit = ingredientUnit;
		this.ingredientType = ingredientType;
		this.ingredientUnitCode = ingredientUnitCode;
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
	public int getIngredientAmount() {
		return ingredientAmount;
	}
	public void setIngredientAmount(int ingredientAmount) {
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
	public String getIngredientUnitCode() {
		return ingredientUnitCode;
	}
	public void setIngredientUnitCode(String ingredientUnitCode) {
		this.ingredientUnitCode = ingredientUnitCode;
	}
	
}
