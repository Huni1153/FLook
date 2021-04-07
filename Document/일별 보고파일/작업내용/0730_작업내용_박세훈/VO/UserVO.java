package VO;

public class UserVO {

	private String userCode;
	private String userName;
	private String userImage;
	private String email;
	private String password;
	private String gender;
	private String birthDay;
	
	public UserVO()
	{
	}

	public UserVO(String userCode, String userName, String userImage,
			String email, String password, String gender, String birthDay) {
		super();
		this.userCode = userCode;
		this.userName = userName;
		this.userImage = userImage;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.birthDay = birthDay;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "UserVO [userCode=" + userCode + ", userName=" + userName
				+ ", userImage=" + userImage + ", email=" + email
				+ ", password=" + password + ", gender=" + gender
				+ ", birthDay=" + birthDay + "]";
	}			
}
