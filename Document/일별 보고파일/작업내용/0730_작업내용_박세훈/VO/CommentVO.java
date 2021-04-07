package VO;

public class CommentVO {

	private String userCode;
	private String postCode;
	private String writeProfileImage;
	private String writerName;
	private String commentContent;
	private String writeDate;
	
	public CommentVO()
	{
		
	}

	public CommentVO(String userCode, String postCode,
			String writeProfileImage, String writerName, String commentContent,
			String writeDate) {
		super();
		this.userCode = userCode;
		this.postCode = postCode;
		this.writeProfileImage = writeProfileImage;
		this.writerName = writerName;
		this.commentContent = commentContent;
		this.writeDate = writeDate;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getWriteProfileImage() {
		return writeProfileImage;
	}

	public void setWriteProfileImage(String writeProfileImage) {
		this.writeProfileImage = writeProfileImage;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "CommentVO [userCode=" + userCode + ", postCode=" + postCode
				+ ", writeProfileImage=" + writeProfileImage + ", writerName="
				+ writerName + ", commentContent=" + commentContent
				+ ", writeDate=" + writeDate + "]";
	}
}
