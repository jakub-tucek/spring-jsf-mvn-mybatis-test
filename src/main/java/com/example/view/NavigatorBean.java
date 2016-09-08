package com.example.view;

import com.example.domain.navigator.NavigatorService;
import com.example.domain.navigator.NavigatorServiceExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Backing bean for navigator.
 *
 * Created by Jakub Tucek on 07.09.2016.
 */
@Component
@Scope("session")
public class NavigatorBean {

    private Logger logger = Logger.getLogger(NavigatorBean.class);

    private final NavigatorService navigatorService;

    @Autowired
    public NavigatorBean(NavigatorServiceExample navigatorService) {
        this.navigatorService = navigatorService;
    }

    public String choosePage() {
        String randomPage = navigatorService.getRandomPage();
        logger.debug("Random page to go: " + randomPage);
        return randomPage + "?faces-redirect=true";
    }
}

