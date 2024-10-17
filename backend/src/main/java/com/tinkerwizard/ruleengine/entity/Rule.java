package com.tinkerwizard.ruleengine.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "rule")
public class Rule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "rule_expression")
    private String ruleExpression;

    @Column(name = "rule_type")
    private String ruleType;

    @Column(name = "priority")
    private int priority;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Timestamp createdAt;

    @Column(name = "updated_at" ,columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Timestamp updatedAt;


    @OneToMany(mappedBy = "rule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Condition> conditions = new ArrayList<>(); 

    @OneToMany(mappedBy = "rule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RuleExecutionHistory> ruleExecutionHistories = new ArrayList<>();

    @OneToMany(mappedBy = "rule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AstNode> astNode = new ArrayList<>();

    @OneToMany(mappedBy = "rule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Action> actions = new ArrayList<>();
    
    public Rule() {

    }

    public Rule(Long id, String name, String description, String ruleExpression, String ruleType, int priority, String status,
            Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ruleExpression = ruleExpression;
        this.ruleType = ruleType;
        this.priority = priority;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRuleExpression() {
        return ruleExpression;
    }

    public void setRuleExpression(String ruleExpression) {
        this.ruleExpression = ruleExpression;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    @Override
    public String toString() {
        return "Rule [id=" + id + ", name=" + name + ", description=" + description + ", ruleExpression="
                + ruleExpression + ", ruleType=" + ruleType + ", priority=" + priority + ", status=" + status
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    

    // public List<Condition> getConditions() {
    //     return conditions;
    // }

    // public void setConditions(List<Condition> conditions) {
    //     this.conditions = conditions;
    // }

    // public List<RuleExecutionHistory> getRuleExecutionHistories() {
    //     return ruleExecutionHistories;
    // }

    // public void setRuleExecutionHistories(List<RuleExecutionHistory> ruleExecutionHistories) {
    //     this.ruleExecutionHistories = ruleExecutionHistories;
    // }

    // public List<AstNode> getAstNode() {
    //     return astNode;
    // }

    // public void setAstNode(List<AstNode> astNode) {
    //     this.astNode = astNode;
    // }

    // public List<Action> getActions() {
    //     return actions;
    // }

    // public void setActions(List<Action> actions) {
    //     this.actions = actions;
    // }

    



    
}
