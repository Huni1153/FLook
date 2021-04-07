package VO;

public class ScrapVO {

	private String recipeCdoe;
	private String userName;
	private String recipeCaption;
	
	public ScrapVO()
	{
		
	}

	public ScrapVO(String recipeCdoe, String userName, String recipeCaption) {
		super();
		this.recipeCdoe = recipeCdoe;
		this.userName = userName;
		this.recipeCaption = recipeCaption;
	}

	public String getRecipeCdoe() {
		return recipeCdoe;
	}

	public void setRecipeCdoe(String recipeCdoe) {
		this.recipeCdoe = recipeCdoe;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRecipeCaption() {
		return recipeCaption;
	}

	public void setRecipeCaption(String recipeCaption) {
		this.recipeCaption = recipeCaption;
	}

	@Override
	public String toString() {
		return "ScrapVO [recipeCdoe=" + recipeCdoe + ", userName=" + userName
				+ ", recipeCaption=" + recipeCaption + "]";
	}
}
