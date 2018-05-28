package com.kitchen.service;

import com.kitchen.pojo.Recipe;

import java.util.List;

/**
 * @author chen
 * @date 2018/5/28 18:32
 */
public interface RecipeService {
	/**
	 * 通过菜谱id查询菜谱
	 *
	 * @param id 待查询的菜谱id
	 * @return 菜谱
	 */
	Recipe getRecipeById(Long id);


	/**
	 * 通过菜谱类id，查询菜谱
	 *
	 * @param typeId 待查询的菜谱种类id
	 * @return 该类菜谱
	 */
	List<Recipe> getRecipesByTypeId(Integer typeId);

	/**
	 * 从数据库查询得到热点菜谱放入redis中
	 *
	 * @param ids 热点菜谱id
	 * @return
	 */
	String setHotspotRecipes(List<Long> ids);

	/**
	 * 得到所有热点菜谱
	 *
	 * @return
	 */
	List<Recipe> getHotspotRecipes();

	/**
	 * 插入菜谱
	 *
	 * @param recipe 菜谱信息
	 * @return
	 */
	Integer insertRecipe(Recipe recipe);

	/**
	 * 更新菜谱
	 *
	 * @param recipe 待更新菜谱信息
	 * @return
	 */
	Integer updateRecipe(Recipe recipe);

	/**
	 * 删除菜谱
	 *
	 * @param id 待删除菜谱的id
	 * @return
	 */
	Integer deleteRecipeById(Long id);

	/**
	 * 批量删除菜谱
	 *
	 * @param ids 待删除菜谱的所有id
	 * @return
	 */
	Integer deleteRecipesById(List<Long> ids);
}
