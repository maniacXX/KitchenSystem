package com.kitchen.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecipeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecipeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRecipeIdIsNull() {
            addCriterion("recipe_id is null");
            return (Criteria) this;
        }

        public Criteria andRecipeIdIsNotNull() {
            addCriterion("recipe_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeIdEqualTo(Long value) {
            addCriterion("recipe_id =", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdNotEqualTo(Long value) {
            addCriterion("recipe_id <>", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdGreaterThan(Long value) {
            addCriterion("recipe_id >", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("recipe_id >=", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdLessThan(Long value) {
            addCriterion("recipe_id <", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdLessThanOrEqualTo(Long value) {
            addCriterion("recipe_id <=", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdIn(List<Long> values) {
            addCriterion("recipe_id in", values, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdNotIn(List<Long> values) {
            addCriterion("recipe_id not in", values, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdBetween(Long value1, Long value2) {
            addCriterion("recipe_id between", value1, value2, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdNotBetween(Long value1, Long value2) {
            addCriterion("recipe_id not between", value1, value2, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeNameIsNull() {
            addCriterion("recipe_name is null");
            return (Criteria) this;
        }

        public Criteria andRecipeNameIsNotNull() {
            addCriterion("recipe_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeNameEqualTo(String value) {
            addCriterion("recipe_name =", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameNotEqualTo(String value) {
            addCriterion("recipe_name <>", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameGreaterThan(String value) {
            addCriterion("recipe_name >", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameGreaterThanOrEqualTo(String value) {
            addCriterion("recipe_name >=", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameLessThan(String value) {
            addCriterion("recipe_name <", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameLessThanOrEqualTo(String value) {
            addCriterion("recipe_name <=", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameLike(String value) {
            addCriterion("recipe_name like", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameNotLike(String value) {
            addCriterion("recipe_name not like", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameIn(List<String> values) {
            addCriterion("recipe_name in", values, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameNotIn(List<String> values) {
            addCriterion("recipe_name not in", values, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameBetween(String value1, String value2) {
            addCriterion("recipe_name between", value1, value2, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameNotBetween(String value1, String value2) {
            addCriterion("recipe_name not between", value1, value2, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeIsNull() {
            addCriterion("recipe_cooking_time is null");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeIsNotNull() {
            addCriterion("recipe_cooking_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeEqualTo(String value) {
            addCriterion("recipe_cooking_time =", value, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeNotEqualTo(String value) {
            addCriterion("recipe_cooking_time <>", value, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeGreaterThan(String value) {
            addCriterion("recipe_cooking_time >", value, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("recipe_cooking_time >=", value, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeLessThan(String value) {
            addCriterion("recipe_cooking_time <", value, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeLessThanOrEqualTo(String value) {
            addCriterion("recipe_cooking_time <=", value, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeLike(String value) {
            addCriterion("recipe_cooking_time like", value, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeNotLike(String value) {
            addCriterion("recipe_cooking_time not like", value, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeIn(List<String> values) {
            addCriterion("recipe_cooking_time in", values, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeNotIn(List<String> values) {
            addCriterion("recipe_cooking_time not in", values, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeBetween(String value1, String value2) {
            addCriterion("recipe_cooking_time between", value1, value2, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeCookingTimeNotBetween(String value1, String value2) {
            addCriterion("recipe_cooking_time not between", value1, value2, "recipeCookingTime");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyIsNull() {
            addCriterion("recipe_difficulty is null");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyIsNotNull() {
            addCriterion("recipe_difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyEqualTo(Byte value) {
            addCriterion("recipe_difficulty =", value, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyNotEqualTo(Byte value) {
            addCriterion("recipe_difficulty <>", value, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyGreaterThan(Byte value) {
            addCriterion("recipe_difficulty >", value, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyGreaterThanOrEqualTo(Byte value) {
            addCriterion("recipe_difficulty >=", value, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyLessThan(Byte value) {
            addCriterion("recipe_difficulty <", value, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyLessThanOrEqualTo(Byte value) {
            addCriterion("recipe_difficulty <=", value, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyIn(List<Byte> values) {
            addCriterion("recipe_difficulty in", values, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyNotIn(List<Byte> values) {
            addCriterion("recipe_difficulty not in", values, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyBetween(Byte value1, Byte value2) {
            addCriterion("recipe_difficulty between", value1, value2, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeDifficultyNotBetween(Byte value1, Byte value2) {
            addCriterion("recipe_difficulty not between", value1, value2, "recipeDifficulty");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdIsNull() {
            addCriterion("recipe_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdIsNotNull() {
            addCriterion("recipe_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdEqualTo(Byte value) {
            addCriterion("recipe_type_id =", value, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdNotEqualTo(Byte value) {
            addCriterion("recipe_type_id <>", value, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdGreaterThan(Byte value) {
            addCriterion("recipe_type_id >", value, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("recipe_type_id >=", value, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdLessThan(Byte value) {
            addCriterion("recipe_type_id <", value, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("recipe_type_id <=", value, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdIn(List<Byte> values) {
            addCriterion("recipe_type_id in", values, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdNotIn(List<Byte> values) {
            addCriterion("recipe_type_id not in", values, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("recipe_type_id between", value1, value2, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("recipe_type_id not between", value1, value2, "recipeTypeId");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionIsNull() {
            addCriterion("recipe_instruction is null");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionIsNotNull() {
            addCriterion("recipe_instruction is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionEqualTo(String value) {
            addCriterion("recipe_instruction =", value, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionNotEqualTo(String value) {
            addCriterion("recipe_instruction <>", value, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionGreaterThan(String value) {
            addCriterion("recipe_instruction >", value, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("recipe_instruction >=", value, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionLessThan(String value) {
            addCriterion("recipe_instruction <", value, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionLessThanOrEqualTo(String value) {
            addCriterion("recipe_instruction <=", value, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionLike(String value) {
            addCriterion("recipe_instruction like", value, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionNotLike(String value) {
            addCriterion("recipe_instruction not like", value, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionIn(List<String> values) {
            addCriterion("recipe_instruction in", values, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionNotIn(List<String> values) {
            addCriterion("recipe_instruction not in", values, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionBetween(String value1, String value2) {
            addCriterion("recipe_instruction between", value1, value2, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeInstructionNotBetween(String value1, String value2) {
            addCriterion("recipe_instruction not between", value1, value2, "recipeInstruction");
            return (Criteria) this;
        }

        public Criteria andRecipeImgIsNull() {
            addCriterion("recipe_img is null");
            return (Criteria) this;
        }

        public Criteria andRecipeImgIsNotNull() {
            addCriterion("recipe_img is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeImgEqualTo(String value) {
            addCriterion("recipe_img =", value, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgNotEqualTo(String value) {
            addCriterion("recipe_img <>", value, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgGreaterThan(String value) {
            addCriterion("recipe_img >", value, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgGreaterThanOrEqualTo(String value) {
            addCriterion("recipe_img >=", value, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgLessThan(String value) {
            addCriterion("recipe_img <", value, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgLessThanOrEqualTo(String value) {
            addCriterion("recipe_img <=", value, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgLike(String value) {
            addCriterion("recipe_img like", value, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgNotLike(String value) {
            addCriterion("recipe_img not like", value, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgIn(List<String> values) {
            addCriterion("recipe_img in", values, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgNotIn(List<String> values) {
            addCriterion("recipe_img not in", values, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgBetween(String value1, String value2) {
            addCriterion("recipe_img between", value1, value2, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeImgNotBetween(String value1, String value2) {
            addCriterion("recipe_img not between", value1, value2, "recipeImg");
            return (Criteria) this;
        }

        public Criteria andRecipeContentIsNull() {
            addCriterion("recipe_content is null");
            return (Criteria) this;
        }

        public Criteria andRecipeContentIsNotNull() {
            addCriterion("recipe_content is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeContentEqualTo(String value) {
            addCriterion("recipe_content =", value, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentNotEqualTo(String value) {
            addCriterion("recipe_content <>", value, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentGreaterThan(String value) {
            addCriterion("recipe_content >", value, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentGreaterThanOrEqualTo(String value) {
            addCriterion("recipe_content >=", value, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentLessThan(String value) {
            addCriterion("recipe_content <", value, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentLessThanOrEqualTo(String value) {
            addCriterion("recipe_content <=", value, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentLike(String value) {
            addCriterion("recipe_content like", value, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentNotLike(String value) {
            addCriterion("recipe_content not like", value, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentIn(List<String> values) {
            addCriterion("recipe_content in", values, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentNotIn(List<String> values) {
            addCriterion("recipe_content not in", values, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentBetween(String value1, String value2) {
            addCriterion("recipe_content between", value1, value2, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeContentNotBetween(String value1, String value2) {
            addCriterion("recipe_content not between", value1, value2, "recipeContent");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdIsNull() {
            addCriterion("recipe_creator_id is null");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdIsNotNull() {
            addCriterion("recipe_creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdEqualTo(Long value) {
            addCriterion("recipe_creator_id =", value, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdNotEqualTo(Long value) {
            addCriterion("recipe_creator_id <>", value, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdGreaterThan(Long value) {
            addCriterion("recipe_creator_id >", value, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("recipe_creator_id >=", value, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdLessThan(Long value) {
            addCriterion("recipe_creator_id <", value, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("recipe_creator_id <=", value, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdIn(List<Long> values) {
            addCriterion("recipe_creator_id in", values, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdNotIn(List<Long> values) {
            addCriterion("recipe_creator_id not in", values, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdBetween(Long value1, Long value2) {
            addCriterion("recipe_creator_id between", value1, value2, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andRecipeCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("recipe_creator_id not between", value1, value2, "recipeCreatorId");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}