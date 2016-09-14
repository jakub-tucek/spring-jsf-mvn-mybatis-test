package com.example.mapper;

import com.example.domain.account.Account;
import com.example.domain.role.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Mybatis implementation of account-role service
 * Created by Jakub Tucek on 14.09.2016.
 */
public interface AccountRoleServiceMyBatisExample {

    int deleteRole(@Param("username") String username, @Param("roleId") int roleId);

    int addRole(@Param("username") String username, @Param("roleId") int roleId);

    List<Role> getRoles(String username);

    List<Account> getAccounts(long roleId);
}
