package com.kitchen.controller;

import com.kitchen.bean.ResultBean;
import com.kitchen.pojo.Recipe;
import com.kitchen.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author chen
 * @date 2018/5/28 21:02
 */
@Controller
@RequestMapping("/recipe")
public class RecipeController {
	private final RecipeService recipeService;

	@Autowired
	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	/**
	 * 通过菜谱id查询菜谱
	 *
	 * @param id 待查询的菜谱id
	 * @return 菜谱
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean getRecipeById(@PathVariable("id") Long id) {
		Recipe recipe = recipeService.getRecipeById(id);
		if (recipe != null) {
			return ResultBean.success(recipe);
		} else {
			return ResultBean.checkFail("该菜谱不存在");
		}
	}

	@RequestMapping(value = "/type/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean getRecipeByTypeId(@PathVariable("id") Integer id) {
		List<Recipe> recipes = recipeService.getRecipesByTypeId(id);
		if (recipes != null || recipes.size() != 0) {
			return ResultBean.success(recipes);
		} else {
			return ResultBean.checkFail("该菜谱种类不存在");
		}
	}
}
