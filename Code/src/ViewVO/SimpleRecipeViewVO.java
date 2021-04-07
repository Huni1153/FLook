package ViewVO;

public class SimpleRecipeViewVO {
	private String recipeCode;
	private String postCode;
	private String completeImage;
	private String recipeName;
	private String recipeDescription;
	private int likeCount;
	private int postHits;
	public SimpleRecipeViewVO() {
	}
	public SimpleRecipeViewVO(String recipeCode, String postCode,
			String completeImage, String recipeName, String recipeDescription,
			int likeCount, int postHits) {
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
	public String getPostCode() {
		return postCode;
	}
	public String getCompleteImage() {
		return completeImage;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public String getrecipeDescription() {
		return recipeDescription;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public int getPostHits() {
		return postHits;
	}
	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public void setCompleteImage(String completeImage) {
		this.completeImage = completeImage;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public void setRecipeDescription(String recipeDescription) {
		this.recipeDescription = recipeDescription;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public void setPostHits(int postHits) {
		this.postHits = postHits;
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
