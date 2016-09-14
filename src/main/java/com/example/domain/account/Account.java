package com.example.domain.account;

import com.example.domain.role.Role;

import java.util.List;

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

    private List<Role> roles;

    private boolean active;

    public Account() {
    }

    public Account(String username, String email, String password, boolean isEnabled, List<Role> roles, boolean active) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isEnabled = isEnabled;
        this.roles = roles;
        this.active = active;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isEnabled=" + isEnabled +
                ", roles=" + roles +
                ", active=" + active +
                '}';
    }
}
