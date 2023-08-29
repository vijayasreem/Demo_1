package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.demo.entity.LeadAutomationsAndFlows;

@Repository
public interface LeadAutomationsAndFlowsRepository extends JpaRepository<LeadAutomationsAndFlows, Long> {
	
	// Method to get Lead Automations & Flows with 3 separate email templates
	LeadAutomationsAndFlows findByEmailTemplates(String emailTemplates);
	
	// Method to get Lead Automations & Flows with the ability to send out emails
	LeadAutomationsAndFlows findByEmailAbility(String emailAbility);
	
	// Method to get Lead Automations & Flows with the ability to differentiate between Good Credit, Questionable Credit and Bad Credit
	LeadAutomationsAndFlows findByCredit(String credit);
	
	// Method to get Lead Automations & Flows with the ability to send out Packet & Form when Credit is marked as Good
	LeadAutomationsAndFlows findByPacketForm(String packetForm);
	
	// Method to get Lead Automations & Flows with the ability to create a task for Sales Rep to set up a meeting with the customer when Credit is set to Limited
	LeadAutomationsAndFlows findByTaskForSalesRep(String taskForSalesRep);
	
	// Method to get Lead Automations & Flows with the ability to move leads to Dead Leads when the third attempt is unsuccessful
	LeadAutomationsAndFlows findByLeadsToDeadLeads(String leadsToDeadLeads);
}