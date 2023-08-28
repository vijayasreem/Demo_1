package com.sales.demo.service;

import com.sales.demo.repository.InvestigationManagementSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestigationManagementSystemService {

    @Autowired
    private InvestigationManagementSystemRepository investigationManagementSystemRepository;

    public void allocateCases(String investigatorType) {
        investigationManagementSystemRepository.allocateCases(investigatorType);
    }

    public void generateInvoices() {
        investigationManagementSystemRepository.generateInvoices();
    }

    public void submitReports(String teamName) {
        investigationManagementSystemRepository.submitReports(teamName);
    }

    public void sendNotifications(String userName) {
        investigationManagementSystemRepository.sendNotifications(userName);
    }

    public void waiveOffCases() {
        investigationManagementSystemRepository.waiveOffCases();
    }

    public void maintainHistory() {
        investigationManagementSystemRepository.maintainHistory();
    }

}