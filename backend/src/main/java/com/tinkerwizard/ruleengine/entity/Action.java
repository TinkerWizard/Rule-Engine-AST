package com.tinkerwizard.ruleengine.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "action")
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rule_id", nullable = false)
    private Rule rule;

    @Column(name = "action_type")
    private String actionType;

    @Column(name = "action_value")
    private String actionValue;

    @Column(name = "created_at",columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Timestamp createdAt;

    @Column(name = "updated_at",columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Timestamp updatedAt;

    public Action(Long id, Rule rule, String actionType, String actionValue, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.rule = rule;
        this.actionType = actionType;
        this.actionValue = actionValue;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Action()
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

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionValue() {
        return actionValue;
    }

    public void setActionValue(String actionValue) {
        this.actionValue = actionValue;
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
        return "Action [id=" + id + ", rule=" + rule + ", actionType=" + actionType + ", actionValue=" + actionValue
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    
}
