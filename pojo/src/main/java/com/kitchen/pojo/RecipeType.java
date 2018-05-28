package com.kitchen.pojo;

public class RecipeType {
    private Byte recipeTypeId;

    private String recipeTypeName;

    public Byte getRecipeTypeId() {
        return recipeTypeId;
    }

    public void setRecipeTypeId(Byte recipeTypeId) {
        this.recipeTypeId = recipeTypeId;
    }

    public String getRecipeTypeName() {
        return recipeTypeName;
    }

    public void setRecipeTypeName(String recipeTypeName) {
        this.recipeTypeName = recipeTypeName == null ? null : recipeTypeName.trim();
    }
}