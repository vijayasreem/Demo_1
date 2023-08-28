package com.sales.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.model.ILMS;
import com.sales.demo.repository.ILMSRepository;

@Service
public class ILMSService {

	@Autowired
	private ILMSRepository ilmsRepository;

	// Method to allocate cases to both Internal and External (virtual) investigators
	public void allocateCases() {
		List<ILMS> ilmsList = ilmsRepository.findAll();
		for (ILMS ilms : ilmsList) {
			ilms.setStatus("Allocated");
			ilmsRepository.save(ilms);
		}
	}

	// Method to generate invoices for external investigators
	public void generateInvoices() {
		List<ILMS> ilmsList = ilmsRepository.findAll();
		for (ILMS ilms : ilmsList) {
			ilms.setInvoiceStatus("Generated");
			ilmsRepository.save(ilms);
		}
	}

	// Method to submit reports to LSO and Claims team
	public void submitReports() {
		List<ILMS> ilmsList = ilmsRepository.findAll();
		for (ILMS ilms : ilmsList) {
			ilms.setReportStatus("Submitted");
			ilmsRepository.save(ilms);
		}
	}

	// Method to send emails and notifications to users
	public void sendNotifications() {
		List<ILMS> ilmsList = ilmsRepository.findAll();
		for (ILMS ilms : ilmsList) {
			ilms.setNotificationStatus("Sent");
			ilmsRepository.save(ilms);
		}
	}

	// Method to waive-off cases
	public void waiveOffCases() {
		List<ILMS> ilmsList = ilmsRepository.findAll();
		for (ILMS ilms : ilmsList) {
			ilms.setStatus("Waived-Off");
			ilmsRepository.save(ilms);
		}
	}

	// Method to maintain the history of the cases
	public void maintainHistory() {
		List<ILMS> ilmsList = ilmsRepository.findAll();
		for (ILMS ilms : ilmsList) {
			ilms.setHistoryStatus("Maintained");
			ilmsRepository.save(ilms);
		}
	}

}