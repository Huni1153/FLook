package Manager;

import java.util.LinkedList;

import ViewDAO.SimpleFlookRecipeViewDAO;
import ViewVO.SimpleRecipeViewVO;

public class FlookRecipeManager {
	
	private SimpleFlookRecipeViewDAO simpleFlookRecipeViewDAO;
	
	public FlookRecipeManager()
	{
		this.simpleFlookRecipeViewDAO=SimpleFlookRecipeViewDAO.getInstance();
	}
	public LinkedList<SimpleRecipeViewVO> requestSimpleRecipeList()
	{
		return this.simpleFlookRecipeViewDAO.selectSimpleRecipe();
	}
}
