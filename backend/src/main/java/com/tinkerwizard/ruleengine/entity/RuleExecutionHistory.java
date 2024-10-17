package com.tinkerwizard.ruleengine.entity;


import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class RuleExecutionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rule_id", nullable = false)
    private Rule rule;

    @Column(name = "executed_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Timestamp executedAt;

    @Column(name = "status", nullable = false)
    private String status;  // "Success", "Failed"

    @Column(name = "result")
    private String result;  // Execution result or message

    @Column(name = "execution_time_ms")
    private Integer executionTimeMs;

    public RuleExecutionHistory(Long id, Rule rule, Timestamp executedAt, String status, String result,
            Integer executionTimeMs) {
        this.id = id;
        this.rule = rule;
        this.executedAt = executedAt;
        this.status = status;
        this.result = result;
        this.executionTimeMs = executionTimeMs;
    }

    public RuleExecutionHistory()
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

    public Timestamp getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(Timestamp executedAt) {
        this.executedAt = executedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getExecutionTimeMs() {
        return executionTimeMs;
    }

    public void setExecutionTimeMs(Integer executionTimeMs) {
        this.executionTimeMs = executionTimeMs;
    }

    @Override
    public String toString() {
        return "RuleExecutionHistory [id=" + id + ", rule=" + rule + ", executedAt=" + executedAt + ", status=" + status
                + ", result=" + result + ", executionTimeMs=" + executionTimeMs + "]";
    }

    
    
    // Getters and Setters

    
}
