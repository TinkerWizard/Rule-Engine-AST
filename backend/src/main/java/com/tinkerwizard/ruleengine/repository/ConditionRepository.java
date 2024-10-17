package com.tinkerwizard.ruleengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tinkerwizard.ruleengine.entity.Condition;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long>{

}
