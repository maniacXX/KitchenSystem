package com.kitchen.service.impl;

import com.kitchen.mapper.RecipeTypeMapper;
import com.kitchen.pojo.RecipeType;
import com.kitchen.service.RecipeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chen
 * @date 2018/5/28 21:53
 */
@Service
public class RecipeTypeServiceImpl implements RecipeTypeService {
	private final RecipeTypeMapper recipeTypeMapper;

	@Autowired
	public RecipeTypeServiceImpl(RecipeTypeMapper recipeTypeMapper) {
		this.recipeTypeMapper = recipeTypeMapper;
	}

	/**
	 * 通过id查询菜谱种类
	 *
	 * @param id 待查询的菜谱种类id
	 * @return 菜谱种类
	 */
	@Override
	public RecipeType getRecipeTypeById(Integer id) {
		return recipeTypeMapper.selectByPrimaryKey(id.byteValue());
	}

	/**
	 * 得到所有菜谱种类
	 *
	 * @return 菜谱种类
	 */
	@Override
	public List<RecipeType> getRecipeTypes() {
		return recipeTypeMapper.selectByExample(null);
	}

	/**
	 * 插入菜谱种类
	 *
	 * @param recipeType 菜谱种类信息
	 * @return
	 */
	@Override
	public Integer insertRecipeType(RecipeType recipeType) {
		return recipeTypeMapper.insertSelective(recipeType);
	}

	/**
	 * 更新菜谱种类
	 *
	 * @param recipeType 待更新菜谱信息
	 * @return
	 */
	@Override
	public Integer updateRecipeType(RecipeType recipeType) {
		return recipeTypeMapper.updateByPrimaryKeySelective(recipeType);
	}

	/**
	 * 删除菜谱种类
	 *
	 * @param id 待删除菜谱种类的id
	 * @return
	 */
	@Override
	public Integer deleteRecipeTypeById(Long id) {
		return recipeTypeMapper.deleteByPrimaryKey(id.byteValue());
	}
}
