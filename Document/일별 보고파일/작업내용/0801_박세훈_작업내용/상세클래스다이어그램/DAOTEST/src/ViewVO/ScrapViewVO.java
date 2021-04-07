package ViewVO;

public class ScrapViewVO {
	private String scrapCode;
	private String postCode;
	private String recipeCode;
	private String userCode;
	private String userName;
	private String userEmail;
	private String completeImage;
	private String recipeName;
	private String recipeDescription;
	private String likeCount;
	private String postHits;
	public ScrapViewVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScrapViewVO(String scrapCode, String postCode, String recipeCode,
			String userCode, String userName, String userEmail,
			String completeImage, String recipeName, String recipeDescription,
			String likeCount, String postHits) {
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
	public void setScrapCode(String scrapCode) {
		this.scrapCode = scrapCode;
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
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
	public String getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(String likeCount) {
		this.likeCount = likeCount;
	}
	public String getPostHits() {
		return postHits;
	}
	public void setPostHits(String postHits) {
		this.postHits = postHits;
	}
	
	

}
