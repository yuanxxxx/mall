package com.yuan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsCartItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsCartItemExample() {
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

        public Criteria andProductSkuIdIsNull() {
            addCriterion("product_sku_id is null");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdIsNotNull() {
            addCriterion("product_sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdEqualTo(Integer value) {
            addCriterion("product_sku_id =", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdNotEqualTo(Integer value) {
            addCriterion("product_sku_id <>", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdGreaterThan(Integer value) {
            addCriterion("product_sku_id >", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_sku_id >=", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdLessThan(Integer value) {
            addCriterion("product_sku_id <", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_sku_id <=", value, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdIn(List<Integer> values) {
            addCriterion("product_sku_id in", values, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdNotIn(List<Integer> values) {
            addCriterion("product_sku_id not in", values, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("product_sku_id between", value1, value2, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_sku_id not between", value1, value2, "productSkuId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andSp1IsNull() {
            addCriterion("sp1 is null");
            return (Criteria) this;
        }

        public Criteria andSp1IsNotNull() {
            addCriterion("sp1 is not null");
            return (Criteria) this;
        }

        public Criteria andSp1EqualTo(String value) {
            addCriterion("sp1 =", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1NotEqualTo(String value) {
            addCriterion("sp1 <>", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1GreaterThan(String value) {
            addCriterion("sp1 >", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1GreaterThanOrEqualTo(String value) {
            addCriterion("sp1 >=", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1LessThan(String value) {
            addCriterion("sp1 <", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1LessThanOrEqualTo(String value) {
            addCriterion("sp1 <=", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1Like(String value) {
            addCriterion("sp1 like", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1NotLike(String value) {
            addCriterion("sp1 not like", value, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1In(List<String> values) {
            addCriterion("sp1 in", values, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1NotIn(List<String> values) {
            addCriterion("sp1 not in", values, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1Between(String value1, String value2) {
            addCriterion("sp1 between", value1, value2, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp1NotBetween(String value1, String value2) {
            addCriterion("sp1 not between", value1, value2, "sp1");
            return (Criteria) this;
        }

        public Criteria andSp2IsNull() {
            addCriterion("sp2 is null");
            return (Criteria) this;
        }

        public Criteria andSp2IsNotNull() {
            addCriterion("sp2 is not null");
            return (Criteria) this;
        }

        public Criteria andSp2EqualTo(String value) {
            addCriterion("sp2 =", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2NotEqualTo(String value) {
            addCriterion("sp2 <>", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2GreaterThan(String value) {
            addCriterion("sp2 >", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2GreaterThanOrEqualTo(String value) {
            addCriterion("sp2 >=", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2LessThan(String value) {
            addCriterion("sp2 <", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2LessThanOrEqualTo(String value) {
            addCriterion("sp2 <=", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2Like(String value) {
            addCriterion("sp2 like", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2NotLike(String value) {
            addCriterion("sp2 not like", value, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2In(List<String> values) {
            addCriterion("sp2 in", values, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2NotIn(List<String> values) {
            addCriterion("sp2 not in", values, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2Between(String value1, String value2) {
            addCriterion("sp2 between", value1, value2, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp2NotBetween(String value1, String value2) {
            addCriterion("sp2 not between", value1, value2, "sp2");
            return (Criteria) this;
        }

        public Criteria andSp3IsNull() {
            addCriterion("sp3 is null");
            return (Criteria) this;
        }

        public Criteria andSp3IsNotNull() {
            addCriterion("sp3 is not null");
            return (Criteria) this;
        }

        public Criteria andSp3EqualTo(String value) {
            addCriterion("sp3 =", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3NotEqualTo(String value) {
            addCriterion("sp3 <>", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3GreaterThan(String value) {
            addCriterion("sp3 >", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3GreaterThanOrEqualTo(String value) {
            addCriterion("sp3 >=", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3LessThan(String value) {
            addCriterion("sp3 <", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3LessThanOrEqualTo(String value) {
            addCriterion("sp3 <=", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3Like(String value) {
            addCriterion("sp3 like", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3NotLike(String value) {
            addCriterion("sp3 not like", value, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3In(List<String> values) {
            addCriterion("sp3 in", values, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3NotIn(List<String> values) {
            addCriterion("sp3 not in", values, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3Between(String value1, String value2) {
            addCriterion("sp3 between", value1, value2, "sp3");
            return (Criteria) this;
        }

        public Criteria andSp3NotBetween(String value1, String value2) {
            addCriterion("sp3 not between", value1, value2, "sp3");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNull() {
            addCriterion("product_pic is null");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNotNull() {
            addCriterion("product_pic is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicEqualTo(String value) {
            addCriterion("product_pic =", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotEqualTo(String value) {
            addCriterion("product_pic <>", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThan(String value) {
            addCriterion("product_pic >", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThanOrEqualTo(String value) {
            addCriterion("product_pic >=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThan(String value) {
            addCriterion("product_pic <", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThanOrEqualTo(String value) {
            addCriterion("product_pic <=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLike(String value) {
            addCriterion("product_pic like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotLike(String value) {
            addCriterion("product_pic not like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicIn(List<String> values) {
            addCriterion("product_pic in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotIn(List<String> values) {
            addCriterion("product_pic not in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicBetween(String value1, String value2) {
            addCriterion("product_pic between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotBetween(String value1, String value2) {
            addCriterion("product_pic not between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleIsNull() {
            addCriterion("product_sub_title is null");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleIsNotNull() {
            addCriterion("product_sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleEqualTo(String value) {
            addCriterion("product_sub_title =", value, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleNotEqualTo(String value) {
            addCriterion("product_sub_title <>", value, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleGreaterThan(String value) {
            addCriterion("product_sub_title >", value, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("product_sub_title >=", value, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleLessThan(String value) {
            addCriterion("product_sub_title <", value, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleLessThanOrEqualTo(String value) {
            addCriterion("product_sub_title <=", value, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleLike(String value) {
            addCriterion("product_sub_title like", value, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleNotLike(String value) {
            addCriterion("product_sub_title not like", value, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleIn(List<String> values) {
            addCriterion("product_sub_title in", values, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleNotIn(List<String> values) {
            addCriterion("product_sub_title not in", values, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleBetween(String value1, String value2) {
            addCriterion("product_sub_title between", value1, value2, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andProductSubTitleNotBetween(String value1, String value2) {
            addCriterion("product_sub_title not between", value1, value2, "productSubTitle");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(Integer value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(Integer value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(Integer value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(Integer value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<Integer> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<Integer> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(Integer value1, Integer value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(Integer value) {
            addCriterion("product_category_id =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(Integer value) {
            addCriterion("product_category_id <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(Integer value) {
            addCriterion("product_category_id >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_category_id >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(Integer value) {
            addCriterion("product_category_id <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_category_id <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<Integer> values) {
            addCriterion("product_category_id in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<Integer> values) {
            addCriterion("product_category_id not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("product_category_id between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_category_id not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIsNull() {
            addCriterion("product_brand is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIsNotNull() {
            addCriterion("product_brand is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandEqualTo(String value) {
            addCriterion("product_brand =", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotEqualTo(String value) {
            addCriterion("product_brand <>", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandGreaterThan(String value) {
            addCriterion("product_brand >", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandGreaterThanOrEqualTo(String value) {
            addCriterion("product_brand >=", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLessThan(String value) {
            addCriterion("product_brand <", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLessThanOrEqualTo(String value) {
            addCriterion("product_brand <=", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLike(String value) {
            addCriterion("product_brand like", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotLike(String value) {
            addCriterion("product_brand not like", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandIn(List<String> values) {
            addCriterion("product_brand in", values, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotIn(List<String> values) {
            addCriterion("product_brand not in", values, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandBetween(String value1, String value2) {
            addCriterion("product_brand between", value1, value2, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotBetween(String value1, String value2) {
            addCriterion("product_brand not between", value1, value2, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNull() {
            addCriterion("product_sn is null");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNotNull() {
            addCriterion("product_sn is not null");
            return (Criteria) this;
        }

        public Criteria andProductSnEqualTo(String value) {
            addCriterion("product_sn =", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotEqualTo(String value) {
            addCriterion("product_sn <>", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThan(String value) {
            addCriterion("product_sn >", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThanOrEqualTo(String value) {
            addCriterion("product_sn >=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThan(String value) {
            addCriterion("product_sn <", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThanOrEqualTo(String value) {
            addCriterion("product_sn <=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLike(String value) {
            addCriterion("product_sn like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotLike(String value) {
            addCriterion("product_sn not like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnIn(List<String> values) {
            addCriterion("product_sn in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotIn(List<String> values) {
            addCriterion("product_sn not in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnBetween(String value1, String value2) {
            addCriterion("product_sn between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotBetween(String value1, String value2) {
            addCriterion("product_sn not between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductAttrIsNull() {
            addCriterion("product_attr is null");
            return (Criteria) this;
        }

        public Criteria andProductAttrIsNotNull() {
            addCriterion("product_attr is not null");
            return (Criteria) this;
        }

        public Criteria andProductAttrEqualTo(String value) {
            addCriterion("product_attr =", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrNotEqualTo(String value) {
            addCriterion("product_attr <>", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrGreaterThan(String value) {
            addCriterion("product_attr >", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrGreaterThanOrEqualTo(String value) {
            addCriterion("product_attr >=", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrLessThan(String value) {
            addCriterion("product_attr <", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrLessThanOrEqualTo(String value) {
            addCriterion("product_attr <=", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrLike(String value) {
            addCriterion("product_attr like", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrNotLike(String value) {
            addCriterion("product_attr not like", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrIn(List<String> values) {
            addCriterion("product_attr in", values, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrNotIn(List<String> values) {
            addCriterion("product_attr not in", values, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrBetween(String value1, String value2) {
            addCriterion("product_attr between", value1, value2, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrNotBetween(String value1, String value2) {
            addCriterion("product_attr not between", value1, value2, "productAttr");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceIsNull() {
            addCriterion("cart_all_price is null");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceIsNotNull() {
            addCriterion("cart_all_price is not null");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceEqualTo(String value) {
            addCriterion("cart_all_price =", value, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceNotEqualTo(String value) {
            addCriterion("cart_all_price <>", value, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceGreaterThan(String value) {
            addCriterion("cart_all_price >", value, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceGreaterThanOrEqualTo(String value) {
            addCriterion("cart_all_price >=", value, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceLessThan(String value) {
            addCriterion("cart_all_price <", value, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceLessThanOrEqualTo(String value) {
            addCriterion("cart_all_price <=", value, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceLike(String value) {
            addCriterion("cart_all_price like", value, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceNotLike(String value) {
            addCriterion("cart_all_price not like", value, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceIn(List<String> values) {
            addCriterion("cart_all_price in", values, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceNotIn(List<String> values) {
            addCriterion("cart_all_price not in", values, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceBetween(String value1, String value2) {
            addCriterion("cart_all_price between", value1, value2, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andCartAllPriceNotBetween(String value1, String value2) {
            addCriterion("cart_all_price not between", value1, value2, "cartAllPrice");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNull() {
            addCriterion("is_checked is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNotNull() {
            addCriterion("is_checked is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedEqualTo(Integer value) {
            addCriterion("is_checked =", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotEqualTo(Integer value) {
            addCriterion("is_checked <>", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThan(Integer value) {
            addCriterion("is_checked >", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_checked >=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThan(Integer value) {
            addCriterion("is_checked <", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThanOrEqualTo(Integer value) {
            addCriterion("is_checked <=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIn(List<Integer> values) {
            addCriterion("is_checked in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotIn(List<Integer> values) {
            addCriterion("is_checked not in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedBetween(Integer value1, Integer value2) {
            addCriterion("is_checked between", value1, value2, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_checked not between", value1, value2, "isChecked");
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