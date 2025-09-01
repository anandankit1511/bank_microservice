package com.code.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "accountNumber can't be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account Number must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "accountType can't be null or empty")
    private String accountType;

    @NotEmpty(message = "branchAddress can't be null or empty")
    private String branchAddress;
}
