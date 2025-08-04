package com.example.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;


public class AccountDto {
    @NotNull(message = "Account number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;
    @NotEmpty(message = "Account type can not be a null or empty")
    private String accountType;
    @NotEmpty(message = "Brand address can not be a null or empty")
    private String brandAddress;

    public AccountDto() {
    }

    public AccountDto(Long accountNumber, String accountType, String brandAddress) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.brandAddress = brandAddress;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getBrandAddress() {
        return brandAddress;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBrandAddress(String brandAddress) {
        this.brandAddress = brandAddress;
    }
    @Override
    public String toString() {
        return "AccountDto{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", brandAddress='" + brandAddress + '\'' +
                '}';
    }
}
