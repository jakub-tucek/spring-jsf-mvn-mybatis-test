package com.example.mapper;

import com.example.domain.account.Account;
import com.example.domain.accountRole.AccountRoleService;
import com.example.domain.role.Role;

import java.util.List;

/**
 * Mybatis implementation of account-role service, will be injected directly to bean thanks to
 * extending AccountRoleService
 * Created by Jakub Tucek on 14.09.2016.
 */
public interface AccountRoleMapper extends AccountRoleService {

    @Override
    int deleteRole(String username, int roleId);

    @Override
    int addRole(String username, int roleId);

    @Override
    List<Role> getRoles(String username);

    @Override
    List<Account> getAccounts(long roleId);
}
