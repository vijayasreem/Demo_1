package com.sales.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.entity.LeadAutomationsAndFlows;
import com.sales.demo.repository.LeadAutomationsAndFlowsRepository;

@Service
public class LeadAutomationsAndFlowsService {
 
    @Autowired
    private LeadAutomationsAndFlowsRepository leadAutomationsAndFlowsRepository;
 
    public LeadAutomationsAndFlows getLeadAutomationsAndFlowsByEmailTemplates(String emailTemplates) {
        return leadAutomationsAndFlowsRepository.findByEmailTemplates(emailTemplates);
    }
    
    public LeadAutomationsAndFlows getLeadAutomationsAndFlowsByEmailAbility(String emailAbility) {
        return leadAutomationsAndFlowsRepository.findByEmailAbility(emailAbility);
    }
    
    public LeadAutomationsAndFlows getLeadAutomationsAndFlowsByCredit(String credit) {
        return leadAutomationsAndFlowsRepository.findByCredit(credit);
    }
    
    public LeadAutomationsAndFlows getLeadAutomationsAndFlowsByPacketForm(String packetForm) {
        return leadAutomationsAndFlowsRepository.findByPacketForm(packetForm);
    }
    
    public LeadAutomationsAndFlows getLeadAutomationsAndFlowsByTaskForSalesRep(String taskForSalesRep) {
        return leadAutomationsAndFlowsRepository.findByTaskForSalesRep(taskForSalesRep);
    }
    
    public LeadAutomationsAndFlows getLeadAutomationsAndFlowsByLeadsToDeadLeads(String leadsToDeadLeads) {
        return leadAutomationsAndFlowsRepository.findByLeadsToDeadLeads(leadsToDeadLeads);
    }
    
    public LeadAutomationsAndFlows saveLeadAutomationsAndFlows(LeadAutomationsAndFlows leadAutomationsAndFlows) {
        return leadAutomationsAndFlowsRepository.save(leadAutomationsAndFlows);
    }
    
    public void deleteLeadAutomationsAndFlows(Long id) {
        leadAutomationsAndFlowsRepository.deleteById(id);
    }
}