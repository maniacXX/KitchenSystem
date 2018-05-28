package com.kitchen.service;

import com.kitchen.pojo.RecipeType;

import java.util.List;

/**
 * @author chen
 * @date 2018/5/28 21:28
 */

public interface RecipeTypeService {
	/**
	 * 通过id查询菜谱种类
	 *
	 * @param id 待查询的菜谱种类id
	 * @return 菜谱种类
	 */
	RecipeType getRecipeTypeById(Integer id);

	/**
	 * 得到所有菜谱种类
	 *
	 * @return 菜谱种类
	 */
	List<RecipeType> getRecipeTypes();

	/**
	 * 插入菜谱种类
	 *
	 * @param recipeType 菜谱种类信息
	 * @return
	 */
	Integer insertRecipeType(RecipeType recipeType);

	/**
	 * 更新菜谱种类
	 *
	 * @param recipeType 待更新菜谱信息
	 * @return
	 */
	Integer updateRecipeType(RecipeType recipeType);

	/**
	 * 删除菜谱种类
	 *
	 * @param id 待删除菜谱种类的id
	 * @return
	 */
	Integer deleteRecipeTypeById(Long id);

}
