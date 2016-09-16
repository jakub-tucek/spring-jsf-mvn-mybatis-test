package com.example.view;

import com.example.domain.accountrole.AccountRoleService;
import com.example.domain.role.Role;
import com.example.utils.FacesUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Account - role bean
 * Created by Jakub Tucek on 14.09.2016.
 */
@Component
public class AccountRoleBean {

    private final static Logger logger = Logger.getLogger(AccountRoleBean.class);
    private final AccountRoleService accountRoleService;

    private String username;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    public AccountRoleBean(AccountRoleService accountRoleService) {
        this.accountRoleService = accountRoleService;
    }


    public List<Role> getRoles() {
        String username = getParamUsername();
        logger.info("Roles for username requested: " + username);

        return accountRoleService.getRoles(username);

    }

    public String getParamUsername() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();

        return request.getParameter("username");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        logger.info("Setting up username: " + username);
        this.username = username;
    }

    public void paramValidator(FacesContext context, UIComponent component, Object object) {
        logger.info("Validation parameter");

        if (getParamUsername() == null) {
            context.getExternalContext().setResponseStatus(404);
            context.responseComplete();
        }
    }
}
