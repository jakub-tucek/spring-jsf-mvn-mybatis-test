package com.example.domain.account;

/**
 * Account entity.
 * <p>
 * Created by Jakub Tucek on 08.09.2016.
 */
public class Account {

    private String username;

    private String email;

    private String password;

    private boolean isEnabled;

    public Account() {
    }

    public Account(String username, String email, String password, boolean isEnabled) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isEnabled = isEnabled;
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
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
