package com.example.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account extends BaseEntity {

    @Column(name = "customer_id")

    private Long customerId;

    @Id
    @Column(name = "account_number")
    private Long accountNumber;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "brand_address")
    private String brandAddress;

    public Account() {
    }

    public Account(Long customerId, Long accountNumber, String accountType, String brandAddress) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.brandAddress = brandAddress;
    }

    public Long getCustomerId() {
        return customerId;
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

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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
        return "Account{" +
                "customerId=" + customerId +
                ", accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", brandAddress='" + brandAddress + '\'' +
                '}';
    }
}
