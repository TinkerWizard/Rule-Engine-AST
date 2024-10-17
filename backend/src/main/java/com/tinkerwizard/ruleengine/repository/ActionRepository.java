package com.tinkerwizard.ruleengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tinkerwizard.ruleengine.entity.Action;

@Repository
public interface ActionRepository extends JpaRepository<Action, Long> {

}
