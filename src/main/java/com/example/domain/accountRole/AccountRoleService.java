package com.example.domain.accountRole;

import com.example.domain.account.Account;
import com.example.domain.role.Role;

import java.util.List;

/**
 * Service for mapping roles
 * Created by Jakub Tucek on 14.09.2016.
 */
public interface AccountRoleService {
    int deleteRole(String username, int roleId);

    int addRole(String username, int roleId);

    List<Role> getRoles(String username);

    List<Account> getAccounts(long roleId);
}
