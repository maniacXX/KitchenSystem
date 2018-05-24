package com.kitchen.pojo;

import java.util.Date;

public class Recipe {
    private Long recipeId;

    private String recipeName;

    private String recipeCookingTime;

    private Byte recipeDifficulty;

    private Byte recipeTypeId;

    private String recipeInstruction;

    private String recipeImg;

    private String recipeContent;

    private Long recipeCreaterId;

    private Date gmtCreate;

    private Date gmtMotified;

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName == null ? null : recipeName.trim();
    }

    public String getRecipeCookingTime() {
        return recipeCookingTime;
    }

    public void setRecipeCookingTime(String recipeCookingTime) {
        this.recipeCookingTime = recipeCookingTime == null ? null : recipeCookingTime.trim();
    }

    public Byte getRecipeDifficulty() {
        return recipeDifficulty;
    }

    public void setRecipeDifficulty(Byte recipeDifficulty) {
        this.recipeDifficulty = recipeDifficulty;
    }

    public Byte getRecipeTypeId() {
        return recipeTypeId;
    }

    public void setRecipeTypeId(Byte recipeTypeId) {
        this.recipeTypeId = recipeTypeId;
    }

    public String getRecipeInstruction() {
        return recipeInstruction;
    }

    public void setRecipeInstruction(String recipeInstruction) {
        this.recipeInstruction = recipeInstruction == null ? null : recipeInstruction.trim();
    }

    public String getRecipeImg() {
        return recipeImg;
    }

    public void setRecipeImg(String recipeImg) {
        this.recipeImg = recipeImg == null ? null : recipeImg.trim();
    }

    public String getRecipeContent() {
        return recipeContent;
    }

    public void setRecipeContent(String recipeContent) {
        this.recipeContent = recipeContent == null ? null : recipeContent.trim();
    }

    public Long getRecipeCreaterId() {
        return recipeCreaterId;
    }

    public void setRecipeCreaterId(Long recipeCreaterId) {
        this.recipeCreaterId = recipeCreaterId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtMotified() {
        return gmtMotified;
    }

    public void setGmtMotified(Date gmtMotified) {
        this.gmtMotified = gmtMotified;
    }
}