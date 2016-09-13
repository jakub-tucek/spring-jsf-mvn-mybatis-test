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
@Qualifier("accServiceExample")
public class AccountServiceExample implements AccountService {

    private final Map<String, Account> accounts;

    public AccountServiceExample() {
        accounts = new HashMap<>();
        saveAccount(new Account("james", "email@email.com", "password", true));
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
