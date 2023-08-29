package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeadAutomationFlow {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private String templates;
    private String emailTemplate;
    private String creditType;
    private boolean sendPacketForm;
    private boolean sendToSalesRep;
    private boolean moveLeadToDeadLeads;
 
    public LeadAutomationFlow() {
    }
 
    public LeadAutomationFlow(String templates, String emailTemplate, String creditType, boolean sendPacketForm, 
                              boolean sendToSalesRep, boolean moveLeadToDeadLeads) {
        this.templates = templates;
        this.emailTemplate = emailTemplate;
        this.creditType = creditType;
        this.sendPacketForm = sendPacketForm;
        this.sendToSalesRep = sendToSalesRep;
        this.moveLeadToDeadLeads = moveLeadToDeadLeads;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getTemplates() {
        return templates;
    }
 
    public void setTemplates(String templates) {
        this.templates = templates;
    }
 
    public String getEmailTemplate() {
        return emailTemplate;
    }
 
    public void setEmailTemplate(String emailTemplate) {
        this.emailTemplate = emailTemplate;
    }
 
    public String getCreditType() {
        return creditType;
    }
 
    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }
 
    public boolean isSendPacketForm() {
        return sendPacketForm;
    }
 
    public void setSendPacketForm(boolean sendPacketForm) {
        this.sendPacketForm = sendPacketForm;
    }
 
    public boolean isSendToSalesRep() {
        return sendToSalesRep;
    }
 
    public void setSendToSalesRep(boolean sendToSalesRep) {
        this.sendToSalesRep = sendToSalesRep;
    }
 
    public boolean isMoveLeadToDeadLeads() {
        return moveLeadToDeadLeads;
    }
 
    public void setMoveLeadToDeadLeads(boolean moveLeadToDeadLeads) {
        this.moveLeadToDeadLeads = moveLeadToDeadLeads;
    }
}