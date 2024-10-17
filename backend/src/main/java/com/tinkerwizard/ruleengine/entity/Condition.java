package com.tinkerwizard.ruleengine.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "condition")
public class Condition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rule_id", nullable = false)
    private Rule rule;

    @Column(name = "expression")
    private String expression;

    @Column(name = "operator")
    private String operator;

    @Column(name = "created_at",columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Timestamp createdAt;

    @Column(name = "updated_at",columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Timestamp updatedAt;

    public Condition(Long id, Rule rule, String expression, String operator, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.rule = rule;
        this.expression = expression;
        this.operator = operator;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Condition()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Condition [id=" + id + ", rule=" + rule + ", expression=" + expression + ", operator=" + operator
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    
}
