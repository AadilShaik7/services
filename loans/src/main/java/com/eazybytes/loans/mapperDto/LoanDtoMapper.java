package com.eazybytes.loans.mapperDto;

import com.eazybytes.loans.dto.LoanDto;
import com.eazybytes.loans.entity.Loans;

import java.time.LocalDate;

public class LoanDtoMapper {

    public static Loans mapLoanDtoToLoans(LoanDto loanDto) {
        Loans loans= new Loans();
        loans.setLoanNumber(loanDto.getLoanNumber());
        loans.setLoanType(loanDto.getLoanType());
        loans.setTotalLoan(loanDto.getTotalLoan());
        loans.setMobileNumber(loanDto.getMobileNumber());
        loans.setAmountPaid(loanDto.getAmountPaid());
        loans.setOutstandingAmount(loanDto.getTotalLoan());
        return  loans;
    }

    public static LoanDto mapLoansToLoanDto(Loans loanDto) {
        LoanDto loans= new LoanDto();
        loans.setLoanNumber(loanDto.getLoanNumber());
        loans.setLoanType(loanDto.getLoanType());
        loans.setTotalLoan(loanDto.getTotalLoan());
        loans.setMobileNumber(loanDto.getMobileNumber());
        loans.setAmountPaid(0);
        loans.setOutstandingAmount(loanDto.getTotalLoan());
        return  loans;
    }

}
