package ViewVO;

import java.io.Serializable;

public class FlookRecipeViewVO implements Serializable{

	private static final long serialVersionUID = -1703443416467559943L;
	private String postCode;
	private String recipeCode;
	private String completeImage;
	private String recipeDescription;
	private int poersonNumber;
	private String cookingTime;
	private String cookingLevel;
	private int likeCount;
	private int postHits;
	private String postHashTag;
	
	public FlookRecipeViewVO()
	{
		
	}

	public FlookRecipeViewVO(String postCode, String recipeCode,
			String completeImage, String recipeDescription, int poersonNumber,
			String cookingTime, String cookingLevel, int likeCount,
			int postHits, String postHashTag) {
		super();
		this.postCode = postCode;
		this.recipeCode = recipeCode;
		this.completeImage = completeImage;
		this.recipeDescription = recipeDescription;
		this.poersonNumber = poersonNumber;
		this.cookingTime = cookingTime;
		this.cookingLevel = cookingLevel;
		this.likeCount = likeCount;
		this.postHits = postHits;
		this.postHashTag = postHashTag;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
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

	public String getRecipeDescription() {
		return recipeDescription;
	}

	public void setRecipeDescription(String recipeDescription) {
		this.recipeDescription = recipeDescription;
	}

	public int getPoersonNumber() {
		return poersonNumber;
	}

	public void setPoersonNumber(int poersonNumber) {
		this.poersonNumber = poersonNumber;
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

	public String getPostHashTag() {
		return postHashTag;
	}

	public void setPostHashTag(String postHashTag) {
		this.postHashTag = postHashTag;
	}

	@Override
	public String toString() {
		return "FlookRecipeViewVO [postCode=" + postCode + ", recipeCode="
				+ recipeCode + ", completeImage=" + completeImage
				+ ", recipeDescription=" + recipeDescription
				+ ", poersonNumber=" + poersonNumber + ", cookingTime="
				+ cookingTime + ", cookingLevel=" + cookingLevel
				+ ", likeCount=" + likeCount + ", postHits=" + postHits
				+ ", postHashTag=" + postHashTag + "]";
	}
}
