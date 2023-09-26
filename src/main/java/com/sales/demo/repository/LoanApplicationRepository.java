
package com.sales.demo.repository;

import com.sales.demo.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    List<LoanApplication> findByStatus(String status);

    List<LoanApplication> findByLoanAmountGreaterThanEqual(double amount);

    List<LoanApplication> findByLoanAmountLessThanEqual(double amount);

    List<LoanApplication> findByLoanAmountBetween(double minAmount, double maxAmount);

    List<LoanApplication> findByLoanTermIn(List<Integer> loanTerms);

    @Query("SELECT la FROM LoanApplication la WHERE la.status = ?1 AND la.loanAmount >= ?2 AND la.loanAmount <= ?3 AND la.loanTerm IN ?4")
    List<LoanApplication> findByStatusAndLoanAmountAndLoanTermIn(String status, double minAmount, double maxAmount, List<Integer> loanTerms);

}
