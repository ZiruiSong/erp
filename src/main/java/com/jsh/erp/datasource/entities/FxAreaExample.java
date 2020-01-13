package com.jsh.erp.datasource.entities;

import java.util.ArrayList;
import java.util.List;

public class FxAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FxAreaExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdIsNull() {
            addCriterion("area_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdIsNotNull() {
            addCriterion("area_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdEqualTo(Integer value) {
            addCriterion("area_parent_id =", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotEqualTo(Integer value) {
            addCriterion("area_parent_id <>", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdGreaterThan(Integer value) {
            addCriterion("area_parent_id >", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_parent_id >=", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdLessThan(Integer value) {
            addCriterion("area_parent_id <", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_parent_id <=", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdIn(List<Integer> values) {
            addCriterion("area_parent_id in", values, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotIn(List<Integer> values) {
            addCriterion("area_parent_id not in", values, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdBetween(Integer value1, Integer value2) {
            addCriterion("area_parent_id between", value1, value2, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_parent_id not between", value1, value2, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaZipIsNull() {
            addCriterion("area_zip is null");
            return (Criteria) this;
        }

        public Criteria andAreaZipIsNotNull() {
            addCriterion("area_zip is not null");
            return (Criteria) this;
        }

        public Criteria andAreaZipEqualTo(String value) {
            addCriterion("area_zip =", value, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipNotEqualTo(String value) {
            addCriterion("area_zip <>", value, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipGreaterThan(String value) {
            addCriterion("area_zip >", value, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipGreaterThanOrEqualTo(String value) {
            addCriterion("area_zip >=", value, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipLessThan(String value) {
            addCriterion("area_zip <", value, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipLessThanOrEqualTo(String value) {
            addCriterion("area_zip <=", value, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipLike(String value) {
            addCriterion("area_zip like", value, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipNotLike(String value) {
            addCriterion("area_zip not like", value, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipIn(List<String> values) {
            addCriterion("area_zip in", values, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipNotIn(List<String> values) {
            addCriterion("area_zip not in", values, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipBetween(String value1, String value2) {
            addCriterion("area_zip between", value1, value2, "areaZip");
            return (Criteria) this;
        }

        public Criteria andAreaZipNotBetween(String value1, String value2) {
            addCriterion("area_zip not between", value1, value2, "areaZip");
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