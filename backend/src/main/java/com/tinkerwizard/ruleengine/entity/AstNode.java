package com.tinkerwizard.ruleengine.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class AstNode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rule_id", nullable = false)
    private Rule rule;

    @Column(name = "node_type", nullable = false)
    private String nodeType; // "Operator", "Condition", "Action"

    @Column(name = "node_value", nullable = false)
    private String nodeValue; // The actual value, e.g., "age > 30"

    @ManyToOne
    @JoinColumn(name = "parent_node_id")
    private AstNode parentNode;

    @OneToOne
    @JoinColumn(name = "left_child_id")
    private AstNode leftChild;

    @OneToOne
    @JoinColumn(name = "right_child_id")
    private AstNode rightChild;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Timestamp updatedAt;

    public AstNode(Long id, Rule rule, String nodeType, String nodeValue, AstNode parentNode, AstNode leftChild,
            AstNode rightChild, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.rule = rule;
        this.nodeType = nodeType;
        this.nodeValue = nodeValue;
        this.parentNode = parentNode;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
    public AstNode() {

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

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public AstNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(AstNode parentNode) {
        this.parentNode = parentNode;
    }

    public AstNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(AstNode leftChild) {
        this.leftChild = leftChild;
    }

    public AstNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(AstNode rightChild) {
        this.rightChild = rightChild;
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
        return "AstNode [id=" + id + ", rule=" + rule + ", nodeType=" + nodeType + ", nodeValue=" + nodeValue
                + ", parentNode=" + parentNode + ", leftChild=" + leftChild + ", rightChild=" + rightChild
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

}
