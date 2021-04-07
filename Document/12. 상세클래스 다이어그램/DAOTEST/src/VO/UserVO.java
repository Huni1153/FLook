package VO;

import java.io.Serializable;

public class UserVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3794442731781442661L;
	private String userCode;
	private String userName;
	private String userImage;
	private String userEmail;
	private String userPassword;
	private String userGender;
	private String birthday;
	public UserVO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserVO(String userCode, String userName, String userImage,
			String userEmail, String userPassword, String userGender,
			String birthday) {
		this.userCode = userCode;
		this.userName = userName;
		this.userImage = userImage;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.birthday = birthday;
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
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "UserVO [userName=" + userName + ", userImage=" + userImage
				+ ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userGender=" + userGender + ", birthday=" + birthday + "]";
	}
	
	
	

}
