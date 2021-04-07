package DAO;

import java.sql.Connection;
import java.util.LinkedList;

import ViewVO.SimpleRecipeViewVO;

public class SimpleRecipeViewDAO {

	private static final SimpleRecipeViewDAO obj=new SimpleRecipeViewDAO();;
	private static final DBConnection conn=DBConnection.getInstance();;
	private Connection con;
	
	private SimpleRecipeViewDAO()
	{
	}
	public static SimpleRecipeViewDAO getInstance()
	{
		return obj;
	}
	public LinkedList<SimpleRecipeViewVO> selectSimpleRecipe()
	{
		return null;
	}
	public LinkedList<SimpleRecipeViewVO> selectSimpleRecipe(String psotCode)
	{
		return null;
	}
}
