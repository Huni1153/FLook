package VO;

public class FollowVO {

	private String followCode;
	private String userCode;
	
	public FollowVO()
	{
		
	}

	public FollowVO(String followCode, String userCode) {
		super();
		this.followCode = followCode;
		this.userCode = userCode;
	}

	public String getFollowCode() {
		return followCode;
	}

	public void setFollowCode(String followCode) {
		this.followCode = followCode;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Override
	public String toString() {
		return "FollowVO [followCode=" + followCode + ", userCode=" + userCode
				+ "]";
	}
}
