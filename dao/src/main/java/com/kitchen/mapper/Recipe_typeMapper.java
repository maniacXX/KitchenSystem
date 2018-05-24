package com.kitchen.mapper;

import com.kitchen.pojo.Recipe_type;
import com.kitchen.pojo.Recipe_typeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Recipe_typeMapper {
    long countByExample(Recipe_typeExample example);

    int deleteByExample(Recipe_typeExample example);

    int deleteByPrimaryKey(Byte recipeTypeId);

    int insert(Recipe_type record);

    int insertSelective(Recipe_type record);

    List<Recipe_type> selectByExample(Recipe_typeExample example);

    Recipe_type selectByPrimaryKey(Byte recipeTypeId);

    int updateByExampleSelective(@Param("record") Recipe_type record, @Param("example") Recipe_typeExample example);

    int updateByExample(@Param("record") Recipe_type record, @Param("example") Recipe_typeExample example);

    int updateByPrimaryKeySelective(Recipe_type record);

    int updateByPrimaryKey(Recipe_type record);
}