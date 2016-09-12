package com.example.mapper;

import com.example.domain.account.Account;

/**
 * Interface for account mapping. Defined by xml.
 * Created by Jakub Tucek on 12.09.2016.
 */
public interface AccountMapper {
    void insertAccount(Account account);
}
