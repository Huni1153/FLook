package VO;

import java.io.Serializable;

public class PostVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8355936904060426048L;
	private String postCode;
	private String recipeCode;
	private String userCode;
	private String likeCount;
	private String postHits;
	private String postHashtag;
	private String postDate;
	
	public PostVO() {
		// TODO Auto-generated constructor stub
	}
	
	public PostVO(String postCode, String recipeCode, String userCode,
			String likeCount, String postHits, String postHashtag,
			String postDate) {
		this.postCode = postCode;
		this.recipeCode = recipeCode;
		this.userCode = userCode;
		this.likeCount = likeCount;
		this.postHits = postHits;
		this.postHashtag = postHashtag;
		this.postDate = postDate;
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
	public String getPostHashtag() {
		return postHashtag;
	}
	public void setPostHashtag(String postHashtag) {
		this.postHashtag = postHashtag;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	@Override
	public String toString() {
		return "PostVO [postCode=" + postCode + ", recipeCode=" + recipeCode
				+ ", userCode=" + userCode + ", likeCount=" + likeCount
				+ ", postHits=" + postHits + ", postHashtag=" + postHashtag
				+ ", postDate=" + postDate + "]";
	}
	
	
	

}
