package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty
    private Long accountNumber;

    private String accountType;

    private String branchAddress;



}
