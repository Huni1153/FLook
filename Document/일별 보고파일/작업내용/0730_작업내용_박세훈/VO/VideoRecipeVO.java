package VO;

public class VideoRecipeVO {

	private String videoRecipeCode;
	private String videoCode;
	private String recipeCode;
	
	public VideoRecipeVO()
	{
		
	}

	public VideoRecipeVO(String videoRecipeCode, String videoCode,
			String recipeCode) {
		super();
		this.videoRecipeCode = videoRecipeCode;
		this.videoCode = videoCode;
		this.recipeCode = recipeCode;
	}

	public String getVideoRecipeCode() {
		return videoRecipeCode;
	}

	public void setVideoRecipeCode(String videoRecipeCode) {
		this.videoRecipeCode = videoRecipeCode;
	}

	public String getVideoCode() {
		return videoCode;
	}

	public void setVideoCode(String videoCode) {
		this.videoCode = videoCode;
	}

	public String getRecipeCode() {
		return recipeCode;
	}

	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
	}

	@Override
	public String toString() {
		return "VideoRecipeVO [videoRecipeCode=" + videoRecipeCode
				+ ", videoCode=" + videoCode + ", recipeCode=" + recipeCode
				+ "]";
	}
}
