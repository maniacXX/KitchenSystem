package com.kitchen.mapper;

import com.kitchen.pojo.Recipe;
import com.kitchen.pojo.RecipeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecipeMapper {
    long countByExample(RecipeExample example);

    int deleteByExample(RecipeExample example);

    int deleteByPrimaryKey(Long recipeId);

    int insert(Recipe record);

    int insertSelective(Recipe record);

    List<Recipe> selectByExample(RecipeExample example);

    Recipe selectByPrimaryKey(Long recipeId);

    int updateByExampleSelective(@Param("record") Recipe record, @Param("example") RecipeExample example);

    int updateByExample(@Param("record") Recipe record, @Param("example") RecipeExample example);

    int updateByPrimaryKeySelective(Recipe record);

    int updateByPrimaryKey(Recipe record);
}