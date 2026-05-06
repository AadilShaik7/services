package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoanDto;
import com.eazybytes.loans.entity.Loans;
import com.eazybytes.loans.mapperDto.LoanDtoMapper;
import com.eazybytes.loans.repository.LoansRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class LoanService {

    private LoansRepo loansRepo;

    public void save(LoanDto loan) {
        Loans loans = LoanDtoMapper.mapLoanDtoToLoans(loan);
        loansRepo.save(loans);
    }

}
