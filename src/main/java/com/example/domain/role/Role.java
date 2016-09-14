package com.example.domain.role;

import com.example.domain.account.Account;

import java.util.List;

/**
 * Entity role
 * Created by Jakub Tucek on 14.09.2016.
 */
public class Role {

    private int id;

    private String roleName;

    private List<Account> users;

    private boolean active;

    public Role() {
    }

    public Role(int id, String roleName, List<Account> users, boolean active) {
        this.id = id;
        this.roleName = roleName;
        this.users = users;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Account> getUsers() {
        return users;
    }

    public void setUsers(List<Account> users) {
        this.users = users;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", users=" + users +
                ", active=" + active +
                '}';
    }
}
