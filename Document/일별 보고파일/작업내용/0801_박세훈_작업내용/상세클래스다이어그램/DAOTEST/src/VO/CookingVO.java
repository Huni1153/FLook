package VO;

import java.io.Serializable;

public class CookingVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5774823462867291938L;
	private String cookingCode;
	private String recipeCode;
	private String cookingSequence;
	private String cookingImage;
	private String cookingCaption;
	public CookingVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CookingVO(String cookingCode, String recipeCode,
			String cookingSequence, String cookingImage, String cookingCaption) {
		super();
		this.cookingCode = cookingCode;
		this.recipeCode = recipeCode;
		this.cookingSequence = cookingSequence;
		this.cookingImage = cookingImage;
		this.cookingCaption = cookingCaption;
	}
	public String getCookingCode() {
		return cookingCode;
	}
	public void setCookingCode(String cookingCode) {
		this.cookingCode = cookingCode;
	}
	public String getRecipeCode() {
		return recipeCode;
	}
	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
	}
	public String getCookingSequence() {
		return cookingSequence;
	}
	public void setCookingSequence(String cookingSequence) {
		this.cookingSequence = cookingSequence;
	}
	public String getCookingImage() {
		return cookingImage;
	}
	public void setCookingImage(String cookingImage) {
		this.cookingImage = cookingImage;
	}
	public String getCookingCaption() {
		return cookingCaption;
	}
	public void setCookingCaption(String cookingCaption) {
		this.cookingCaption = cookingCaption;
	}
	@Override
	public String toString() {
		return "CookingVO [cookingCode=" + cookingCode + ", recipeCode="
				+ recipeCode + ", cookingSequence=" + cookingSequence
				+ ", cookingImage=" + cookingImage + ", cookingCaption="
				+ cookingCaption + "]";
	}
	
	

}
