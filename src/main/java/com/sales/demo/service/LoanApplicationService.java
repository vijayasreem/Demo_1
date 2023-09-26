package com.sales.demo.service;

import com.sales.demo.model.LoanApplication;
import com.sales.demo.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public List<LoanApplication> findByStatus(String status) {
        return loanApplicationRepository.findByStatus(status);
    }

    public List<LoanApplication> findByLoanAmountGreaterThanEqual(double amount) {
        return loanApplicationRepository.findByLoanAmountGreaterThanEqual(amount);
    }

    public List<LoanApplication> findByLoanAmountLessThanEqual(double amount) {
        return loanApplicationRepository.findByLoanAmountLessThanEqual(amount);
    }

    public List<LoanApplication> findByLoanAmountBetween(double minAmount, double maxAmount) {
        return loanApplicationRepository.findByLoanAmountBetween(minAmount, maxAmount);
    }

    public List<LoanApplication> findByLoanTermIn(List<Integer> loanTerms) {
        return loanApplicationRepository.findByLoanTermIn(loanTerms);
    }

    public List<LoanApplication> findByStatusAndLoanAmountAndLoanTermIn(String status, double minAmount, double maxAmount, List<Integer> loanTerms) {
        return loanApplicationRepository.findByStatusAndLoanAmountAndLoanTermIn(status, minAmount, maxAmount, loanTerms);
    }
}