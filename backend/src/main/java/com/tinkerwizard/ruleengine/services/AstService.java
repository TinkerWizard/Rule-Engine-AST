package com.tinkerwizard.ruleengine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinkerwizard.ruleengine.repository.AstNodeRepository;

@Service
public class AstService {
    
    @Autowired
    private AstNodeRepository astNodeRepository;

    
}
