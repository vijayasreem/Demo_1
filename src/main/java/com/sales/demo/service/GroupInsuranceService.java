package com.sales.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.entity.GroupInsuranceProducts;
import com.sales.demo.repository.GroupInsuranceRepository;

@Service
public class GroupInsuranceService {
    
    @Autowired
    private GroupInsuranceRepository groupInsuranceRepository;
    
    //Lead generation module
    public List<GroupInsuranceProducts> getLeadGenerationProducts(){
        return groupInsuranceRepository.findByLeadGeneration();
    }
    
    //Unit (new business) team
    public List<GroupInsuranceProducts> getMasterPolicies(){
        return groupInsuranceRepository.findByMasterPolicies();
    }
    
    //ZO to approve deviations
    public List<GroupInsuranceProducts> getDeviations(){
        return groupInsuranceRepository.findByDeviations();
    }
    
    //CO to make approval decisions
    public List<GroupInsuranceProducts> getApprovalDecisions(){
        return groupInsuranceRepository.findByApprovalDecisions();
    }
    
    //Actuarial team to perform valuations
    public List<GroupInsuranceProducts> getValuations(){
        return groupInsuranceRepository.findByValuations();
    }
    
    //Re-insurer to make pricing decisions
    public List<GroupInsuranceProducts> getPricingDecisions(){
        return groupInsuranceRepository.findByPricingDecisions();
    }
    
    //Underwriter to make decisions related to underwriting
    public List<GroupInsuranceProducts> getUnderwritingDecisions(){
        return groupInsuranceRepository.findByUnderwritingDecisions();
    }
    
    //Master policy holder to manage member data
    public List<GroupInsuranceProducts> getMemberData(){
        return groupInsuranceRepository.findByMemberData();
    }
    
    //Member to acknowledge receipt of claim forms
    public List<GroupInsuranceProducts> getClaimForms(){
        return groupInsuranceRepository.findByClaimForms();
    }
    
    //Channel users to update leads
    public List<GroupInsuranceProducts> getLeads(){
        return groupInsuranceRepository.findByLeads();
    }
}