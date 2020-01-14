package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FxExpressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FxExpressExample() {
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

        public Criteria andExpressCodeIsNull() {
            addCriterion("express_code is null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIsNotNull() {
            addCriterion("express_code is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeEqualTo(String value) {
            addCriterion("express_code =", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotEqualTo(String value) {
            addCriterion("express_code <>", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThan(String value) {
            addCriterion("express_code >", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThanOrEqualTo(String value) {
            addCriterion("express_code >=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThan(String value) {
            addCriterion("express_code <", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThanOrEqualTo(String value) {
            addCriterion("express_code <=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLike(String value) {
            addCriterion("express_code like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotLike(String value) {
            addCriterion("express_code not like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIn(List<String> values) {
            addCriterion("express_code in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotIn(List<String> values) {
            addCriterion("express_code not in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeBetween(String value1, String value2) {
            addCriterion("express_code between", value1, value2, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotBetween(String value1, String value2) {
            addCriterion("express_code not between", value1, value2, "expressCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeIsNull() {
            addCriterion("jd_code is null");
            return (Criteria) this;
        }

        public Criteria andJdCodeIsNotNull() {
            addCriterion("jd_code is not null");
            return (Criteria) this;
        }

        public Criteria andJdCodeEqualTo(String value) {
            addCriterion("jd_code =", value, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeNotEqualTo(String value) {
            addCriterion("jd_code <>", value, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeGreaterThan(String value) {
            addCriterion("jd_code >", value, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("jd_code >=", value, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeLessThan(String value) {
            addCriterion("jd_code <", value, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeLessThanOrEqualTo(String value) {
            addCriterion("jd_code <=", value, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeLike(String value) {
            addCriterion("jd_code like", value, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeNotLike(String value) {
            addCriterion("jd_code not like", value, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeIn(List<String> values) {
            addCriterion("jd_code in", values, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeNotIn(List<String> values) {
            addCriterion("jd_code not in", values, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeBetween(String value1, String value2) {
            addCriterion("jd_code between", value1, value2, "jdCode");
            return (Criteria) this;
        }

        public Criteria andJdCodeNotBetween(String value1, String value2) {
            addCriterion("jd_code not between", value1, value2, "jdCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeIsNull() {
            addCriterion("tb_code is null");
            return (Criteria) this;
        }

        public Criteria andTbCodeIsNotNull() {
            addCriterion("tb_code is not null");
            return (Criteria) this;
        }

        public Criteria andTbCodeEqualTo(String value) {
            addCriterion("tb_code =", value, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeNotEqualTo(String value) {
            addCriterion("tb_code <>", value, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeGreaterThan(String value) {
            addCriterion("tb_code >", value, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tb_code >=", value, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeLessThan(String value) {
            addCriterion("tb_code <", value, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeLessThanOrEqualTo(String value) {
            addCriterion("tb_code <=", value, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeLike(String value) {
            addCriterion("tb_code like", value, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeNotLike(String value) {
            addCriterion("tb_code not like", value, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeIn(List<String> values) {
            addCriterion("tb_code in", values, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeNotIn(List<String> values) {
            addCriterion("tb_code not in", values, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeBetween(String value1, String value2) {
            addCriterion("tb_code between", value1, value2, "tbCode");
            return (Criteria) this;
        }

        public Criteria andTbCodeNotBetween(String value1, String value2) {
            addCriterion("tb_code not between", value1, value2, "tbCode");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNull() {
            addCriterion("express_name is null");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNotNull() {
            addCriterion("express_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNameEqualTo(String value) {
            addCriterion("express_name =", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotEqualTo(String value) {
            addCriterion("express_name <>", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThan(String value) {
            addCriterion("express_name >", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThanOrEqualTo(String value) {
            addCriterion("express_name >=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThan(String value) {
            addCriterion("express_name <", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThanOrEqualTo(String value) {
            addCriterion("express_name <=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLike(String value) {
            addCriterion("express_name like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotLike(String value) {
            addCriterion("express_name not like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameIn(List<String> values) {
            addCriterion("express_name in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotIn(List<String> values) {
            addCriterion("express_name not in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameBetween(String value1, String value2) {
            addCriterion("express_name between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotBetween(String value1, String value2) {
            addCriterion("express_name not between", value1, value2, "expressName");
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

        public Criteria andFirstPriceIsNull() {
            addCriterion("first_price is null");
            return (Criteria) this;
        }

        public Criteria andFirstPriceIsNotNull() {
            addCriterion("first_price is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPriceEqualTo(BigDecimal value) {
            addCriterion("first_price =", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceNotEqualTo(BigDecimal value) {
            addCriterion("first_price <>", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceGreaterThan(BigDecimal value) {
            addCriterion("first_price >", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_price >=", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceLessThan(BigDecimal value) {
            addCriterion("first_price <", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_price <=", value, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceIn(List<BigDecimal> values) {
            addCriterion("first_price in", values, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceNotIn(List<BigDecimal> values) {
            addCriterion("first_price not in", values, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_price between", value1, value2, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andFirstPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_price not between", value1, value2, "firstPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceIsNull() {
            addCriterion("continuous_price is null");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceIsNotNull() {
            addCriterion("continuous_price is not null");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceEqualTo(BigDecimal value) {
            addCriterion("continuous_price =", value, "continuousPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceNotEqualTo(BigDecimal value) {
            addCriterion("continuous_price <>", value, "continuousPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceGreaterThan(BigDecimal value) {
            addCriterion("continuous_price >", value, "continuousPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continuous_price >=", value, "continuousPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceLessThan(BigDecimal value) {
            addCriterion("continuous_price <", value, "continuousPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continuous_price <=", value, "continuousPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceIn(List<BigDecimal> values) {
            addCriterion("continuous_price in", values, "continuousPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceNotIn(List<BigDecimal> values) {
            addCriterion("continuous_price not in", values, "continuousPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continuous_price between", value1, value2, "continuousPrice");
            return (Criteria) this;
        }

        public Criteria andContinuousPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continuous_price not between", value1, value2, "continuousPrice");
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