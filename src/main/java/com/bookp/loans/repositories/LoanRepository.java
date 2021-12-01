package com.bookp.loans.repositories;

import com.bookp.loans.models.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository <Loan, String>{


}
