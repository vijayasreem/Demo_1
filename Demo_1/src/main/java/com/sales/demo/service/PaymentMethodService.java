package com.sales.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.model.PaymentMethod;
import com.sales.demo.repository.PaymentMethodRepository;

@Service
public class PaymentMethodService {
	
	@Autowired
	private PaymentMethodRepository paymentMethodRepository;
	
	public Optional<PaymentMethod> getPaymentMethodByType(String paymentType) {
		return paymentMethodRepository.findByPaymentType(paymentType);
	}
	
	public void updatePaymentStatus(String paymentType) {
		paymentMethodRepository.updatePaymentStatus(paymentType);
	}
	
}