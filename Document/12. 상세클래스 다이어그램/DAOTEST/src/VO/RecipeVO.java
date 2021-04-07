package VO;

import java.io.Serializable;

public class RecipeVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7072719046829948668L;
	private String recipeCode;
	private String completeImage;
	private String recipeName;
	private String description;
	private String personNumber;
	private String cookingTime;
	private String cookingLevel;
	public RecipeVO() {
		// TODO Auto-generated constructor stub
	}
	public RecipeVO(String recipeCode, String completeImage, String recipeName,
			String description, String personNumber, String cookingTime,
			String cookingLevel) {
		this.recipeCode = recipeCode;
		this.completeImage = completeImage;
		this.recipeName = recipeName;
		this.description = description;
		this.personNumber = personNumber;
		this.cookingTime = cookingTime;
		this.cookingLevel = cookingLevel;
	}
	public String getRecipeCode() {
		return recipeCode;
	}
	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
	}
	public String getCompleteImage() {
		return completeImage;
	}
	public void setCompleteImage(String completeImage) {
		this.completeImage = completeImage;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}
	public String getCookingTime() {
		return cookingTime;
	}
	public void setCookingTime(String cookingTime) {
		this.cookingTime = cookingTime;
	}
	public String getCookingLevel() {
		return cookingLevel;
	}
	public void setCookingLevel(String cookingLevel) {
		this.cookingLevel = cookingLevel;
	}
	@Override
	public String toString() {
		return "RecipeVO [recipeCode=" + recipeCode + ", completeImage="
				+ completeImage + ", recipeName=" + recipeName
				+ ", description=" + description + ", personNumber="
				+ personNumber + ", cookingTime=" + cookingTime
				+ ", cookingLevel=" + cookingLevel + "]";
	}
	

}
