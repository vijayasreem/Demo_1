package com.sales.demo.service;

import com.sales.demo.repository.GroupInsuranceProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupInsuranceProductService {
    @Autowired
    private GroupInsuranceProductRepository repository;

    public void generateLeads(){
        repository.generateLeads();
    }

    public void createProposals(){
        repository.createProposals();
    }

    public void generateQuotations(){
        repository.generateQuotations();
    }

    public void configureMasterPolicies(){
        repository.configureMasterPolicies();
    }

    public void mapUnits(){
        repository.mapUnits();
    }

    public void underwritePolicies(){
        repository.underwritePolicies();
    }

    public void manageReinsurance(){
        repository.manageReinsurance();
    }

    public void issuePolicyBonds(){
        repository.issuePolicyBonds();
    }

    public void collectStampDuty(){
        repository.collectStampDuty();
    }

    public void generateReports(){
        repository.generateReports();
    }

    public void approveUnderwritingDeviations(){
        repository.approveUnderwritingDeviations();
    }

    public void approveReinsuranceDeviations(){
        repository.approveReinsuranceDeviations();
    }

    public void approveStatutoryReports(){
        repository.approveStatutoryReports();
    }

    public void approveDeviations(){
        repository.approveDeviations();
    }

    public void approveUnderwritingPricing(){
        repository.approveUnderwritingPricing();
    }

    public void approveReinsuranceDecisions(){
        repository.approveReinsuranceDecisions();
    }

    public void approveDelayedClaims(){
        repository.approveDelayedClaims();
    }

    public void configureNewProducts(){
        repository.configureNewProducts();
    }

    public void createUnitCodes(){
        repository.createUnitCodes();
    }

    public void createZoCodes(){
        repository.createZoCodes();
    }

    public void createSchemeWiseInterestTables(){
        repository.createSchemeWiseInterestTables();
    }

    public void createPremiumRateTables(){
        repository.createPremiumRateTables();
    }

    public void manageCentralizedCollectionAndPayment(){
        repository.manageCentralizedCollectionAndPayment();
    }

    public void performValuations(){
        repository.performValuations();
    }

    public void makePricingDecisions(){
        repository.makePricingDecisions();
    }

    public void manageMemberData(){
        repository.manageMemberData();
    }

    public void managePayments(){
        repository.managePayments();
    }

    public void manageClaimForms(){
        repository.manageClaimForms();
    }

    public void manageSchemeRules(){
        repository.manageSchemeRules();
    }

    public void manageConsentForRenewal(){
        repository.manageConsentForRenewal();
    }

    public void manageMemberAddition(){
        repository.manageMemberAddition();
    }

    public void manageRequestForConversion(){
        repository.manageRequestForConversion();
    }

    public void manageWithdrawal(){
        repository.manageWithdrawal();
    }

    public void manageSurrender(){
        repository.manageSurrender();
    }

    public void manageMemberLevelPayments(){
        repository.manageMemberLevelPayments();
    }

    public void manageTdsDetails(){
        repository.manageTdsDetails();
    }

    public void manageGst(){
        repository.manageGst();
    }

    public void manageFundingBasedOnValuations(){
        repository.manageFundingBasedOnValuations();
    }

    public void manageNonMonetaryServices(){
        repository.manageNonMonetaryServices();
    }

    public void acknowledgeReceiptOfClaimForms(){
        repository.acknowledgeReceiptOfClaimForms();
    }

    public void updateLeads(){