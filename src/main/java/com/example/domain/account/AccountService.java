package com.example.domain.account;

import java.util.Optional;

/**
 * Account service interface with example methods.
 * <p>
 * Created by Jakub Tucek on 08.09.2016.
 */
public interface AccountService {

    Optional<Account> findAccount(String username);

    void saveAccount(Account account);

    void enableAccount(String username);

    void disableAccount(String username);

    void deleteAccount(String username);

}
