package com.sales.demo.controller;

import com.sales.demo.model.LoanApplication;
import com.sales.demo.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/status/{status}")
    public List<LoanApplication> findByStatus(@PathVariable String status) {
        return loanApplicationService.findByStatus(status);
    }

    @GetMapping("/loan-amount/greater-than-equal/{amount}")
    public List<LoanApplication> findByLoanAmountGreaterThanEqual(@PathVariable double amount) {
        return loanApplicationService.findByLoanAmountGreaterThanEqual(amount);
    }

    @GetMapping("/loan-amount/less-than-equal/{amount}")
    public List<LoanApplication> findByLoanAmountLessThanEqual(@PathVariable double amount) {
        return loanApplicationService.findByLoanAmountLessThanEqual(amount);
    }

    @GetMapping("/loan-amount/between/{minAmount}/{maxAmount}")
    public List<LoanApplication> findByLoanAmountBetween(@PathVariable double minAmount, @PathVariable double maxAmount) {
        return loanApplicationService.findByLoanAmountBetween(minAmount, maxAmount);
    }

    @GetMapping("/loan-term/in")
    public List<LoanApplication> findByLoanTermIn(@RequestParam List<Integer> loanTerms) {
        return loanApplicationService.findByLoanTermIn(loanTerms);
    }

    @GetMapping("/status-and-loan-amount-and-loan-term")
    public List<LoanApplication> findByStatusAndLoanAmountAndLoanTermIn(@RequestParam String status, @RequestParam double minAmount, @RequestParam double maxAmount, @RequestParam List<Integer> loanTerms) {
        return loanApplicationService.findByStatusAndLoanAmountAndLoanTermIn(status, minAmount, maxAmount, loanTerms);
    }

    // Add other required business methods here
}