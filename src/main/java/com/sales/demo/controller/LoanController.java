Sure! Here is an example of a Spring Boot Controller class that implements the required business methods for approving a loan with specific terms and conditions:

```java
package com.sales.demo.controller;

import com.sales.demo.model.Loan;
import com.sales.demo.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/{loanId}/approve")
    public ResponseEntity<String> approveLoanWithTermsAndConditions(@PathVariable("loanId") Long loanId, @RequestBody String termsAndConditions) {
        Loan loan = loanService.getLoanById(loanId);
        if (loan == null) {
            return new ResponseEntity<>("Loan not found", HttpStatus.NOT_FOUND);
        }
        loanService.approveLoanWithTermsAndConditions(loan, termsAndConditions);
        return new ResponseEntity<>("Loan approved with terms and conditions", HttpStatus.OK);
    }

    @GetMapping("/approved")
    public ResponseEntity<List<Loan>> findApprovedLoans() {
        List<Loan> approvedLoans = loanService.findApprovedLoans();
        return new ResponseEntity<>(approvedLoans, HttpStatus.OK);
    }

    @GetMapping("/terms-and-conditions")
    public ResponseEntity<List<Loan>> findLoansByTermsAndConditions(@RequestParam("termsAndConditions") String termsAndConditions) {
        List<Loan> loans = loanService.findLoansByTermsAndConditions(termsAndConditions);
        return new ResponseEntity<>(loans, HttpStatus.OK);
    }

    // Add other business methods implementations here

}
```

In this example, the `LoanController` class defines the REST endpoints for approving a loan with specific terms and conditions and retrieving approved loans and loans with specific terms and conditions.

You can add other business methods implementations in a similar way, by defining the appropriate HTTP methods and mapping them to the corresponding service methods.

Note: Make sure to customize the paths and request/response objects according to your specific requirements.