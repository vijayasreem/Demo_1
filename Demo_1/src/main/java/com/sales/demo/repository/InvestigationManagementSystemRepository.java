package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestigationManagementSystemRepository extends JpaRepository<InvestigationManagementSystem, Long> {
    // Method to allocate cases to Internal and External (virtual) investigators
    void allocateCases(String investigatorType);
    
    // Method to generate invoices for external investigators
    void generateInvoices();
    
    // Method to submit reports to LSO and Claims team
    void submitReports(String teamName);
    
    // Method to send emails and notifications to users
    void sendNotifications(String userName);
    
    // Method to waive-off cases
    void waiveOffCases();
    
    // Method to maintain the history of the cases
    void maintainHistory();
}