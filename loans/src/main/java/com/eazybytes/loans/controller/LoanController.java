package com.eazybytes.loans.controller;

import com.eazybytes.loans.dto.LoanDto;
import com.eazybytes.loans.service.LoanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/loans")
@AllArgsConstructor
public class LoanController {

    private LoanService loanService;

    @PutMapping("/save")
    public void save(@RequestBody LoanDto loan) {
       loanService.save(loan);
    }

}
