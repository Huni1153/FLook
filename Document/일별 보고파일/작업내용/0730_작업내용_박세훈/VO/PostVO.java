package VO;
import java.util.Arrays;


public class PostVO {

	private String postCode;
	private String recipeCode;
	private String userCode;
	private int likingCount;
	private String[] hashTag;
	private String postHits;
	
	public PostVO()
	{
		
	}

	public PostVO(String postCode, String recipeCode, String userCode,
			int likingCount, String[] hashTag, String postHits) {
		super();
		this.postCode = postCode;
		this.recipeCode = recipeCode;
		this.userCode = userCode;
		this.likingCount = likingCount;
		this.hashTag = hashTag;
		this.postHits = postHits;
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

	public int getLikingCount() {
		return likingCount;
	}

	public void setLikingCount(int likingCount) {
		this.likingCount = likingCount;
	}

	public String[] getHashTag() {
		return hashTag;
	}

	public void setHashTag(String[] hashTag) {
		this.hashTag = hashTag;
	}

	public String getPostHits() {
		return postHits;
	}

	public void setPostHits(String postHits) {
		this.postHits = postHits;
	}

	@Override
	public String toString() {
		return "PostVO [postCode=" + postCode + ", recipeCode=" + recipeCode
				+ ", userCode=" + userCode + ", likingCount=" + likingCount
				+ ", hashTag=" + Arrays.toString(hashTag) + ", postHits="
				+ postHits + "]";
	}
}
