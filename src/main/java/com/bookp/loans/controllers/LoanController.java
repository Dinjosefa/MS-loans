package com.bookp.loans.controllers;

import com.bookp.loans.models.Loan;
import com.bookp.loans.repositories.LoanRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class LoanController {
    private final LoanRepository loanRepository;

    public LoanController(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @PostMapping("/loan")
    Loan newLoan(@RequestBody Loan loan) {
        return loanRepository.save(loan);
    }

    @GetMapping("/loans/{idUser}")
    public List<Loan> getLoansUser(@PathVariable String idUser) {
        List<Loan> loans = loanRepository.findAll();
        List<Loan> loansfinal = new ArrayList<Loan>();
        for (Loan loan : getLoans()) {
            if (loan.getIdUser().contentEquals(idUser)) {
                loansfinal.add(loan);
            }
        }
        return loansfinal;
    }

    @GetMapping("/loans")
    public List<Loan> getLoans() {
        return loanRepository.findAll();
    }
}
