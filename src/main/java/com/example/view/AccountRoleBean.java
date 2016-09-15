package com.example.view;

import com.example.domain.accountrole.AccountRoleService;
import com.example.domain.role.Role;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Account - role bean
 * Created by Jakub Tucek on 14.09.2016.
 */
@Component
public class AccountRoleBean {

    private final static Logger logger = Logger.getLogger(AccountRoleBean.class);
    private final AccountRoleService accountRoleService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    public AccountRoleBean(AccountRoleService accountRoleService) {
        this.accountRoleService = accountRoleService;
    }


    public List<Role> getRoles() {
        String username = getParamUsername();
        logger.info("Param requested is: " + username);
        if (username == null) {
            return null;
        } else {
            return accountRoleService.getRoles(username);
        }
    }

    public String getParamUsername() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();

        return request.getParameter("username");
    }
}
