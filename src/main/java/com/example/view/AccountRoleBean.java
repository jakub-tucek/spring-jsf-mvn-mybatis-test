package com.example.view;

import com.example.domain.role.Role;
import com.example.mapper.AccountRoleServiceMyBatisExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Account - role bean
 * Created by Jakub Tucek on 14.09.2016.
 */
@Component
public class AccountRoleBean {

    private final static Logger logger = Logger.getLogger(AccountRoleBean.class);
    private final AccountRoleServiceMyBatisExample accountRoleService;

    @Autowired
    public AccountRoleBean(AccountRoleServiceMyBatisExample accountRoleService) {
        this.accountRoleService = accountRoleService;
    }

    public Map<String, List<Role>> getRoles() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();

        String username = request.getParameter("username");
        logger.info("Parameter username: " + username);

        if (username == null) {
            return new HashMap<>();
        } else {
            return new HashMap<String, List<Role>>() {
                {
                    put(username, accountRoleService.getRoles(username));
                }

            };
        }
    }
}
