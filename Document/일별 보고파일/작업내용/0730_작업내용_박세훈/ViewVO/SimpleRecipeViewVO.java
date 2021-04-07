package ViewVO;

import java.io.Serializable;

public class SimpleRecipeViewVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6636281509075991477L;
	private String recipeCode;
	private String postCode;
	private String completeImage;
	private String recipeName;
	private String recipeDescription;
	private int likeCount;
	private int postHits;
	
	public SimpleRecipeViewVO()
	{
		
	}
	public SimpleRecipeViewVO(String recipeCode, String postCode,
			String completeImage, String recipeName, String recipeDescription,
			int likeCount, int postHits) {
		super();
		this.recipeCode = recipeCode;
		this.postCode = postCode;
		this.completeImage = completeImage;
		this.recipeName = recipeName;
		this.recipeDescription = recipeDescription;
		this.likeCount = likeCount;
		this.postHits = postHits;
	}

	public String getRecipeCode() {
		return recipeCode;
	}

	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
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

	public String getRecipeDescription() {
		return recipeDescription;
	}

	public void setRecipeDescription(String recipeDescription) {
		this.recipeDescription = recipeDescription;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getPostHits() {
		return postHits;
	}

	public void setPostHits(int postHits) {
		this.postHits = postHits;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SimpleRecipeViewVO [recipeCode=" + recipeCode + ", postCode="
				+ postCode + ", completeImage=" + completeImage
				+ ", recipeName=" + recipeName + ", recipeDescription="
				+ recipeDescription + ", likeCount=" + likeCount
				+ ", postHits=" + postHits + "]";
	}
}
