package VO;

import java.io.Serializable;

public class ScrapViewVO implements Serializable{
	private String scrapCode;
	private String postCode;
	private String recipeCode;
	private String userCode;
	private String userName;
	private String userEmail;
	private String completeImage;
	private String recipeName;
	private String recipeDescription;
	private int likeCount;
	private int postHits;
	public ScrapViewVO() {
		super();
	}
	public ScrapViewVO(String scrapCode, String postCode, String recipeCode,
			String userCode, String userName, String userEmail,
			String completeImage, String recipeName, String recipeDescription,
			int likeCount, int postHits) {
		super();
		this.scrapCode = scrapCode;
		this.postCode = postCode;
		this.recipeCode = recipeCode;
		this.userCode = userCode;
		this.userName = userName;
		this.userEmail = userEmail;
		this.completeImage = completeImage;
		this.recipeName = recipeName;
		this.recipeDescription = recipeDescription;
		this.likeCount = likeCount;
		this.postHits = postHits;
	}
	public String getScrapCode() {
		return scrapCode;
	}
	public String getPostCode() {
		return postCode;
	}
	public String getRecipeCode() {
		return recipeCode;
	}
	public String getUserCode() {
		return userCode;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public String getCompleteImage() {
		return completeImage;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public String getRecipeDescription() {
		return recipeDescription;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public int getPostHits() {
		return postHits;
	}
	public void setScrapCode(String scrapCode) {
		this.scrapCode = scrapCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
		return "ScrapViewVO [scrapCode=" + scrapCode + ", postCode=" + postCode
				+ ", recipeCode=" + recipeCode + ", userCode=" + userCode
				+ ", userName=" + userName + ", userEmail=" + userEmail
				+ ", completeImage=" + completeImage + ", recipeName="
				+ recipeName + ", recipeDescription=" + recipeDescription
				+ ", likeCount=" + likeCount + ", postHits=" + postHits + "]";
	}
	
}
