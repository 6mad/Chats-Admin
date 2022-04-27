package com.hubin.chats.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsbbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public XsbbExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andResponderIsNull() {
            addCriterion("responder is null");
            return (Criteria) this;
        }

        public Criteria andResponderIsNotNull() {
            addCriterion("responder is not null");
            return (Criteria) this;
        }

        public Criteria andResponderEqualTo(Integer value) {
            addCriterion("responder =", value, "responder");
            return (Criteria) this;
        }

        public Criteria andResponderNotEqualTo(Integer value) {
            addCriterion("responder <>", value, "responder");
            return (Criteria) this;
        }

        public Criteria andResponderGreaterThan(Integer value) {
            addCriterion("responder >", value, "responder");
            return (Criteria) this;
        }

        public Criteria andResponderGreaterThanOrEqualTo(Integer value) {
            addCriterion("responder >=", value, "responder");
            return (Criteria) this;
        }

        public Criteria andResponderLessThan(Integer value) {
            addCriterion("responder <", value, "responder");
            return (Criteria) this;
        }

        public Criteria andResponderLessThanOrEqualTo(Integer value) {
            addCriterion("responder <=", value, "responder");
            return (Criteria) this;
        }

        public Criteria andResponderIn(List<Integer> values) {
            addCriterion("responder in", values, "responder");
            return (Criteria) this;
        }

        public Criteria andResponderNotIn(List<Integer> values) {
            addCriterion("responder not in", values, "responder");
            return (Criteria) this;
        }

        public Criteria andResponderBetween(Integer value1, Integer value2) {
            addCriterion("responder between", value1, value2, "responder");
            return (Criteria) this;
        }

        public Criteria andResponderNotBetween(Integer value1, Integer value2) {
            addCriterion("responder not between", value1, value2, "responder");
            return (Criteria) this;
        }

        public Criteria andChatsIdIsNull() {
            addCriterion("chats_id is null");
            return (Criteria) this;
        }

        public Criteria andChatsIdIsNotNull() {
            addCriterion("chats_id is not null");
            return (Criteria) this;
        }

        public Criteria andChatsIdEqualTo(Integer value) {
            addCriterion("chats_id =", value, "chatsId");
            return (Criteria) this;
        }

        public Criteria andChatsIdNotEqualTo(Integer value) {
            addCriterion("chats_id <>", value, "chatsId");
            return (Criteria) this;
        }

        public Criteria andChatsIdGreaterThan(Integer value) {
            addCriterion("chats_id >", value, "chatsId");
            return (Criteria) this;
        }

        public Criteria andChatsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chats_id >=", value, "chatsId");
            return (Criteria) this;
        }

        public Criteria andChatsIdLessThan(Integer value) {
            addCriterion("chats_id <", value, "chatsId");
            return (Criteria) this;
        }

        public Criteria andChatsIdLessThanOrEqualTo(Integer value) {
            addCriterion("chats_id <=", value, "chatsId");
            return (Criteria) this;
        }

        public Criteria andChatsIdIn(List<Integer> values) {
            addCriterion("chats_id in", values, "chatsId");
            return (Criteria) this;
        }

        public Criteria andChatsIdNotIn(List<Integer> values) {
            addCriterion("chats_id not in", values, "chatsId");
            return (Criteria) this;
        }

        public Criteria andChatsIdBetween(Integer value1, Integer value2) {
            addCriterion("chats_id between", value1, value2, "chatsId");
            return (Criteria) this;
        }

        public Criteria andChatsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chats_id not between", value1, value2, "chatsId");
            return (Criteria) this;
        }

        public Criteria andRespondIsNull() {
            addCriterion("respond is null");
            return (Criteria) this;
        }

        public Criteria andRespondIsNotNull() {
            addCriterion("respond is not null");
            return (Criteria) this;
        }

        public Criteria andRespondEqualTo(String value) {
            addCriterion("respond =", value, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondNotEqualTo(String value) {
            addCriterion("respond <>", value, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondGreaterThan(String value) {
            addCriterion("respond >", value, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondGreaterThanOrEqualTo(String value) {
            addCriterion("respond >=", value, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondLessThan(String value) {
            addCriterion("respond <", value, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondLessThanOrEqualTo(String value) {
            addCriterion("respond <=", value, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondLike(String value) {
            addCriterion("respond like", value, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondNotLike(String value) {
            addCriterion("respond not like", value, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondIn(List<String> values) {
            addCriterion("respond in", values, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondNotIn(List<String> values) {
            addCriterion("respond not in", values, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondBetween(String value1, String value2) {
            addCriterion("respond between", value1, value2, "respond");
            return (Criteria) this;
        }

        public Criteria andRespondNotBetween(String value1, String value2) {
            addCriterion("respond not between", value1, value2, "respond");
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
    }

    /**
     */
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