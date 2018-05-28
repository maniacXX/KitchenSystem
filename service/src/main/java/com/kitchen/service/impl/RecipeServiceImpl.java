package com.kitchen.service.impl;

import com.kitchen.service.RecipeService;
import com.kitchen.service.jedis.JedisClient;
import com.kitchen.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author chen
 * @date 2018/5/28 19:57
 */
@Service
public class RecipeServiceImpl implements RecipeService {
	private final RecipeMapper recipeMapper;
	private final JedisClient jedisClient;
	@Value("${HOTSPOT_RECIPE}")
	private String HOTSPOT_RECIPE;


	@Autowired
	public RecipeServiceImpl(RecipeMapper recipeMapper, JedisClient jedisClient) {
		this.recipeMapper = recipeMapper;
		this.jedisClient = jedisClient;
	}

	/**
	 * 通过菜谱id查询菜谱
	 *
	 * @param id 待查询的菜谱id
	 * @return 菜谱
	 */
	@Override
	public Recipe getRecipeById(Long id) {
		return recipeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 通过菜谱类id，查询菜谱
	 *
	 * @param typeId 待查询的菜谱种类id
	 * @return 该类菜谱
	 */
	@Override
	public List<Recipe> getRecipesByTypeId(Integer typeId) {
		RecipeExample recipeExample = new RecipeExample();
		RecipeExample.Criteria criteria = recipeExample.createCriteria();
		criteria.andRecipeTypeIdEqualTo(typeId.byteValue());
		return recipeMapper.selectByExample(recipeExample);
	}

	/**
	 * 从数据库查询得到热点菜谱放入redis中
	 *
	 * @param ids 热点菜谱id
	 * @return
	 */
	@Override
	public String setHotspotRecipes(List<Long> ids) {
		RecipeExample recipeExample = new RecipeExample();
		RecipeExample.Criteria criteria = recipeExample.createCriteria();
		criteria.andRecipeIdIn(ids);
		List<Recipe> recipes = recipeMapper.selectByExample(recipeExample);
		//将热点菜谱转换为json
		String recipesJson = JsonUtils.objectToJson(recipes);
		//放入redis中
		return jedisClient.set(HOTSPOT_RECIPE, recipesJson);
	}

	/**
	 * 得到所有热点菜谱
	 *
	 * @return
	 */
	@Override
	public List<Recipe> getHotspotRecipes() {
		String recipeJson = jedisClient.get(HOTSPOT_RECIPE);
		return JsonUtils.jsonToList(recipeJson, Recipe.class);
	}

	/**
	 * 插入菜谱
	 *
	 * @param recipe 菜谱信息
	 * @return
	 */
	@Override
	public Integer insertRecipe(Recipe recipe) {
		recipe.setGmtCreate(new Date());
		recipe.setGmtModified(new Date());
		return recipeMapper.insertSelective(recipe);
	}

	/**
	 * 更新菜谱
	 *
	 * @param recipe 待更新菜谱信息
	 * @return
	 */
	@Override
	public Integer updateRecipe(Recipe recipe) {
		recipe.setGmtModified(new Date());
		return recipeMapper.updateByPrimaryKeySelective(recipe);
	}

	/**
	 * 删除菜谱
	 *
	 * @param id 待删除菜谱的id
	 * @return
	 */
	@Override
	public Integer deleteRecipeById(Long id) {
		return recipeMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 批量删除菜谱
	 *
	 * @param ids 待删除菜谱的所有id
	 * @return
	 */
	@Override
	public Integer deleteRecipesById(List<Long> ids) {
		RecipeExample recipeExample = new RecipeExample();
		RecipeExample.Criteria criteria = recipeExample.createCriteria();
		criteria.andRecipeIdIn(ids);
		return recipeMapper.deleteByExample(recipeExample);
	}

}
