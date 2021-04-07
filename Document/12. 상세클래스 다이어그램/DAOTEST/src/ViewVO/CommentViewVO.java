package ViewVO;

public class CommentViewVO {
	private String commentCode;
	private String commentUserCode;
	private String userName;
	private String userImage;
	private String commentContents;
	private String commentDate;
	private String postCode;
	public CommentViewVO() {
		// TODO Auto-generated constructor stub
	}
	public CommentViewVO(String commentCode, String commentUserCode,
			String userName, String userImage, String commentContents,
			String commentDate, String postCode) {
		this.commentCode = commentCode;
		this.commentUserCode = commentUserCode;
		this.userName = userName;
		this.userImage = userImage;
		this.commentContents = commentContents;
		this.commentDate = commentDate;
		this.postCode = postCode;
	}
	public String getCommentCode() {
		return commentCode;
	}
	public void setCommentCode(String commentCode) {
		this.commentCode = commentCode;
	}
	public String getCommentUserCode() {
		return commentUserCode;
	}
	public void setCommentUserCode(String commentUserCode) {
		this.commentUserCode = commentUserCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public String getCommentContents() {
		return commentContents;
	}
	public void setCommentContents(String commentContents) {
		this.commentContents = commentContents;
	}
	public String getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	

}
