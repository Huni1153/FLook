package manager;

import java.util.LinkedList;

import DAO.CookingDAO;
import DAO.IngredientDAO;
import DAO.PostDAO;
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
	public RecipeManager()
	{
		this.recipeDAO=RecipeDAO.getInstance();
		this.postDAO=PostDAO.getInstance();
		this.cookingDAO=CookingDAO.getInstance();
		this.ingredientDAO=IngredientDAO.getInstance();
		
	}
	public int writeRecipe(RecipeVO recipeVO,PostVO postVO,LinkedList<CookingVO> cookingList,LinkedList<IngredientVO> ingredientList)
	{
		String recipeCode=recipeDAO.insertRecipe(recipeVO);
		System.out.println("recipeCode : "+recipeCode+"\n");
		if(recipeCode==null)
		{
			return 0;
		}
		postVO.setRecipeCode(recipeCode);
		String postCode=postDAO.insertPost(postVO);
		if(postCode==null)
		{
			return 0;
		}
		for(IngredientVO ingredientVO:ingredientList)
		{
			ingredientVO.setRecipeCode(recipeCode);
			ingredientDAO.insertIngredient(ingredientVO);
		}
		System.out.println("listL : "+cookingList.size());
		for(CookingVO cookingVO:cookingList)
		{
			cookingVO.setRecipeCode(recipeCode);
			cookingDAO.insertCooking(cookingVO);
		}
		return 1;
	}
}
