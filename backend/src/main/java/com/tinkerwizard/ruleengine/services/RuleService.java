package com.tinkerwizard.ruleengine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinkerwizard.ruleengine.entity.AstNode;
import com.tinkerwizard.ruleengine.entity.Rule;
import com.tinkerwizard.ruleengine.repository.AstNodeRepository;
import com.tinkerwizard.ruleengine.repository.RuleRepository;

@Service
public class RuleService {

    @Autowired
    private RuleRepository ruleRepository;

    @Autowired
    private AstNodeRepository astNodeRepository;

    public List<AstNode> getAstNodesForRule(Long ruleId) {
        return astNodeRepository.findByRuleId(ruleId);
    }

    public Rule getRuleById(Long ruleId) {
        Optional<Rule> rule = ruleRepository.findById(ruleId);

        // Handle potential null value gracefully
        if (rule.isPresent()) {
            return rule.get();
        } else {
            return null;
        }
    }

    public List<Rule> getRules()
    {
        return ruleRepository.findAll();
    }

    public Rule saveRule(Rule rule)
    {
        ruleRepository.save(rule);
        return rule;
    }

}
