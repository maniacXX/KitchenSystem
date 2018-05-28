package com.kitchen.pojo;

import java.util.ArrayList;
import java.util.List;

public class RecipeTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecipeTypeExample() {
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

        public Criteria andRecipeTypeNameIsNull() {
            addCriterion("recipe_type_name is null");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameIsNotNull() {
            addCriterion("recipe_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameEqualTo(String value) {
            addCriterion("recipe_type_name =", value, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameNotEqualTo(String value) {
            addCriterion("recipe_type_name <>", value, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameGreaterThan(String value) {
            addCriterion("recipe_type_name >", value, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("recipe_type_name >=", value, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameLessThan(String value) {
            addCriterion("recipe_type_name <", value, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameLessThanOrEqualTo(String value) {
            addCriterion("recipe_type_name <=", value, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameLike(String value) {
            addCriterion("recipe_type_name like", value, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameNotLike(String value) {
            addCriterion("recipe_type_name not like", value, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameIn(List<String> values) {
            addCriterion("recipe_type_name in", values, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameNotIn(List<String> values) {
            addCriterion("recipe_type_name not in", values, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameBetween(String value1, String value2) {
            addCriterion("recipe_type_name between", value1, value2, "recipeTypeName");
            return (Criteria) this;
        }

        public Criteria andRecipeTypeNameNotBetween(String value1, String value2) {
            addCriterion("recipe_type_name not between", value1, value2, "recipeTypeName");
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