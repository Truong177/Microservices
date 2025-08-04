package com.example.accounts.mapper;

import com.example.accounts.dto.AccountDto;
import com.example.accounts.entity.Account;

public class AccountsMapper {
    public static AccountDto mapToACcountDto(Account account, AccountDto accountDto){
        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setAccountType(account.getAccountType());
        accountDto.setBrandAddress(account.getBrandAddress());
        return accountDto;
    }
    public static Account mapToAccount(AccountDto accountDto,Account account){
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setAccountType(accountDto.getAccountType());
        account.setBrandAddress(accountDto.getBrandAddress());
        return account;
    }
}
