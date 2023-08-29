package com.sales.demo.service;

import com.sales.demo.model.LeadAutomationFlow;
import com.sales.demo.repository.LeadAutomationFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LeadAutomationFlowService {

    @Autowired
    private LeadAutomationFlowRepository leadAutomationFlowRepository;

    public List<LeadAutomationFlow> findByTemplates(String templates){
        return leadAutomationFlowRepository.findByTemplates(templates);
    }

    public List<LeadAutomationFlow> findByEmailTemplate(String emailTemplate){
        return leadAutomationFlowRepository.findByEmailTemplate(emailTemplate);
    }

    public List<LeadAutomationFlow> findByCreditType(String creditType){
        return leadAutomationFlowRepository.findByCreditType(creditType);
    }

    public List<LeadAutomationFlow> findBySendPacketForm(boolean sendPacketForm){
        return leadAutomationFlowRepository.findBySendPacketForm(sendPacketForm);
    }

    public List<LeadAutomationFlow> findBySendToSalesRep(boolean sendToSalesRep){
        return leadAutomationFlowRepository.findBySendToSalesRep(sendToSalesRep);
    }

    public List<LeadAutomationFlow> findByMoveLeadToDeadLeads(boolean moveLeadToDeadLeads){
        return leadAutomationFlowRepository.findByMoveLeadToDeadLeads(moveLeadToDeadLeads);
    }

}