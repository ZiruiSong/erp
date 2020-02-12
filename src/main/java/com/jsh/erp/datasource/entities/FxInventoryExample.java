package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FxInventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FxInventoryExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andInvenIdIsNull() {
            addCriterion("inven_id is null");
            return (Criteria) this;
        }

        public Criteria andInvenIdIsNotNull() {
            addCriterion("inven_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvenIdEqualTo(Long value) {
            addCriterion("inven_id =", value, "invenId");
            return (Criteria) this;
        }

        public Criteria andInvenIdNotEqualTo(Long value) {
            addCriterion("inven_id <>", value, "invenId");
            return (Criteria) this;
        }

        public Criteria andInvenIdGreaterThan(Long value) {
            addCriterion("inven_id >", value, "invenId");
            return (Criteria) this;
        }

        public Criteria andInvenIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inven_id >=", value, "invenId");
            return (Criteria) this;
        }

        public Criteria andInvenIdLessThan(Long value) {
            addCriterion("inven_id <", value, "invenId");
            return (Criteria) this;
        }

        public Criteria andInvenIdLessThanOrEqualTo(Long value) {
            addCriterion("inven_id <=", value, "invenId");
            return (Criteria) this;
        }

        public Criteria andInvenIdIn(List<Long> values) {
            addCriterion("inven_id in", values, "invenId");
            return (Criteria) this;
        }

        public Criteria andInvenIdNotIn(List<Long> values) {
            addCriterion("inven_id not in", values, "invenId");
            return (Criteria) this;
        }

        public Criteria andInvenIdBetween(Long value1, Long value2) {
            addCriterion("inven_id between", value1, value2, "invenId");
            return (Criteria) this;
        }

        public Criteria andInvenIdNotBetween(Long value1, Long value2) {
            addCriterion("inven_id not between", value1, value2, "invenId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andInvenAgioIsNull() {
            addCriterion("inven_agio is null");
            return (Criteria) this;
        }

        public Criteria andInvenAgioIsNotNull() {
            addCriterion("inven_agio is not null");
            return (Criteria) this;
        }

        public Criteria andInvenAgioEqualTo(BigDecimal value) {
            addCriterion("inven_agio =", value, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenAgioNotEqualTo(BigDecimal value) {
            addCriterion("inven_agio <>", value, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenAgioGreaterThan(BigDecimal value) {
            addCriterion("inven_agio >", value, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenAgioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inven_agio >=", value, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenAgioLessThan(BigDecimal value) {
            addCriterion("inven_agio <", value, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenAgioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inven_agio <=", value, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenAgioIn(List<BigDecimal> values) {
            addCriterion("inven_agio in", values, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenAgioNotIn(List<BigDecimal> values) {
            addCriterion("inven_agio not in", values, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenAgioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inven_agio between", value1, value2, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenAgioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inven_agio not between", value1, value2, "invenAgio");
            return (Criteria) this;
        }

        public Criteria andInvenModelIsNull() {
            addCriterion("inven_model is null");
            return (Criteria) this;
        }

        public Criteria andInvenModelIsNotNull() {
            addCriterion("inven_model is not null");
            return (Criteria) this;
        }

        public Criteria andInvenModelEqualTo(String value) {
            addCriterion("inven_model =", value, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelNotEqualTo(String value) {
            addCriterion("inven_model <>", value, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelGreaterThan(String value) {
            addCriterion("inven_model >", value, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelGreaterThanOrEqualTo(String value) {
            addCriterion("inven_model >=", value, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelLessThan(String value) {
            addCriterion("inven_model <", value, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelLessThanOrEqualTo(String value) {
            addCriterion("inven_model <=", value, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelLike(String value) {
            addCriterion("inven_model like", value, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelNotLike(String value) {
            addCriterion("inven_model not like", value, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelIn(List<String> values) {
            addCriterion("inven_model in", values, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelNotIn(List<String> values) {
            addCriterion("inven_model not in", values, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelBetween(String value1, String value2) {
            addCriterion("inven_model between", value1, value2, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenModelNotBetween(String value1, String value2) {
            addCriterion("inven_model not between", value1, value2, "invenModel");
            return (Criteria) this;
        }

        public Criteria andInvenNumIsNull() {
            addCriterion("inven_num is null");
            return (Criteria) this;
        }

        public Criteria andInvenNumIsNotNull() {
            addCriterion("inven_num is not null");
            return (Criteria) this;
        }

        public Criteria andInvenNumEqualTo(Integer value) {
            addCriterion("inven_num =", value, "invenNum");
            return (Criteria) this;
        }

        public Criteria andInvenNumNotEqualTo(Integer value) {
            addCriterion("inven_num <>", value, "invenNum");
            return (Criteria) this;
        }

        public Criteria andInvenNumGreaterThan(Integer value) {
            addCriterion("inven_num >", value, "invenNum");
            return (Criteria) this;
        }

        public Criteria andInvenNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("inven_num >=", value, "invenNum");
            return (Criteria) this;
        }

        public Criteria andInvenNumLessThan(Integer value) {
            addCriterion("inven_num <", value, "invenNum");
            return (Criteria) this;
        }

        public Criteria andInvenNumLessThanOrEqualTo(Integer value) {
            addCriterion("inven_num <=", value, "invenNum");
            return (Criteria) this;
        }

        public Criteria andInvenNumIn(List<Integer> values) {
            addCriterion("inven_num in", values, "invenNum");
            return (Criteria) this;
        }

        public Criteria andInvenNumNotIn(List<Integer> values) {
            addCriterion("inven_num not in", values, "invenNum");
            return (Criteria) this;
        }

        public Criteria andInvenNumBetween(Integer value1, Integer value2) {
            addCriterion("inven_num between", value1, value2, "invenNum");
            return (Criteria) this;
        }

        public Criteria andInvenNumNotBetween(Integer value1, Integer value2) {
            addCriterion("inven_num not between", value1, value2, "invenNum");
            return (Criteria) this;
        }

        public Criteria andTagPriceIsNull() {
            addCriterion("tag_price is null");
            return (Criteria) this;
        }

        public Criteria andTagPriceIsNotNull() {
            addCriterion("tag_price is not null");
            return (Criteria) this;
        }

        public Criteria andTagPriceEqualTo(BigDecimal value) {
            addCriterion("tag_price =", value, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andTagPriceNotEqualTo(BigDecimal value) {
            addCriterion("tag_price <>", value, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andTagPriceGreaterThan(BigDecimal value) {
            addCriterion("tag_price >", value, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andTagPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tag_price >=", value, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andTagPriceLessThan(BigDecimal value) {
            addCriterion("tag_price <", value, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andTagPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tag_price <=", value, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andTagPriceIn(List<BigDecimal> values) {
            addCriterion("tag_price in", values, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andTagPriceNotIn(List<BigDecimal> values) {
            addCriterion("tag_price not in", values, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andTagPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tag_price between", value1, value2, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andTagPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tag_price not between", value1, value2, "tagPrice");
            return (Criteria) this;
        }

        public Criteria andInvenSizeIsNull() {
            addCriterion("inven_size is null");
            return (Criteria) this;
        }

        public Criteria andInvenSizeIsNotNull() {
            addCriterion("inven_size is not null");
            return (Criteria) this;
        }

        public Criteria andInvenSizeEqualTo(String value) {
            addCriterion("inven_size =", value, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeNotEqualTo(String value) {
            addCriterion("inven_size <>", value, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeGreaterThan(String value) {
            addCriterion("inven_size >", value, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeGreaterThanOrEqualTo(String value) {
            addCriterion("inven_size >=", value, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeLessThan(String value) {
            addCriterion("inven_size <", value, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeLessThanOrEqualTo(String value) {
            addCriterion("inven_size <=", value, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeLike(String value) {
            addCriterion("inven_size like", value, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeNotLike(String value) {
            addCriterion("inven_size not like", value, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeIn(List<String> values) {
            addCriterion("inven_size in", values, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeNotIn(List<String> values) {
            addCriterion("inven_size not in", values, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeBetween(String value1, String value2) {
            addCriterion("inven_size between", value1, value2, "invenSize");
            return (Criteria) this;
        }

        public Criteria andInvenSizeNotBetween(String value1, String value2) {
            addCriterion("inven_size not between", value1, value2, "invenSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeIsNull() {
            addCriterion("ori_size is null");
            return (Criteria) this;
        }

        public Criteria andOriSizeIsNotNull() {
            addCriterion("ori_size is not null");
            return (Criteria) this;
        }

        public Criteria andOriSizeEqualTo(String value) {
            addCriterion("ori_size =", value, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeNotEqualTo(String value) {
            addCriterion("ori_size <>", value, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeGreaterThan(String value) {
            addCriterion("ori_size >", value, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ori_size >=", value, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeLessThan(String value) {
            addCriterion("ori_size <", value, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeLessThanOrEqualTo(String value) {
            addCriterion("ori_size <=", value, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeLike(String value) {
            addCriterion("ori_size like", value, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeNotLike(String value) {
            addCriterion("ori_size not like", value, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeIn(List<String> values) {
            addCriterion("ori_size in", values, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeNotIn(List<String> values) {
            addCriterion("ori_size not in", values, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeBetween(String value1, String value2) {
            addCriterion("ori_size between", value1, value2, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriSizeNotBetween(String value1, String value2) {
            addCriterion("ori_size not between", value1, value2, "oriSize");
            return (Criteria) this;
        }

        public Criteria andOriModelIsNull() {
            addCriterion("ori_model is null");
            return (Criteria) this;
        }

        public Criteria andOriModelIsNotNull() {
            addCriterion("ori_model is not null");
            return (Criteria) this;
        }

        public Criteria andOriModelEqualTo(String value) {
            addCriterion("ori_model =", value, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelNotEqualTo(String value) {
            addCriterion("ori_model <>", value, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelGreaterThan(String value) {
            addCriterion("ori_model >", value, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelGreaterThanOrEqualTo(String value) {
            addCriterion("ori_model >=", value, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelLessThan(String value) {
            addCriterion("ori_model <", value, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelLessThanOrEqualTo(String value) {
            addCriterion("ori_model <=", value, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelLike(String value) {
            addCriterion("ori_model like", value, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelNotLike(String value) {
            addCriterion("ori_model not like", value, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelIn(List<String> values) {
            addCriterion("ori_model in", values, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelNotIn(List<String> values) {
            addCriterion("ori_model not in", values, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelBetween(String value1, String value2) {
            addCriterion("ori_model between", value1, value2, "oriModel");
            return (Criteria) this;
        }

        public Criteria andOriModelNotBetween(String value1, String value2) {
            addCriterion("ori_model not between", value1, value2, "oriModel");
            return (Criteria) this;
        }

        public Criteria andStandardSizeIsNull() {
            addCriterion("standard_size is null");
            return (Criteria) this;
        }

        public Criteria andStandardSizeIsNotNull() {
            addCriterion("standard_size is not null");
            return (Criteria) this;
        }

        public Criteria andStandardSizeEqualTo(String value) {
            addCriterion("standard_size =", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeNotEqualTo(String value) {
            addCriterion("standard_size <>", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeGreaterThan(String value) {
            addCriterion("standard_size >", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeGreaterThanOrEqualTo(String value) {
            addCriterion("standard_size >=", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeLessThan(String value) {
            addCriterion("standard_size <", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeLessThanOrEqualTo(String value) {
            addCriterion("standard_size <=", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeLike(String value) {
            addCriterion("standard_size like", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeNotLike(String value) {
            addCriterion("standard_size not like", value, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeIn(List<String> values) {
            addCriterion("standard_size in", values, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeNotIn(List<String> values) {
            addCriterion("standard_size not in", values, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeBetween(String value1, String value2) {
            addCriterion("standard_size between", value1, value2, "standardSize");
            return (Criteria) this;
        }

        public Criteria andStandardSizeNotBetween(String value1, String value2) {
            addCriterion("standard_size not between", value1, value2, "standardSize");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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