package ViewVO;
/**
 * ����ڰ� �ۼ��� �������� ������ �����ϴ� VO.
 * @author GHKwon
 *
 */
public class SimpleUserRecipeViewVO {
	private String postCode;
	private String recipeCode;
	private String userCode;
	private String completeImage;
	private String recipeDescription;
	private int likeCount;
	private int postHits;
	private String userName;
	/**
	 * Null Constructor.
	 */
	public SimpleUserRecipeViewVO() {
		super();
	}
	/**
	 * ������ڸ� �� �޴� ������.
	 * DB���� �� ���� ���ڵ��� �����͸� �����Ѵ�.
	 * @param postCode �Խ��� 
	 * @param recipeCode ������ �ĺ��ڵ�
	 * @param userCode ���� �ĺ��ڵ�
	 * @param completeImage �ϼ�����
	 * @param recipeDescription ������ ����.
	 * @param likeCount ���ƿ� ��
	 * @param postHits ��ȸ ��
	 * @param userName ���� �̸�.
	 */
	public SimpleUserRecipeViewVO(String postCode, String recipeCode,
			String userCode, String completeImage, String recipeDescription,
			int likeCount, int postHits, String userName) {
		super();
		this.postCode = postCode;
		this.recipeCode = recipeCode;
		this.userCode = userCode;
		this.completeImage = completeImage;
		this.recipeDescription = recipeDescription;
		this.likeCount = likeCount;
		this.postHits = postHits;
		this.userName = userName;
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
	public String getRecipeDescription() {
		return recipeDescription;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public int getPostHits() {
		return postHits;
	}
	public String getUserName() {
		return userName;
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
	public void setRecipeDescription(String recipeDescription) {
		this.recipeDescription = recipeDescription;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public void setPostHits(int postHits) {
		this.postHits = postHits;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String toString() {
		return "SimpleUserRecipeViewVO [postCode=" + postCode + ", recipeCode="
				+ recipeCode + ", userCode=" + userCode + ", completeImage="
				+ completeImage + ", recipeDescription=" + recipeDescription
				+ ", likeCount=" + likeCount + ", postHits=" + postHits
				+ ", userName=" + userName + "]";
	}
	
}
