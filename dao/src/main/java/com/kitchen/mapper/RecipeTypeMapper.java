package com.kitchen.mapper;

import com.kitchen.pojo.RecipeType;
import com.kitchen.pojo.RecipeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecipeTypeMapper {
    long countByExample(RecipeTypeExample example);

    int deleteByExample(RecipeTypeExample example);

    int deleteByPrimaryKey(Byte recipeTypeId);

    int insert(RecipeType record);

    int insertSelective(RecipeType record);

    List<RecipeType> selectByExample(RecipeTypeExample example);

    RecipeType selectByPrimaryKey(Byte recipeTypeId);

    int updateByExampleSelective(@Param("record") RecipeType record, @Param("example") RecipeTypeExample example);

    int updateByExample(@Param("record") RecipeType record, @Param("example") RecipeTypeExample example);

    int updateByPrimaryKeySelective(RecipeType record);

    int updateByPrimaryKey(RecipeType record);
}