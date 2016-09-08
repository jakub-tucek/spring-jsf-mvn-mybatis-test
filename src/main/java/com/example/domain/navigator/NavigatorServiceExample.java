package com.example.domain.navigator;

import org.springframework.stereotype.Service;

/**
 * Created by Jakub Tucek on 07.09.2016.
 */
@Service
public class NavigatorServiceExample implements NavigatorService {
    @Override
    public String getRandomPage() {
        if (Math.random() > 0.5) {
            return "pages/random-pages/random-page1?faces-redirect=true ";
        } else {
            return "pages/random-pages/random-page2?faces-redirect=true ";
        }
    }
}
