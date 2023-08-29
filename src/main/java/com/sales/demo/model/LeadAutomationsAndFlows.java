package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeadAutomationsAndFlows {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String emailTemplates;
	private String emailAbility;
	private String credit;
	private String packetForm;
	private String taskForSalesRep;
	private String leadsToDeadLeads;
	
	public LeadAutomationsAndFlows() {
		
	}

	public LeadAutomationsAndFlows(Long id, String emailTemplates, String emailAbility, String credit, String packetForm,
			String taskForSalesRep, String leadsToDeadLeads) {
		super();
		this.id = id;
		this.emailTemplates = emailTemplates;
		this.emailAbility = emailAbility;
		this.credit = credit;
		this.packetForm = packetForm;
		this.taskForSalesRep = taskForSalesRep;
		this.leadsToDeadLeads = leadsToDeadLeads;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailTemplates() {
		return emailTemplates;
	}

	public void setEmailTemplates(String emailTemplates) {
		this.emailTemplates = emailTemplates;
	}

	public String getEmailAbility() {
		return emailAbility;
	}

	public void setEmailAbility(String emailAbility) {
		this.emailAbility = emailAbility;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getPacketForm() {
		return packetForm;
	}

	public void setPacketForm(String packetForm) {
		this.packetForm = packetForm;
	}

	public String getTaskForSalesRep() {
		return taskForSalesRep;
	}

	public void setTaskForSalesRep(String taskForSalesRep) {
		this.taskForSalesRep = taskForSalesRep;
	}

	public String getLeadsToDeadLeads() {
		return leadsToDeadLeads;
	}

	public void setLeadsToDeadLeads(String leadsToDeadLeads) {
		this.leadsToDeadLeads = leadsToDeadLeads;
	}
	
	
	
}