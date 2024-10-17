package com.tinkerwizard.ruleengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tinkerwizard.ruleengine.entity.RuleExecutionHistory;

@Repository
public interface RuleExecutionHistoryRepository extends JpaRepository<RuleExecutionHistory, Long>{

}
