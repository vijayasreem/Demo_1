package com.sales.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.entity.LeadAutomationsAndFlows;
import com.sales.demo.service.LeadAutomationsAndFlowsService;

@RestController
@RequestMapping("/lead-automations")
public class LeadAutomationsAndFlowsController {
 
    @Autowired
    private LeadAutomationsAndFlowsService leadAutomationsAndFlowsService;
 
    @GetMapping("/byEmailTemplates/{emailTemplates}")
    public ResponseEntity<LeadAutomationsAndFlows> getLeadAutomationsAndFlowsByEmailTemplates(@PathVariable String emailTemplates) {
        LeadAutomationsAndFlows leadAutomationsAndFlows = leadAutomationsAndFlowsService.getLeadAutomationsAndFlowsByEmailTemplates(emailTemplates);
        if (leadAutomationsAndFlows == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(leadAutomationsAndFlows, HttpStatus.OK);
    }
    
    @GetMapping("/byEmailAbility/{emailAbility}")
    public ResponseEntity<LeadAutomationsAndFlows> getLeadAutomationsAndFlowsByEmailAbility(@PathVariable String emailAbility) {
        LeadAutomationsAndFlows leadAutomationsAndFlows = leadAutomationsAndFlowsService.getLeadAutomationsAndFlowsByEmailAbility(emailAbility);
        if (leadAutomationsAndFlows == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(leadAutomationsAndFlows, HttpStatus.OK);
    }
    
    @GetMapping("/byCredit/{credit}")
    public ResponseEntity<LeadAutomationsAndFlows> getLeadAutomationsAndFlowsByCredit(@PathVariable String credit) {
        LeadAutomationsAndFlows leadAutomationsAndFlows = leadAutomationsAndFlowsService.getLeadAutomationsAndFlowsByCredit(credit);
        if (leadAutomationsAndFlows == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(leadAutomationsAndFlows, HttpStatus.OK);
    }
    
    @GetMapping("/byPacketForm/{packetForm}")
    public ResponseEntity<LeadAutomationsAndFlows> getLeadAutomationsAndFlowsByPacketForm(@PathVariable String packetForm) {
        LeadAutomationsAndFlows leadAutomationsAndFlows = leadAutomationsAndFlowsService.getLeadAutomationsAndFlowsByPacketForm(packetForm);
        if (leadAutomationsAndFlows == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(leadAutomationsAndFlows, HttpStatus.OK);
    }
    
    @GetMapping("/byTaskForSalesRep/{taskForSalesRep}")
    public ResponseEntity<LeadAutomationsAndFlows> getLeadAutomationsAndFlowsByTaskForSalesRep(@PathVariable String taskForSalesRep) {
        LeadAutomationsAndFlows leadAutomationsAndFlows = leadAutomationsAndFlowsService.getLeadAutomationsAndFlowsByTaskForSalesRep(taskForSalesRep);
        if (leadAutomationsAndFlows == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(leadAutomationsAndFl