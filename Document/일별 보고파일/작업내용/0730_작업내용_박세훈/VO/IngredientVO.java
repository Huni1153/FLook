package VO;

public class IngredientVO {

	private String ingredientCode;
	private String recipeCode;
	private String ingredientName;
	private int ingredientNum;
	private String ingredientUnit;
	private byte ingredientType;
	
	public IngredientVO()
	{
		
	}

	public IngredientVO(String ingredientCode, String recipeCode,
			String ingredientName, int ingredientNum, String ingredientUnit,
			byte ingredientType) {
		super();
		this.ingredientCode = ingredientCode;
		this.recipeCode = recipeCode;
		this.ingredientName = ingredientName;
		this.ingredientNum = ingredientNum;
		this.ingredientUnit = ingredientUnit;
		this.ingredientType = ingredientType;
	}

	public String getIngredientCode() {
		return ingredientCode;
	}

	public void setIngredientCode(String ingredientCode) {
		this.ingredientCode = ingredientCode;
	}

	public String getRecipeCode() {
		return recipeCode;
	}

	public void setRecipeCode(String recipeCode) {
		this.recipeCode = recipeCode;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public int getIngredientNum() {
		return ingredientNum;
	}

	public void setIngredientNum(int ingredientNum) {
		this.ingredientNum = ingredientNum;
	}

	public String getIngredientUnit() {
		return ingredientUnit;
	}

	public void setIngredientUnit(String ingredientUnit) {
		this.ingredientUnit = ingredientUnit;
	}

	public byte getIngredientType() {
		return ingredientType;
	}

	public void setIngredientType(byte ingredientType) {
		this.ingredientType = ingredientType;
	}

	@Override
	public String toString() {
		return "IngredientVO [ingredientCode=" + ingredientCode
				+ ", recipeCode=" + recipeCode + ", ingredientName="
				+ ingredientName + ", ingredientNum=" + ingredientNum
				+ ", ingredientUnit=" + ingredientUnit + ", ingredientType="
				+ ingredientType + "]";
	}
}
