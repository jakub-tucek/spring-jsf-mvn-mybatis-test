package com.example.domain.account;


import com.example.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Example account service working with hardcoded values.
 * <p>
 * Created by Jakub Tucek on 08.09.2016.
 */
@Service
@Qualifier("accServiceMyBatisExample")
public class AccountServiceMyBatisExample implements AccountService {

    private final AccountMapper accountMapper;

    @Autowired
    public AccountServiceMyBatisExample(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public Optional<Account> findAccount(String username) {
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        accountMapper.insertAccount(account);
    }

    @Override
    public void enableAccount(String username) {
        //TO DO
    }

    @Override
    public void disableAccount(String username) {
        //TO DO
    }

    @Override
    public void deleteAccount(String username) {
        //TO DO
    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
