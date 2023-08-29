package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_insurance_products")
public class GroupInsuranceProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String leadGeneration;
    private String masterPolicies;
    private String deviations;
    private String approvalDecisions;
    private String valuations;
    private String pricingDecisions;
    private String underwritingDecisions;
    private String memberData;
    private String claimForms;
    private String leads;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeadGeneration() {
        return leadGeneration;
    }

    public void setLeadGeneration(String leadGeneration) {
        this.leadGeneration = leadGeneration;
    }

    public String getMasterPolicies() {
        return masterPolicies;
    }

    public void setMasterPolicies(String masterPolicies) {
        this.masterPolicies = masterPolicies;
    }

    public String getDeviations() {
        return deviations;
    }

    public void setDeviations(String deviations) {
        this.deviations = deviations;
    }

    public String getApprovalDecisions() {
        return approvalDecisions;
    }

    public void setApprovalDecisions(String approvalDecisions) {
        this.approvalDecisions = approvalDecisions;
    }

    public String getValuations() {
        return valuations;
    }

    public void setValuations(String valuations) {
        this.valuations = valuations;
    }

    public String getPricingDecisions() {
        return pricingDecisions;
    }

    public void setPricingDecisions(String pricingDecisions) {
        this.pricingDecisions = pricingDecisions;
    }

    public String getUnderwritingDecisions() {
        return underwritingDecisions;
    }

    public void setUnderwritingDecisions(String underwritingDecisions) {
        this.underwritingDecisions = underwritingDecisions;
    }

    public String getMemberData() {
        return memberData;
    }

    public void setMemberData(String memberData) {
        this.memberData = memberData;
    }

    public String getClaimForms() {
        return claimForms;
    }

    public void setClaimForms(String claimForms) {
        this.claimForms = claimForms;
    }

    public String getLeads() {
        return leads;
    }

    public void setLeads(String leads) {
        this.leads = leads;
    }

}