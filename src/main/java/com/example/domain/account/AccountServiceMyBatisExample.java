package com.example.domain.account;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Example account service working with hardcoded values.
 * <p>
 * Created by Jakub Tucek on 08.09.2016.
 */
@Service
@Qualifier("accServiceMyBatisExample")
public class AccountServiceMyBatisExample implements AccountService {

    private Map<String, Account> accounts;

    public AccountServiceMyBatisExample() {
        accounts = new HashMap<>();
        saveAccount(new Account("asdasdasd", "asdasd@emasdasdail.com", "aaaaaaaaa", true));
    }

    @Override
    public Optional<Account> findAccount(String username) {
        if (username == null) return null;
        return Optional.ofNullable(accounts.get(username));
    }

    @Override
    public void saveAccount(Account account) {
        accounts.put(account.getUsername(), account);
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
        return new ArrayList<>(accounts.values());
    }
}
