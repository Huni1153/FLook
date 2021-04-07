package Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;

import DAO.CookingDAO;
import DAO.IngredientDAO;
import DAO.PostDAO;
import DAO.RecipeCategoryDAO;
import DAO.RecipeDAO;
import VO.CookingVO;
import VO.IngredientVO;
import VO.PostVO;
import VO.RecipeVO;

public class RecipeManager {
	private RecipeDAO recipeDAO;
	private PostDAO postDAO;
	private CookingDAO cookingDAO;
	private IngredientDAO ingredientDAO;
	private RecipeCategoryDAO recipeCategoryDAO;
	public RecipeManager()
	{
		this.recipeDAO=RecipeDAO.getInstance();
		this.postDAO=PostDAO.getInstance();
		this.cookingDAO=CookingDAO.getInstance();
		this.ingredientDAO=IngredientDAO.getInstance();
		this.recipeCategoryDAO=RecipeCategoryDAO.getInstance();
		
	}
	public int writeRecipe(RecipeVO recipeVO,PostVO postVO,LinkedList<CookingVO> cookingList,LinkedList<IngredientVO> ingredientList,String[] recipeCategory)
	{
		String recipeCode=recipeDAO.insertRecipe(recipeVO);
		System.out.println("recipeCode Check : "+recipeCode+"\n");
		if(recipeCode==null)
		{
			return 0;
		}
		postVO.setRecipeCode(recipeCode);
		String postCode=postDAO.insertPost(postVO);
		System.out.println("postCode check : "+postCode+"\n");
		if(postCode==null)
		{
			return 0;
		}
		for(IngredientVO ingredientVO:ingredientList)
		{
			ingredientVO.setRecipeCode(recipeCode);
			System.out.println("ingredient Check : "+ingredientDAO.insertIngredient(ingredientVO));
		}
		System.out.println("listL : "+cookingList.size());
		for(CookingVO cookingVO:cookingList)
		{
			cookingVO.setRecipeCode(recipeCode);
			cookingDAO.insertCooking(cookingVO);
		}
		System.out.println("check");
		System.out.println("RCcheck : "+recipeCategoryDAO.insertCategory(recipeCode, recipeCategory));
		System.out.println("check2");
		return 1;
	}

	public int deleteRecipe(String targetRecipeCode,String postCode)
	{
		postDAO.deletePost(postCode);
		System.out.println("ingredient del : "+ingredientDAO.deleteIngredientRecipe(targetRecipeCode));
		System.out.println("cooking del : "+cookingDAO.deleteCookingRecipe(targetRecipeCode));
		System.out.println("recipe del : "+recipeDAO.deleteRecipe(targetRecipeCode));
		return 1;
	}
}
