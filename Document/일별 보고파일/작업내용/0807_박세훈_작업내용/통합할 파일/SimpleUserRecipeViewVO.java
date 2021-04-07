package ViewVO;
/**
 * 사용자가 작성한 레시피의 정보를 저장하는 VO.
 * @author GHKwon
 *
 */
public class SimpleUserRecipeViewVO {
	private String postCode;
	private String recipeCode;
	private String userCode;
	private String completeImage;
	private String recipeName;
	private String recipeDescription;
	private int likeCount;
	private int postHits;
	private String postHashTag;
	private String userName;
	private String userImage;
	/**
	 * Null Constructor.
	 */
	public SimpleUserRecipeViewVO() {
		super();
	}
	/**
	 * 모든인자를 다 받는 생성자.
	 * DB에서 한 줄의 레코드의 데이터를 저장한다.
	 * @param postCode 게시판 
	 * @param recipeCode 레시피 식별코드
	 * @param userCode 유저 식별코드
	 * @param completeImage 완성사진
	 * @param recipeDescription 레시피 설명.
	 * @param likeCount 좋아요 수
	 * @param postHits 조회 수
	 * @param userName 유저 이름.
	 */
	public SimpleUserRecipeViewVO(String postCode, String recipeCode,
			String userCode, String completeImage, String recipeName,
			String recipeDescription, int likeCount, int postHits,
			String postHashTag, String userName, String userImage) {
		super();
		this.postCode = postCode;
		this.recipeCode = recipeCode;
		this.userCode = userCode;
		this.completeImage = completeImage;
		this.recipeName = recipeName;
		this.recipeDescription = recipeDescription;
		this.likeCount = likeCount;
		this.postHits = postHits;
		this.postHashTag = postHashTag;
		this.userName = userName;
		this.userImage = userImage;
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
	public String getPostHashTag() {
		return postHashTag;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserImage() {
		return userImage;
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
	public void setPostHashTag(String postHashTag) {
		this.postHashTag = postHashTag;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	@Override
	public String toString() {
		return "SimpleUserRecipeViewVO [postCode=" + postCode + ", recipeCode="
				+ recipeCode + ", userCode=" + userCode + ", completeImage="
				+ completeImage + ", recipeName=" + recipeName
				+ ", recipeDescription=" + recipeDescription + ", likeCount="
				+ likeCount + ", postHits=" + postHits + ", postHashTag="
				+ postHashTag + ", userName=" + userName + ", userImage="
				+ userImage + "]";
	}
	
	
}
