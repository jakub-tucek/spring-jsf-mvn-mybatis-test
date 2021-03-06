package com.example.view;

import com.example.domain.account.Account;
import com.example.domain.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Account backing bean for example look up service.
 * <p>
 * Created by Jakub Tucek on 08.09.2016.
 */
@Component
@Scope("session")
public class AccountBean {
    private final AccountService accountService;
    private String username, email, password;
    private boolean enabled;

    @Autowired
    public AccountBean(@Qualifier("accServiceMyBatisExample") AccountService accountService) {
        this.accountService = accountService;
    }


    public String findUser() {
        String error = "/pages/account/account-error";
        String found = "/pages/account/account-found";

        if (username != null) {
            Optional<Account> foundAcc = accountService.findAccount(username);

            return foundAcc.map((account) -> {
                setAccountBeanAttributes(account);
                return found;
            }).orElse(error);
        } else {
            return error;
        }
    }

    @SuppressWarnings("SameReturnValue")
    public String saveUser() {
        accountService.saveAccount(new Account(username, email, password, true, null, true));

        clearSession();
        return "/pages/account/account-show?faces=redirect=true";
    }


    public List<Account> getAccounts() {
        return accountService.findAll();
    }


    private void setAccountBeanAttributes(Account account) {
        setUsername(account.getUsername());
        setEmail(account.getPassword());
        setPassword("____________");
        setEnabled(account.isEnabled());
    }

    private void clearSession() {
        username = "";
        password = "";
        email = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
