package com.sales.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.entity.GroupInsuranceProducts;
import com.sales.demo.service.GroupInsuranceService;

@RestController
@RequestMapping("/groupInsurance")
public class GroupInsuranceController {
    
    @Autowired
    private GroupInsuranceService groupInsuranceService;
    
    //Lead generation module
    @GetMapping("/leadGeneration")
    public List<GroupInsuranceProducts> getLeadGenerationProducts(){
        return groupInsuranceService.getLeadGenerationProducts();
    }
    
    //Unit (new business) team
    @GetMapping("/masterPolicies")
    public List<GroupInsuranceProducts> getMasterPolicies(){
        return groupInsuranceService.getMasterPolicies();
    }
    
    //ZO to approve deviations
    @GetMapping("/deviations")
    public List<GroupInsuranceProducts> getDeviations(){
        return groupInsuranceService.getDeviations();
    }
    
    //CO to make approval decisions
    @GetMapping("/approvalDecisions")
    public List<GroupInsuranceProducts> getApprovalDecisions(){
        return groupInsuranceService.getApprovalDecisions();
    }
    
    //Actuarial team to perform valuations
    @GetMapping("/valuations")
    public List<GroupInsuranceProducts> getValuations(){
        return groupInsuranceService.getValuations();
    }
    
    //Re-insurer to make pricing decisions
    @GetMapping("/pricingDecisions")
    public List<GroupInsuranceProducts> getPricingDecisions(){
        return groupInsuranceService.getPricingDecisions();
    }
    
    //Underwriter to make decisions related to underwriting
    @GetMapping("/underwritingDecisions")
    public List<GroupInsuranceProducts> getUnderwritingDecisions(){
        return groupInsuranceService.getUnderwritingDecisions();
    }
    
    //Master policy holder to manage member data
    @GetMapping("/memberData")
    public List<GroupInsuranceProducts> getMemberData(){
        return groupInsuranceService.getMemberData();
    }
    
    //Member to acknowledge receipt of claim forms
    @GetMapping("/claimForms")
    public List<GroupInsuranceProducts> getClaimForms(){
        return groupInsuranceService.getClaimForms();
    }
    
    //Channel users to update leads
    @GetMapping("/leads")
    public List<GroupInsuranceProducts> getLeads(){
        return groupInsuranceService.getLeads();
    }
}