package com.eye.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EyeGrouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EyeGrouponExample() {
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

    public EyeGrouponExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public EyeGrouponExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        EyeGrouponExample example = new EyeGrouponExample();
        return example.createCriteria();
    }

    public EyeGrouponExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public EyeGrouponExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
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

        public Criteria andIdEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("order_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("order_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("order_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("order_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("order_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("order_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdIsNull() {
            addCriterion("groupon_id is null");
            return (Criteria) this;
        }

        public Criteria andGrouponIdIsNotNull() {
            addCriterion("groupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrouponIdEqualTo(Integer value) {
            addCriterion("groupon_id =", value, "grouponId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("groupon_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrouponIdNotEqualTo(Integer value) {
            addCriterion("groupon_id <>", value, "grouponId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("groupon_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrouponIdGreaterThan(Integer value) {
            addCriterion("groupon_id >", value, "grouponId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("groupon_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupon_id >=", value, "grouponId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("groupon_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrouponIdLessThan(Integer value) {
            addCriterion("groupon_id <", value, "grouponId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("groupon_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("groupon_id <=", value, "grouponId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("groupon_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrouponIdIn(List<Integer> values) {
            addCriterion("groupon_id in", values, "grouponId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdNotIn(List<Integer> values) {
            addCriterion("groupon_id not in", values, "grouponId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdBetween(Integer value1, Integer value2) {
            addCriterion("groupon_id between", value1, value2, "grouponId");
            return (Criteria) this;
        }

        public Criteria andGrouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("groupon_id not between", value1, value2, "grouponId");
            return (Criteria) this;
        }

        public Criteria andRulesIdIsNull() {
            addCriterion("rules_id is null");
            return (Criteria) this;
        }

        public Criteria andRulesIdIsNotNull() {
            addCriterion("rules_id is not null");
            return (Criteria) this;
        }

        public Criteria andRulesIdEqualTo(Integer value) {
            addCriterion("rules_id =", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("rules_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRulesIdNotEqualTo(Integer value) {
            addCriterion("rules_id <>", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("rules_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRulesIdGreaterThan(Integer value) {
            addCriterion("rules_id >", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("rules_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRulesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rules_id >=", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("rules_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRulesIdLessThan(Integer value) {
            addCriterion("rules_id <", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("rules_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRulesIdLessThanOrEqualTo(Integer value) {
            addCriterion("rules_id <=", value, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("rules_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRulesIdIn(List<Integer> values) {
            addCriterion("rules_id in", values, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdNotIn(List<Integer> values) {
            addCriterion("rules_id not in", values, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdBetween(Integer value1, Integer value2) {
            addCriterion("rules_id between", value1, value2, "rulesId");
            return (Criteria) this;
        }

        public Criteria andRulesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rules_id not between", value1, value2, "rulesId");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNull() {
            addCriterion("share_url is null");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNotNull() {
            addCriterion("share_url is not null");
            return (Criteria) this;
        }

        public Criteria andShareUrlEqualTo(String value) {
            addCriterion("share_url =", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("share_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareUrlNotEqualTo(String value) {
            addCriterion("share_url <>", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("share_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThan(String value) {
            addCriterion("share_url >", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("share_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("share_url >=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("share_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThan(String value) {
            addCriterion("share_url <", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("share_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThanOrEqualTo(String value) {
            addCriterion("share_url <=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("share_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShareUrlLike(String value) {
            addCriterion("share_url like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotLike(String value) {
            addCriterion("share_url not like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlIn(List<String> values) {
            addCriterion("share_url in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotIn(List<String> values) {
            addCriterion("share_url not in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlBetween(String value1, String value2) {
            addCriterion("share_url between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotBetween(String value1, String value2) {
            addCriterion("share_url not between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIsNull() {
            addCriterion("creator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIsNotNull() {
            addCriterion("creator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdEqualTo(Integer value) {
            addCriterion("creator_user_id =", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotEqualTo(Integer value) {
            addCriterion("creator_user_id <>", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThan(Integer value) {
            addCriterion("creator_user_id >", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_user_id >=", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThan(Integer value) {
            addCriterion("creator_user_id <", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_user_id <=", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIn(List<Integer> values) {
            addCriterion("creator_user_id in", values, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotIn(List<Integer> values) {
            addCriterion("creator_user_id not in", values, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_user_id between", value1, value2, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_user_id not between", value1, value2, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeIsNull() {
            addCriterion("creator_user_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeIsNotNull() {
            addCriterion("creator_user_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeEqualTo(LocalDateTime value) {
            addCriterion("creator_user_time =", value, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeNotEqualTo(LocalDateTime value) {
            addCriterion("creator_user_time <>", value, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeGreaterThan(LocalDateTime value) {
            addCriterion("creator_user_time >", value, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("creator_user_time >=", value, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeLessThan(LocalDateTime value) {
            addCriterion("creator_user_time <", value, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("creator_user_time <=", value, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("creator_user_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeIn(List<LocalDateTime> values) {
            addCriterion("creator_user_time in", values, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeNotIn(List<LocalDateTime> values) {
            addCriterion("creator_user_time not in", values, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("creator_user_time between", value1, value2, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andCreatorUserTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("creator_user_time not between", value1, value2, "creatorUserTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("`status` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("`status` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("`status` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("`status` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("`status` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("`status` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(LocalDateTime value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("add_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("add_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(LocalDateTime value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("add_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("add_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(LocalDateTime value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("add_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("add_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<LocalDateTime> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<LocalDateTime> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(EyeGroupon.Column column) {
            addCriterion(new StringBuilder("deleted <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private EyeGrouponExample example;

        protected Criteria(EyeGrouponExample example) {
            super();
            this.example = example;
        }

        public EyeGrouponExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andDeletedEqualTo(EyeGroupon.Deleted.IS_DELETED.value()) : andDeletedNotEqualTo(EyeGroupon.Deleted.IS_DELETED.value());
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
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

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.eye.db.domain.EyeGrouponExample example);
    }
}