package com.tinkerwizard.ruleengine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tinkerwizard.ruleengine.entity.AstNode;

@Repository
public interface AstNodeRepository extends JpaRepository<AstNode, Long> {

    List<AstNode> findByRuleId(Long ruleId);
}
