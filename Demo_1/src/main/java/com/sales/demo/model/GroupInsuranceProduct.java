package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_insurance_product")
public class GroupInsuranceProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String leadGeneration;
    private String proposalCreation;
    private String quotationGeneration;
    private String masterPolicyConfiguration;
    private String unitMapping;
    private String underwritingPolicy;
    private String reinsuranceManagement;
    private String policyBondIssuance;
    private String stampDutyCollection;
    private String reportGeneration;
    private String underwritingDeviationApproval;
    private String reinsuranceDeviationApproval;
    private String statutoryReportApproval;
    private String deviationApproval;
    private String underwritingPricingApproval;
    private String reinsuranceDecisionApproval;
    private String delayedClaimsApproval;
    private String newProductConfiguration;
    private String unitCodeCreation;
    private String zoCodeCreation;
    private String schemeWiseInterestTables;
    private String premiumRateTables;
    private String centralizedCollectionAndPayment;
    private String valuations;
    private String pricingDecision;
    private String memberDataManagement;
    private String paymentsManagement;
    private String claimFormsManagement;
    private String schemeRulesManagement;
    private String consentForRenewalManagement;
    private String memberAdditionManagement;
    private String requestForConversionManagement;
    private String withdrawalManagement;
    private String surrenderManagement;
    private String memberLevelPaymentsManagement;
    private String tdsDetailsManagement;
    private String gstManagement;
    private String fundingBasedOnValuationsManagement;
    private String nonMonetaryServicesManagement;
    private String claimFormsReceiptAcknowledgement;
    private String leadsUpdation;
    private String documentCollectionCoordination;
    private String commissionReceiptsAcknowledgement;

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

    public String getProposalCreation() {
        return proposalCreation;
    }

    public void setProposalCreation(String proposalCreation) {
        this.proposalCreation = proposalCreation;
    }

    public String getQuotationGeneration() {
        return quotationGeneration;
    }

    public void setQuotationGeneration(String quotationGeneration) {
        this.quotationGeneration = quotationGeneration;
    }

    public String getMasterPolicyConfiguration() {
        return masterPolicyConfiguration;
    }

    public void setMasterPolicyConfiguration(String masterPolicyConfiguration) {
        this.masterPolicyConfiguration = masterPolicyConfiguration;
    }

    public String getUnitMapping() {
        return unitMapping;
    }

    public void setUnitMapping(String unitMapping) {
        this.unitMapping = unitMapping;
    }

    public String getUnderwritingPolicy() {
        return underwritingPolicy;
    }

    public void setUnderwritingPolicy(String underwritingPolicy) {
        this.underwritingPolicy = underwritingPolicy;
    }

    public String getReinsuranceManagement() {
        return reinsuranceManagement;
    }

    public void setReinsuranceManagement(String reinsuranceManagement) {
        this.reinsuranceManagement = reinsuranceManagement;
    }

    public String getPolicyBondIssuance() {
        return policyBondIssuance;
    }

    public void setPolicyBondIssuance(String policyBondIssuance) {
        this.policyBondIssuance = policyBondIssuance;
    }

    public String getStampDutyCollection() {
        return stampDutyCollection;
    }

    public void setStampDuty