package ViewVO;

public class UserRecipeViewVO {
	private String postCode;
	private String recipeCode;
	private String completeImage;
	private String recipeName;
	private String recipeDescription;
	private int personNumber;
	private String cookingTime;
	private String cookingLevel;
	private int likeCount;
	private int postHits;
	private String postHashTag;
	private String userName;
	private String userPicture;
	public UserRecipeViewVO() {
	}
	public UserRecipeViewVO(String postCode, String recipeCode,
			String completeImage, String recipeName, String recipeDescription,
			int personNumber, String cookingTime, String cookingLevel,
			int likeCount, int postHits, String postHashTag, String userName,
			String userPicture) {
		this.postCode = postCode;
		this.recipeCode = recipeCode;
		this.completeImage = completeImage;
		this.recipeName = recipeName;
		this.recipeDescription = recipeDescription;
		this.personNumber = personNumber;
		this.cookingTime = cookingTime;
		this.cookingLevel = cookingLevel;
		this.likeCount = likeCount;
		this.postHits = postHits;
		this.postHashTag = postHashTag;
		this.userName = userName;
		this.userPicture = userPicture;
	}
	public String getPostCode() {
		return postCode;
	}
	public String getRecipeCode() {
		return recipeCode;
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
	public int getPersonNumber() {
		return personNumber;
	}
	public String getCookingTime() {
		return cookingTime;
	}
	public String getCookingLevel() {
		return cookingLevel;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public int getPostHits() {
		return postHits;
	}
	public String getPostHashTag() {
		return postHashTag;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserPicture() {
		return userPicture;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
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
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	public void setCookingTime(String cookingTime) {
		this.cookingTime = cookingTime;
	}
	public void setCookingLevel(String cookingLevel) {
		this.cookingLevel = cookingLevel;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public void setPostHits(int postHits) {
		this.postHits = postHits;
	}
	public void setPostHashTag(String postHashTag) {
		this.postHashTag = postHashTag;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}
	
}
