package com.example.view;

import com.example.domain.navigator.NavigatorService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Backing bean for navigator.
 * <p>
 * Created by Jakub Tucek on 07.09.2016.
 */
@Component
@Scope("session")
public class NavigatorBean {

    private final NavigatorService navigatorService;
    private Logger logger = Logger.getLogger(NavigatorBean.class);

    @Autowired
    public NavigatorBean(NavigatorService navigatorService) {
        this.navigatorService = navigatorService;
    }

    public String choosePage() {
        String randomPage = navigatorService.getRandomPage();
        logger.debug("Random page to go: " + randomPage);
        return randomPage + "?faces-redirect=true";
    }
}

