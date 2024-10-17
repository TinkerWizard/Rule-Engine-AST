package com.tinkerwizard.ruleengine.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinkerwizard.ruleengine.entity.Rule;
import com.tinkerwizard.ruleengine.services.RuleService;

@RestController
@RequestMapping("/api/rules")
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @GetMapping("/")
    public ResponseEntity<List<Rule>> getRules() {
        List<Rule> rules = ruleService.getRules();
        return new ResponseEntity<>(rules, HttpStatus.OK);
    }

    @GetMapping("/{ruleId}")
    public Rule getRule(@PathVariable Long ruleId) {
        return ruleService.getRuleById(ruleId);
    }

    @PostMapping("/")
    public Rule postRule(@RequestBody Rule rule)
    {
        // rule.set
        //generate ast and return the Node
        return ruleService.saveRule(rule);
    }

    // Other endpoints for rule management
}
