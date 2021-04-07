package DAO;

import java.util.LinkedList;

import ViewVO.SimpleRecipeViewVO;

public class FlookRecipeManager {

	private SimpleRecipeViewDAO simpleRecipeViewDAO;
	
	public FlookRecipeManager()
	{
	}
	public FlookRecipeManager(SimpleRecipeViewDAO simpleRecipeViewDAO)
	{
		this.simpleRecipeViewDAO=simpleRecipeViewDAO;
	}
	public LinkedList<SimpleRecipeViewVO> requestSimpleFlookREcipeList()
	{
		return this.simpleRecipeViewDAO.selectSimpleRecipe();
	}
	
}
