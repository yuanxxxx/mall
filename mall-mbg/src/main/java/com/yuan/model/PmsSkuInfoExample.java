package com.yuan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmsSkuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsSkuInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuDescIsNull() {
            addCriterion("sku_desc is null");
            return (Criteria) this;
        }

        public Criteria andSkuDescIsNotNull() {
            addCriterion("sku_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSkuDescEqualTo(String value) {
            addCriterion("sku_desc =", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotEqualTo(String value) {
            addCriterion("sku_desc <>", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescGreaterThan(String value) {
            addCriterion("sku_desc >", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescGreaterThanOrEqualTo(String value) {
            addCriterion("sku_desc >=", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescLessThan(String value) {
            addCriterion("sku_desc <", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescLessThanOrEqualTo(String value) {
            addCriterion("sku_desc <=", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescLike(String value) {
            addCriterion("sku_desc like", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotLike(String value) {
            addCriterion("sku_desc not like", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescIn(List<String> values) {
            addCriterion("sku_desc in", values, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotIn(List<String> values) {
            addCriterion("sku_desc not in", values, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescBetween(String value1, String value2) {
            addCriterion("sku_desc between", value1, value2, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotBetween(String value1, String value2) {
            addCriterion("sku_desc not between", value1, value2, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andTmIdIsNull() {
            addCriterion("tm_id is null");
            return (Criteria) this;
        }

        public Criteria andTmIdIsNotNull() {
            addCriterion("tm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTmIdEqualTo(Integer value) {
            addCriterion("tm_id =", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdNotEqualTo(Integer value) {
            addCriterion("tm_id <>", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdGreaterThan(Integer value) {
            addCriterion("tm_id >", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tm_id >=", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdLessThan(Integer value) {
            addCriterion("tm_id <", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdLessThanOrEqualTo(Integer value) {
            addCriterion("tm_id <=", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdIn(List<Integer> values) {
            addCriterion("tm_id in", values, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdNotIn(List<Integer> values) {
            addCriterion("tm_id not in", values, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdBetween(Integer value1, Integer value2) {
            addCriterion("tm_id between", value1, value2, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tm_id not between", value1, value2, "tmId");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdIsNull() {
            addCriterion("catalog3_id is null");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdIsNotNull() {
            addCriterion("catalog3_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdEqualTo(Integer value) {
            addCriterion("catalog3_id =", value, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdNotEqualTo(Integer value) {
            addCriterion("catalog3_id <>", value, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdGreaterThan(Integer value) {
            addCriterion("catalog3_id >", value, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("catalog3_id >=", value, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdLessThan(Integer value) {
            addCriterion("catalog3_id <", value, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdLessThanOrEqualTo(Integer value) {
            addCriterion("catalog3_id <=", value, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdIn(List<Integer> values) {
            addCriterion("catalog3_id in", values, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdNotIn(List<Integer> values) {
            addCriterion("catalog3_id not in", values, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdBetween(Integer value1, Integer value2) {
            addCriterion("catalog3_id between", value1, value2, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andCatalog3IdNotBetween(Integer value1, Integer value2) {
            addCriterion("catalog3_id not between", value1, value2, "catalog3Id");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgIsNull() {
            addCriterion("sku_default_img is null");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgIsNotNull() {
            addCriterion("sku_default_img is not null");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgEqualTo(String value) {
            addCriterion("sku_default_img =", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgNotEqualTo(String value) {
            addCriterion("sku_default_img <>", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgGreaterThan(String value) {
            addCriterion("sku_default_img >", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgGreaterThanOrEqualTo(String value) {
            addCriterion("sku_default_img >=", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgLessThan(String value) {
            addCriterion("sku_default_img <", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgLessThanOrEqualTo(String value) {
            addCriterion("sku_default_img <=", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgLike(String value) {
            addCriterion("sku_default_img like", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgNotLike(String value) {
            addCriterion("sku_default_img not like", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgIn(List<String> values) {
            addCriterion("sku_default_img in", values, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgNotIn(List<String> values) {
            addCriterion("sku_default_img not in", values, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgBetween(String value1, String value2) {
            addCriterion("sku_default_img between", value1, value2, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgNotBetween(String value1, String value2) {
            addCriterion("sku_default_img not between", value1, value2, "skuDefaultImg");
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