package com.sales.demo.controller;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.model.PaymentMethod;
import com.sales.demo.model.LeadAutomationFlow;
import com.sales.demo.service.PaymentMethodService;
import com.sales.demo.service.LeadAutomationFlowService;

@RestController
@RequestMapping("/sales")
public class SalesController {
	
	@Autowired
	private PaymentMethodService paymentMethodService;
	
	@Autowired
	private LeadAutomationFlowService leadAutomationFlowService;
	
	@GetMapping("/paymentmethod/{paymentType}")
	public Optional<PaymentMethod> getPaymentMethodByType(@PathVariable("paymentType") String paymentType) {
		return paymentMethodService.getPaymentMethodByType(paymentType);
	}
	
	@PutMapping("/paymentmethod/{paymentType}")
	public void updatePaymentStatus(@PathVariable("paymentType") String paymentType) {
		paymentMethodService.updatePaymentStatus(paymentType);
	}
	
	@GetMapping("/leadautomationflow/templates/{templates}")
	public List<LeadAutomationFlow> findByTemplates(@PathVariable("templates") String templates) {
		return leadAutomationFlowService.findByTemplates(templates);
	}
	
	@GetMapping("/leadautomationflow/emailtemplate/{emailTemplate}")
	public List<LeadAutomationFlow> findByEmailTemplate(@PathVariable("emailTemplate") String emailTemplate) {
		return leadAutomationFlowService.findByEmailTemplate(emailTemplate);
	}
	
	@GetMapping("/leadautomationflow/credittype/{creditType}")
	public List<LeadAutomationFlow> findByCreditType(@PathVariable("creditType") String creditType) {
		return leadAutomationFlowService.findByCreditType(creditType);
	}
	
	@GetMapping("/leadautomationflow/sendpacketform/{sendPacketForm}")
	public List<LeadAutomationFlow> findBySendPacketForm(@PathVariable("sendPacketForm") boolean sendPacketForm) {
		return leadAutomationFlowService.findBySendPacketForm(sendPacketForm);
	}
	
	@GetMapping("/leadautomationflow/sendtosalesrep/{sendToSalesRep}")
	public List<LeadAutomationFlow> findBySendToSalesRep(@PathVariable("sendToSalesRep") boolean sendToSalesRep) {
		return leadAutomationFlowService.findBySendToSalesRep(sendToSalesRep);
	}
	
	@GetMapping("/leadautomationflow/moveleadtodeadleads/{moveLeadToDeadLeads}")
	public List<LeadAutomationFlow> findByMoveLeadToDeadLeads(@PathVariable("moveLeadToDeadLeads") boolean moveLeadToDeadLeads) {
		return leadAutomationFlowService.findByMoveLeadToDeadLeads(moveLeadToDeadLeads);
	}
	
}