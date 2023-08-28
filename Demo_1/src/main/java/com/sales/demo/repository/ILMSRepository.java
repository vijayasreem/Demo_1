@Repository
package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.demo.model.ILMS;

public interface ILMSRepository extends JpaRepository<ILMS, Long> {

    // Method to allocate cases to both Internal and External (virtual) investigators
    void allocateCases();

    // Method to generate invoices for external investigators
    void generateInvoices();

    // Method to submit reports to LSO and Claims team
    void submitReports();

    // Method to send emails and notifications to users
    void sendNotifications();

    // Method to waive-off cases
    void waiveOffCases();

    // Method to maintain the history of the cases
    void maintainHistory();

}