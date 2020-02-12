package com.jsh.erp.datasource.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FxSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FxSupplierExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSupplierDescIsNull() {
            addCriterion("supplier_desc is null");
            return (Criteria) this;
        }

        public Criteria andSupplierDescIsNotNull() {
            addCriterion("supplier_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierDescEqualTo(String value) {
            addCriterion("supplier_desc =", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescNotEqualTo(String value) {
            addCriterion("supplier_desc <>", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescGreaterThan(String value) {
            addCriterion("supplier_desc >", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_desc >=", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescLessThan(String value) {
            addCriterion("supplier_desc <", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescLessThanOrEqualTo(String value) {
            addCriterion("supplier_desc <=", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescLike(String value) {
            addCriterion("supplier_desc like", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescNotLike(String value) {
            addCriterion("supplier_desc not like", value, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescIn(List<String> values) {
            addCriterion("supplier_desc in", values, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescNotIn(List<String> values) {
            addCriterion("supplier_desc not in", values, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescBetween(String value1, String value2) {
            addCriterion("supplier_desc between", value1, value2, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierDescNotBetween(String value1, String value2) {
            addCriterion("supplier_desc not between", value1, value2, "supplierDesc");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNull() {
            addCriterion("supplier_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNotNull() {
            addCriterion("supplier_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeEqualTo(Integer value) {
            addCriterion("supplier_type =", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotEqualTo(Integer value) {
            addCriterion("supplier_type <>", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThan(Integer value) {
            addCriterion("supplier_type >", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_type >=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThan(Integer value) {
            addCriterion("supplier_type <", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_type <=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIn(List<Integer> values) {
            addCriterion("supplier_type in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotIn(List<Integer> values) {
            addCriterion("supplier_type not in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeBetween(Integer value1, Integer value2) {
            addCriterion("supplier_type between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_type not between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusIsNull() {
            addCriterion("supplier_status is null");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusIsNotNull() {
            addCriterion("supplier_status is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusEqualTo(Integer value) {
            addCriterion("supplier_status =", value, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusNotEqualTo(Integer value) {
            addCriterion("supplier_status <>", value, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusGreaterThan(Integer value) {
            addCriterion("supplier_status >", value, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_status >=", value, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusLessThan(Integer value) {
            addCriterion("supplier_status <", value, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_status <=", value, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusIn(List<Integer> values) {
            addCriterion("supplier_status in", values, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusNotIn(List<Integer> values) {
            addCriterion("supplier_status not in", values, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusBetween(Integer value1, Integer value2) {
            addCriterion("supplier_status between", value1, value2, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_status not between", value1, value2, "supplierStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDistributionDescIsNull() {
            addCriterion("distribution_desc is null");
            return (Criteria) this;
        }

        public Criteria andDistributionDescIsNotNull() {
            addCriterion("distribution_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionDescEqualTo(String value) {
            addCriterion("distribution_desc =", value, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescNotEqualTo(String value) {
            addCriterion("distribution_desc <>", value, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescGreaterThan(String value) {
            addCriterion("distribution_desc >", value, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescGreaterThanOrEqualTo(String value) {
            addCriterion("distribution_desc >=", value, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescLessThan(String value) {
            addCriterion("distribution_desc <", value, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescLessThanOrEqualTo(String value) {
            addCriterion("distribution_desc <=", value, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescLike(String value) {
            addCriterion("distribution_desc like", value, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescNotLike(String value) {
            addCriterion("distribution_desc not like", value, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescIn(List<String> values) {
            addCriterion("distribution_desc in", values, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescNotIn(List<String> values) {
            addCriterion("distribution_desc not in", values, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescBetween(String value1, String value2) {
            addCriterion("distribution_desc between", value1, value2, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andDistributionDescNotBetween(String value1, String value2) {
            addCriterion("distribution_desc not between", value1, value2, "distributionDesc");
            return (Criteria) this;
        }

        public Criteria andReturnAddrIsNull() {
            addCriterion("return_addr is null");
            return (Criteria) this;
        }

        public Criteria andReturnAddrIsNotNull() {
            addCriterion("return_addr is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAddrEqualTo(String value) {
            addCriterion("return_addr =", value, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrNotEqualTo(String value) {
            addCriterion("return_addr <>", value, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrGreaterThan(String value) {
            addCriterion("return_addr >", value, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrGreaterThanOrEqualTo(String value) {
            addCriterion("return_addr >=", value, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrLessThan(String value) {
            addCriterion("return_addr <", value, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrLessThanOrEqualTo(String value) {
            addCriterion("return_addr <=", value, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrLike(String value) {
            addCriterion("return_addr like", value, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrNotLike(String value) {
            addCriterion("return_addr not like", value, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrIn(List<String> values) {
            addCriterion("return_addr in", values, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrNotIn(List<String> values) {
            addCriterion("return_addr not in", values, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrBetween(String value1, String value2) {
            addCriterion("return_addr between", value1, value2, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andReturnAddrNotBetween(String value1, String value2) {
            addCriterion("return_addr not between", value1, value2, "returnAddr");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSupportExpressIsNull() {
            addCriterion("support_express is null");
            return (Criteria) this;
        }

        public Criteria andSupportExpressIsNotNull() {
            addCriterion("support_express is not null");
            return (Criteria) this;
        }

        public Criteria andSupportExpressEqualTo(String value) {
            addCriterion("support_express =", value, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressNotEqualTo(String value) {
            addCriterion("support_express <>", value, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressGreaterThan(String value) {
            addCriterion("support_express >", value, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressGreaterThanOrEqualTo(String value) {
            addCriterion("support_express >=", value, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressLessThan(String value) {
            addCriterion("support_express <", value, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressLessThanOrEqualTo(String value) {
            addCriterion("support_express <=", value, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressLike(String value) {
            addCriterion("support_express like", value, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressNotLike(String value) {
            addCriterion("support_express not like", value, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressIn(List<String> values) {
            addCriterion("support_express in", values, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressNotIn(List<String> values) {
            addCriterion("support_express not in", values, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressBetween(String value1, String value2) {
            addCriterion("support_express between", value1, value2, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andSupportExpressNotBetween(String value1, String value2) {
            addCriterion("support_express not between", value1, value2, "supportExpress");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationIsNull() {
            addCriterion("delivery_limitation is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationIsNotNull() {
            addCriterion("delivery_limitation is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationEqualTo(String value) {
            addCriterion("delivery_limitation =", value, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationNotEqualTo(String value) {
            addCriterion("delivery_limitation <>", value, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationGreaterThan(String value) {
            addCriterion("delivery_limitation >", value, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_limitation >=", value, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationLessThan(String value) {
            addCriterion("delivery_limitation <", value, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationLessThanOrEqualTo(String value) {
            addCriterion("delivery_limitation <=", value, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationLike(String value) {
            addCriterion("delivery_limitation like", value, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationNotLike(String value) {
            addCriterion("delivery_limitation not like", value, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationIn(List<String> values) {
            addCriterion("delivery_limitation in", values, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationNotIn(List<String> values) {
            addCriterion("delivery_limitation not in", values, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationBetween(String value1, String value2) {
            addCriterion("delivery_limitation between", value1, value2, "deliveryLimitation");
            return (Criteria) this;
        }

        public Criteria andDeliveryLimitationNotBetween(String value1, String value2) {
            addCriterion("delivery_limitation not between", value1, value2, "deliveryLimitation");
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