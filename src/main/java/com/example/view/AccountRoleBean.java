package com.example.view;

import com.example.domain.account.Account;
import com.example.domain.account.AccountService;
import com.example.domain.accountrole.AccountRoleService;
import com.example.domain.page.Page;
import com.example.domain.role.Role;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Account - role bean
 * Created by Jakub Tucek on 14.09.2016.
 */
@Component
@ViewScoped
public class AccountRoleBean {

    private final static Logger logger = Logger.getLogger(AccountRoleBean.class);
    private final AccountRoleService accountRoleService;

    private final AccountService accountService;

    private String username;

    private List<Role> roles;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    public AccountRoleBean(AccountRoleService accountRoleService,
                           @Qualifier("accServiceMyBatisExample") AccountService accountService) {
        this.accountRoleService = accountRoleService;
        this.accountService = accountService;
    }

    public String findRoles() {
        logger.info("finding roles");

        roles = accountRoleService.getRoles(username);

        return "result";
    }


    public List<Role> getRoles() {
        return roles;
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
        String username = getParamUsername();
        logger.info("Validating parameter: " + username);

        if (username == null || username.equals("") || !accountService.findAccount(username).isPresent()) {
            logger.info("Invalid parameter");
            try {
                FacesContext facesContext = FacesContext.getCurrentInstance();
                ExternalContext externalContext = facesContext.getExternalContext();
                externalContext.setResponseStatus(HttpServletResponse.SC_NOT_FOUND);
                externalContext.dispatch("/pages/account/account-roles");
                facesContext.responseComplete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
