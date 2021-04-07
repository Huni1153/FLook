package VO;

public class RecipeVO {

	private String recipeCode;
	private String completedImage;
	private String recipeName;
	private String recipeCaption;
	private int personNumber;
	private String cookingTime;
	private String recipeLevel;
	
	public RecipeVO()
	{
		
	}

	public RecipeVO(String recipeCode, String completedImage,
			String recipeName, String recipeCaption, int personNumber,
			String cookingTime, String recipeLevel) {
		super();
		this.recipeCode = recipeCode;
		this.completedImage = completedImage;
		this.recipeName = recipeName;
		this.recipeCaption = recipeCaption;
		this.personNumber = personNumber;
		this.cookingTime = cookingTime;
		this.recipeLevel = recipeLevel;
	}

	public String getRecipeCode() {
		return recipeCode;
	}

	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
	}

	public String getCompletedImage() {
		return completedImage;
	}

	public void setCompletedImage(String completedImage) {
		this.completedImage = completedImage;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeCaption() {
		return recipeCaption;
	}

	public void setRecipeCaption(String recipeCaption) {
		this.recipeCaption = recipeCaption;
	}

	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

	public String getCookingTime() {
		return cookingTime;
	}

	public void setCookingTime(String cookingTime) {
		this.cookingTime = cookingTime;
	}

	public String getRecipeLevel() {
		return recipeLevel;
	}

	public void setRecipeLevel(String recipeLevel) {
		this.recipeLevel = recipeLevel;
	}

	@Override
	public String toString() {
		return "RecipeVO [recipeCode=" + recipeCode + ", completedImage="
				+ completedImage + ", recipeName=" + recipeName
				+ ", recipeCaption=" + recipeCaption + ", personNumber="
				+ personNumber + ", cookingTime=" + cookingTime
				+ ", recipeLevel=" + recipeLevel + "]";
	}
	
}
