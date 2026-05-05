package com.eazybytes.accounts.dto;

import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
public class CustomerDto {

    private String name;

    private String email;

    private String mobileNumber;

}
