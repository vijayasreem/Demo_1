package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.demo.entity.GroupInsuranceProducts;

@Repository
public interface GroupInsuranceRepository extends JpaRepository<GroupInsuranceProducts, Long> {
    //Lead generation module
    List<GroupInsuranceProducts> findByLeadGeneration();
    //Unit (new business) team
    List<GroupInsuranceProducts> findByMasterPolicies();
    //ZO to approve deviations
    List<GroupInsuranceProducts> findByDeviations();
    //CO to make approval decisions
    List<GroupInsuranceProducts> findByApprovalDecisions();
    //Actuarial team to perform valuations
    List<GroupInsuranceProducts> findByValuations();
    //Re-insurer to make pricing decisions
    List<GroupInsuranceProducts> findByPricingDecisions();
    //Underwriter to make decisions related to underwriting
    List<GroupInsuranceProducts> findByUnderwritingDecisions();
    //Master policy holder to manage member data
    List<GroupInsuranceProducts> findByMemberData();
    //Member to acknowledge receipt of claim forms
    List<GroupInsuranceProducts> findByClaimForms();
    //Channel users to update leads
    List<GroupInsuranceProducts> findByLeads();
}