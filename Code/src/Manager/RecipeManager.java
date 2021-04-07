package Manager;

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
		if(recipeDAO.insertRecipe(recipeVO)!=null||postDAO.insertPost(postVO)!=null)
		{
			for(IngredientVO ingredientVO:ingredientList)
			{
				ingredientDAO.insertIngredient(ingredientVO);
			}
			for(CookingVO cookingVO:cookingList)
			{
				cookingDAO.insertCooking(cookingVO);
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
