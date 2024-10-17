package com.tinkerwizard.ruleengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tinkerwizard.ruleengine.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
