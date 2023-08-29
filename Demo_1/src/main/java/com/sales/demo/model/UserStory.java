package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    
    private String description;
    
    private String assignedTeamMember;
    
    private String jiraAPI;
    
    private String realTime;
    
    private String acceptanceCriteria;
    
    private String acceptanceTesting;
    
    private String definitionOfDone;
    
    
    public UserStory() {
    }
    
    public UserStory(Long id, String title, String description, String assignedTeamMember, String jiraAPI, String realTime, String acceptanceCriteria, String acceptanceTesting, String definitionOfDone) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.assignedTeamMember = assignedTeamMember;
        this.jiraAPI = jiraAPI;
        this.realTime = realTime;
        this.acceptanceCriteria = acceptanceCriteria;
        this.acceptanceTesting = acceptanceTesting;
        this.definitionOfDone = definitionOfDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedTeamMember() {
        return assignedTeamMember;
    }

    public void setAssignedTeamMember(String assignedTeamMember) {
        this.assignedTeamMember = assignedTeamMember;
    }

    public String getJiraAPI() {
        return jiraAPI;
    }

    public void setJiraAPI(String jiraAPI) {
        this.jiraAPI = jiraAPI;
    }

    public String getRealTime() {
        return realTime;
    }

    public void setRealTime(String realTime) {
        this.realTime = realTime;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getAcceptanceTesting() {
        return acceptanceTesting;
    }

    public void setAcceptanceTesting(String acceptanceTesting) {
        this.acceptanceTesting = acceptanceTesting;
    }

    public String getDefinitionOfDone() {
        return definitionOfDone;
    }

    public void setDefinitionOfDone(String definitionOfDone) {
        this.definitionOfDone = definitionOfDone;
    }
    
}