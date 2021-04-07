package VO;

public class SNSFriendVO {

	private String snsFriendCode;
	private String userCode;
	private String friendCode;
	
	
	public SNSFriendVO()
	{
	}


	public SNSFriendVO(String snsFriendCode, String userCode, String friendCode) {
		super();
		this.snsFriendCode = snsFriendCode;
		this.userCode = userCode;
		this.friendCode = friendCode;
	}


	public String getSnsFriendCode() {
		return snsFriendCode;
	}


	public void setSnsFriendCode(String snsFriendCode) {
		this.snsFriendCode = snsFriendCode;
	}


	public String getUserCode() {
		return userCode;
	}


	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}


	public String getFriendCode() {
		return friendCode;
	}


	public void setFriendCode(String friendCode) {
		this.friendCode = friendCode;
	}


	@Override
	public String toString() {
		return "SNSFriendVO [snsFriendCode=" + snsFriendCode + ", userCode="
				+ userCode + ", friendCode=" + friendCode + "]";
	}
	
}
