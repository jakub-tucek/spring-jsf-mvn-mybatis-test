package com.example.mapper;

import com.example.domain.account.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Account mapper interface for myBatis
 * Created by Jakub Tucek on 12.09.2016.
 */
public interface AccountMapper {
    void insertAccount(Account account);

    Account findAccount(String username);

    void setEnabledAccount(@Param("username") String username, @Param("enabled") boolean enabled);

    void deleteAccount(String username);

    List<Account> findAllAccounts();
}
